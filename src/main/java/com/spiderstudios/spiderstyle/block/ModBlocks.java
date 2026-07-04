package com.spiderstudios.spiderstyle.block;

import com.spiderstudios.spiderstyle.SpiderStyle;
import com.spiderstudios.spiderstyle.block.crop.CottonCropBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModBlocks {

    public static final Block TEST_BLOCK = Registry.register(
            BuiltInRegistries.BLOCK,
            SpiderStyle.id("test_block"),
            new Block(Block.Properties.ofFullCopy(Blocks.STONE))
    );
    public static final Block COTTON_CROP = Registry.register(
            BuiltInRegistries.BLOCK,
            SpiderStyle.id("cotton_crop"),
            new CottonCropBlock(Block.Properties.ofFullCopy(Blocks.WHEAT))
    );
    public static void register() {
        SpiderStyle.LOGGER.info("Registering SpiderStyle Blocks...");
    }
}