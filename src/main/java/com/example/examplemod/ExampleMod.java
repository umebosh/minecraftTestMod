package com.example.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static Block blockSample;
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block, 64),
                "X", "X", "X",
                'X', Blocks.dirt);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        blockSample = new SampleBlock();

        GameRegistry.registerBlock(blockSample, "blockSample");


    }
}
