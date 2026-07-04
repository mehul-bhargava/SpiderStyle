package com.spiderstudios.spiderstyle;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import com.spiderstudios.spiderstyle.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpiderStyle implements ModInitializer {
	public static final String MOD_ID = "spiderstyle";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.register();

		LOGGER.info("Hello Fabric world!");
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}
