package com.harleyadams.mcbots;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "MCBots";
    public static final String MODNAME = "Harley's MCBots";
    public static final String VERSION = "1.0";
    
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="com.harleyadams.mcbots.ClientProxy", serverSide="com.harleyadams.mcbots.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	this.proxy.preInit(event);
    	ItemStack dirtStack = new ItemStack(Block.getBlockFromName("dirt"));
//    	ItemStack gravelStack = new ItemStack(Block.gravel);
//    	ItemStack cobbleStack = new ItemStack(Block.cobblestone);
//
//    	GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond,64,
//    	    dirtStack ,dirtStack ,dirtStack ,
//    	    dirtStack ,dirtStack ,dirtStack ,
//    	    new ItemStack(Block.sand),gravelStack,cobbleStack);
//    	);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	this.proxy.postInit(event);
    }
}
