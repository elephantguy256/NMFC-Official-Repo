package mod.goony.proxy;

import mod.goony.NMFC;
import mod.goony.RegistryHandler;
import mod.goony.client.model.ModelAlpaca;
import mod.goony.client.model.ModelAndeanGoose;
import mod.goony.client.model.ModelBumbleBeeToad;
import mod.goony.client.model.ModelGuineaPig;
import mod.goony.client.model.ModelLlama2;
import mod.goony.client.model.ModelPampasFox;
import mod.goony.client.model.ModelPatagonianMara;
import mod.goony.client.model.ModelPuma;
import mod.goony.client.model.ModelVicuna;
import mod.goony.client.model.ModelViscacha;
import mod.goony.client.render.EntityBumbleBeeToad;
import mod.goony.client.render.RenderAlpaca;
import mod.goony.client.render.RenderAndeanGoose;
import mod.goony.client.render.RenderBumbleBeeToad;
import mod.goony.client.render.RenderChinchilla;
import mod.goony.client.render.RenderGuineaPig;
import mod.goony.client.render.RenderLlama2;
import mod.goony.client.render.RenderPampasFox;
import mod.goony.client.render.RenderPatagonianMara;
import mod.goony.client.render.RenderPuma;
import mod.goony.client.render.RenderVicuna;
import mod.goony.client.render.RenderViscacha;
import mod.goony.entity.EntityAlpaca;
import mod.goony.entity.EntityAndeanGoose;
import mod.goony.entity.EntityChinchilla;
import mod.goony.entity.EntityGuineaPig;
import mod.goony.entity.EntityPampasFox;
import mod.goony.entity.EntityPatagonianMara;
import mod.goony.entity.EntityPuma;
import mod.goony.entity.EntityVicuna;
import mod.goony.entity.EntityViscacha;
import mod.goony.init.ModBlocks;
import mod.goony.init.ModEntities;
import mod.goony.init.ModItems;
import mod.goony.sounds.SoundEvents2;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityLlama;
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
    public void preInit(FMLPreInitializationEvent e) {
		System.out.println(NMFC.MODID + ":preInit");
		ModBlocks.init();
		ModItems.init();
        ModEntities.init();
		RegistryHandler.preInitRegistries();
		SoundEvents2.registerSounds();
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
		RenderingRegistry.registerEntityRenderingHandler(EntityLlama.class, new RenderLlama2(renderManager, new ModelLlama2(), 0.5F)); 
		RenderingRegistry.registerEntityRenderingHandler(EntityPuma.class, new RenderPuma(renderManager, new ModelPuma(), 0.5F)); 
    	RenderingRegistry.registerEntityRenderingHandler(EntityChinchilla.class, new RenderChinchilla()); 
        RenderingRegistry.registerEntityRenderingHandler(EntityGuineaPig.class, new RenderGuineaPig(renderManager, new ModelGuineaPig(), 0.5F));  
        RenderingRegistry.registerEntityRenderingHandler(EntityVicuna.class, new RenderVicuna(renderManager, new ModelVicuna(), 0.5f)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityAlpaca.class, new RenderAlpaca(renderManager, new ModelAlpaca(), 0.7F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityPampasFox.class, new RenderPampasFox(renderManager, new ModelPampasFox(), 0.7F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityAndeanGoose.class, new RenderAndeanGoose(renderManager, new ModelAndeanGoose(), 0.7F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityViscacha.class, new RenderViscacha(renderManager, new ModelViscacha(), 0.7F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityBumbleBeeToad.class, new RenderBumbleBeeToad(renderManager, new ModelBumbleBeeToad(), 0.7F)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityPatagonianMara.class, new RenderPatagonianMara(renderManager, new ModelPatagonianMara(), 0.7F)); 

        }
}


    
	
