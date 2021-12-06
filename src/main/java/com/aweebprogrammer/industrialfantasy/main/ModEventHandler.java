package com.aweebprogrammer.industrialfantasy.main;

import com.aweebprogrammer.industrialfantasy.blocks.IFBlock;
import com.aweebprogrammer.industrialfantasy.blocks.ModBlocks;
import com.aweebprogrammer.industrialfantasy.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus =  Mod.EventBusSubscriber.Bus.MOD)
public class ModEventHandler {
    public static void clientSetup(FMLClientSetupEvent event){

    }
    public static void commonSetup(FMLCommonSetupEvent event){

    }
    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event){
        for(Item o : ModItems.item_list){
            event.getRegistry().register(o);
        }
        for(Block o : ModBlocks.block_list){
            event.getRegistry().register(new BlockItem(o, new Item.Properties().tab(((IFBlock)o).getCreativeTab())).setRegistryName(o.getRegistryName()));
        }
    }
    @SubscribeEvent
    public static void blockRegister(RegistryEvent.Register<Block> event){
        for(Block o : ModBlocks.block_list){
            event.getRegistry().register(o);
        }
    }
}
