package com.example.examplemod.proxy;

import com.example.examplemod.EntityAlpaca;
import com.example.examplemod.EntityChinchilla;
import com.example.examplemod.EntityGuineaPig;
import com.example.examplemod.EntityVicuna;
import com.example.examplemod.ModelAlpaca;
import com.example.examplemod.ModelChinchilla;
import com.example.examplemod.ModelGuineaPig;
import com.example.examplemod.ModelVicuna;
import com.example.examplemod.RenderAlpaca;
import com.example.examplemod.RenderChinchilla;
import com.example.examplemod.RenderGuineaPig;
import com.example.examplemod.RenderVicuna;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

//Press Ctrl+Shift+O in Eclipse for the imports.
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }
    
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(NMFC.MODID + ":" + id, "inventory"));
    }	

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    }

    
    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
	
    }	
    
    public void registerRenders(){
    	RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
    	RenderingRegistry.registerEntityRenderingHandler(EntityChinchilla.class, new RenderChinchilla(renderManager, new ModelChinchilla(), 0.5F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityGuineaPig.class, new RenderGuineaPig(renderManager, new ModelGuineaPig(), 0.5F));  
        RenderingRegistry.registerEntityRenderingHandler(EntityVicuna.class, new RenderVicuna(renderManager, new ModelVicuna(), 0.5F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityAlpaca.class, new RenderAlpaca(renderManager, new ModelAlpaca(), 0.7F)); 
        }
}


    
	
