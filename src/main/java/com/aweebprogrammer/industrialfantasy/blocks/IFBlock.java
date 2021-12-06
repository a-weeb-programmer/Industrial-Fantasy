package com.aweebprogrammer.industrialfantasy.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class IFBlock extends Block {
    private CreativeModeTab tab;
    public IFBlock(Properties prop, String name){
        super(prop);
        setRegistryName(name);
        ModBlocks.block_list.add(this);
    }
    public IFBlock setCreativeTab(CreativeModeTab tab){
        this.tab = tab;
        return this;
    }
    public CreativeModeTab getCreativeTab(){
        if(this.tab != null){
            return tab;
        }
        return null;
    }
}
