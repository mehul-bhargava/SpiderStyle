package com.spiderstudios.spiderstyle.registry;
import com.spiderstudios.spiderstyle.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import com.spiderstudios.spiderstyle.SpiderStyle;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final Item COTTON_FIBER = Registry.register(
            BuiltInRegistries.ITEM,
            SpiderStyle.id("cotton_fiber"),
            new Item(new Item.Properties())
    );
    public static final Item COTTON_SEEDS = Registry.register(
            BuiltInRegistries.ITEM,
            SpiderStyle.id("cotton_seeds"),
            new Item(new Item.Properties())
    );
    public static final BlockItem TEST_BLOCK = Registry.register(
            BuiltInRegistries.ITEM,
            SpiderStyle.id("test_block"),
            new BlockItem(ModBlocks.TEST_BLOCK, new Item.Properties())
    );

    public static void register() {

        SpiderStyle.LOGGER.info("Registering SpiderStyle Items...");

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register(entries -> {
                    entries.accept(COTTON_FIBER);
                    entries.accept(COTTON_SEEDS);
                    entries.accept(TEST_BLOCK);
                });
    }
}