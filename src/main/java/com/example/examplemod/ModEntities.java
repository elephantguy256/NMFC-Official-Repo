package com.example.examplemod;


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
   EntityRegistry.registerModEntity(new ResourceLocation(ExampleMod.MODID, "de1"), EntityGuineaPig.class, "Guinea Pig", id++, ExampleMod.instance, 64, 3, true, 0x996600, 0x00ff00);
   EntityRegistry.registerModEntity(new ResourceLocation(ExampleMod.MODID, "de2"), EntityChinchilla.class, "Chinchilla", id++, ExampleMod.instance, 64, 3, true, 0x996600, 0x00ff00);
   
    }
    
    

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        //put mobs registry here,, replace entity, render, and model with the model, render, and entity classes of the desired entity.
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        // RenderingRegistry.registerEntityRenderingHandler(Entity.class, new Render(renderManager, new Model(), 0.5F)); // 0.5F is shadow size 
    }
}