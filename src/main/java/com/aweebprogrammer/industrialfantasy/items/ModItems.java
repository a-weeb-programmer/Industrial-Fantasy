package com.aweebprogrammer.industrialfantasy.items;

import com.aweebprogrammer.industrialfantasy.tabs.IFItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> item_list = new ArrayList();

    ////////////////////////////////////////////////////////////// Items /////////////////////////////////////////////////////////////////////////////////////////
    public static Item MAGIC_ENERGIZER;
    public static void init(){
        MAGIC_ENERGIZER = new MagicEnergizer(new Item.Properties().tab(items), "magic_energizer");
        System.out.println(MAGIC_ENERGIZER.getRegistryName());
    }
    public static CreativeModeTab items = new IFItems("IF Items");
}

