package com.aweebprogrammer.industrialfantasy.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.aweebprogrammer.industrialfantasy.items.ModItems;
import com.aweebprogrammer.industrialfantasy.blocks.ModBlocks;

@Mod("industrialfantasy")
public class IndustrialFantasy {
    public IndustrialFantasy(){
        ModItems.init();
        ModBlocks.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModEventHandler::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModEventHandler::commonSetup);
    }
}
