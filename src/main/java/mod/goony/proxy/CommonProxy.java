package mod.goony.proxy;

import mod.goony.NMFC;
import mod.goony.RegistryHandler;
import mod.goony.client.model.ModelChinchilla;
import mod.goony.client.model.ModelGuineaPig;
import mod.goony.client.render.RenderChinchilla;
import mod.goony.client.render.RenderGuineaPig;
import mod.goony.entity.EntityChinchilla;
import mod.goony.entity.EntityGuineaPig;
import mod.goony.init.ModBlocks;
import mod.goony.init.ModEntities;
import mod.goony.init.ModItems;
import mod.goony.sounds.SoundEvents2;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
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
		System.out.println(NMFC.MODID + ":preInit");
		ModBlocks.init();
		ModItems.init();
        ModEntities.init();
		RegistryHandler.preInitRegistries();
		SoundEvents2.registerSounds();
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
    
    @SubscribeEvent
    public void registerBiome(RegistryEvent.Register<Biome> event) {
        event.getRegistry().registerAll();
        	
        }


    
    public void registerRenders(){}

	public void registerVariantRenderer(Item itemFromBlock, int i, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}