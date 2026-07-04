package com.spiderstudios.spiderstyle.block.crop;

import com.mojang.serialization.MapCodec;
import com.spiderstudios.spiderstyle.registry.ModItems;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class CottonCropBlock extends CropBlock {

    public CottonCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<? extends CropBlock> codec() {
        return super.codec();
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.COTTON_SEEDS;
    }
}