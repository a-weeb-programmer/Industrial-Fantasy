package com.aweebprogrammer.industrialfantasy.items;

import net.minecraft.world.item.Item;

public class IFItem extends Item{
    public IFItem(Item.Properties prop, String name) {
        super(prop);
        ModItems.item_list.add(this);
        setRegistryName(name);
    }
}
