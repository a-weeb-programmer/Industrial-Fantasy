package com.aweebprogrammer.industrialfantasy.blocks;

import com.aweebprogrammer.industrialfantasy.items.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static List<Block> block_list = new ArrayList<>();

    public static Block BLUE_GRASS;
    public static void init(){
        BLUE_GRASS = new IFBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS).strength(3.0F), "blue_grass").setCreativeTab(ModItems.items);
    }
}