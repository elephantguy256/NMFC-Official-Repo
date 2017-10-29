package com.example.examplemod.proxy;

import com.example.examplemod.entity.EntityAlpaca;
import com.example.examplemod.entity.EntityAndeanGoose;
import com.example.examplemod.entity.EntityChinchilla;
import com.example.examplemod.entity.EntityGuineaPig;
import com.example.examplemod.entity.EntityPampasFox;
import com.example.examplemod.entity.EntityPuma;
import com.example.examplemod.entity.EntityVicuna;
import com.example.examplemod.model.ModelAlpaca;
import com.example.examplemod.model.ModelAndeanGoose;
import com.example.examplemod.model.ModelAndeanGosling;
import com.example.examplemod.model.ModelChinchilla;
import com.example.examplemod.model.ModelGuineaPig;
import com.example.examplemod.model.ModelPampasFox;
import com.example.examplemod.model.ModelPuma;
import com.example.examplemod.model.ModelVicuna;
import com.example.examplemod.render.RenderAlpaca;
import com.example.examplemod.render.RenderAndeanGoose;
import com.example.examplemod.render.RenderChinchilla;
import com.example.examplemod.render.RenderGuineaPig;
import com.example.examplemod.render.RenderPampasFox;
import com.example.examplemod.render.RenderPuma;
import com.example.examplemod.render.RenderVicuna;

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
		RenderingRegistry.registerEntityRenderingHandler(EntityPuma.class, new RenderPuma(renderManager, new ModelPuma(), 0.5F)); 
    	RenderingRegistry.registerEntityRenderingHandler(EntityChinchilla.class, new RenderChinchilla(renderManager, new ModelChinchilla(), 0.5F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityGuineaPig.class, new RenderGuineaPig(renderManager, new ModelGuineaPig(), 0.5F));  
        RenderingRegistry.registerEntityRenderingHandler(EntityVicuna.class, new RenderVicuna(renderManager, new ModelVicuna(), 0.5f)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityAlpaca.class, new RenderAlpaca(renderManager, new ModelAlpaca(), 0.7F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityPampasFox.class, new RenderPampasFox(renderManager, new ModelPampasFox(), 0.7F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityAndeanGoose.class, new RenderAndeanGoose(renderManager, new ModelAndeanGoose(), 0.7F)); 
        
        
        }
}


    
	
