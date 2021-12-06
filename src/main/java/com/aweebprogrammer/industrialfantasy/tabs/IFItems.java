package com.aweebprogrammer.industrialfantasy.tabs;

import com.aweebprogrammer.industrialfantasy.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IFItems extends CreativeModeTab {
    public IFItems(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.MAGIC_ENERGIZER);
    }
}
