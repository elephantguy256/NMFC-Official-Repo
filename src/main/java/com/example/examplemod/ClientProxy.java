package com.example.examplemod;

import com.dabigjoe.obsidianAPI.network.AnimationNetworkHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {


        ModEntities.initModels();
        }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        SoundEvents2.registerSounds();
        AnimationNetworkHandler.init();
    }
    
    
	public void registerRenders() {
		// TODO Auto-generated method stub
		RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
	    RenderingRegistry.registerEntityRenderingHandler(EntityGuineaPig.class, new RenderGuineaPig(Minecraft.getMinecraft().getRenderManager(), new ModelGuineaPig(), 1.0F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityChinchilla.class, new RenderChinchilla(Minecraft.getMinecraft().getRenderManager(), new ModelChinchilla(), 1.0F));
	    
	}
}