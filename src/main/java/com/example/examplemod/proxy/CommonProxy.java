package com.example.examplemod.proxy;

import com.example.examplemod.entity.EntityChinchilla;
import com.example.examplemod.entity.EntityGuineaPig;
import com.example.examplemod.model.ModelChinchilla;
import com.example.examplemod.model.ModelGuineaPig;
import com.example.examplemod.render.RenderChinchilla;
import com.example.examplemod.render.RenderGuineaPig;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }
    
    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    }


    
    public void registerRenders(){
    	RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        RenderingRegistry.registerEntityRenderingHandler(EntityChinchilla.class, new RenderChinchilla(renderManager, new ModelChinchilla(), 0.5F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityGuineaPig.class, new RenderGuineaPig(renderManager, new ModelGuineaPig(), 0.5F));     }
}