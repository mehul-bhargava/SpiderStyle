package com.spiderstudios.spiderstyle;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpiderStyle implements ModInitializer {

	public static final String MOD_ID = "spiderstyle";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("SpiderStyle has loaded successfully!");
	}
}