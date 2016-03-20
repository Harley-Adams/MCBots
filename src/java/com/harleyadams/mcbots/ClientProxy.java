package com.harleyadams.mcbots;

import com.harleyadams.mcbots.client.render.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.*;

public class ClientProxy extends CommonProxy{
	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ItemRenderRegister.registerItemRenderer();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
