package com.example.examplemod;


import com.example.examplemod.proxy.NMFC;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // mobs spawn eggs are put here, just replace Entity.class with Entity "Whatever the entity file was"
        int id = 1;
           EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de1"), EntityGuineaPig.class, "Guinea Pig", id++, NMFC.instance, 64, 3, true, 0xff7800, 0xd5a377); 
           EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de2"), EntityChinchilla.class, "Chinchilla", id++, NMFC.instance, 64, 3, true, 0x696969, 0xdcdcdc);      
           EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de3"), EntityVicuna.class, "Vicuna", id++, NMFC.instance, 64, 3, true, 0xCD853F, 0xdfc49f);       
          EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de4"), EntityAlpaca.class, "Alpaca", id++, NMFC.instance, 64, 3, true, 0xE8E8E8, 0xffffff); 
    }
    
    

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        //put mobs registry here,, replace entity, render, and model with the model, render, and entity classes of the desired entity.
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        // RenderingRegistry.registerEntityRenderingHandler(Entity.class, new Render(renderManager, new Model(), 0.5F)); // 0.5F is shadow size 
    }
}