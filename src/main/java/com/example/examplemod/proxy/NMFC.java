package com.example.examplemod.proxy;

import com.dabigjoe.obsidianOverhaul.ModEntities;

import init.ModBlocks;
import init.ModItems;
import init.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NMFC.MODID, name = NMFC.MODNAME, version = NMFC.MODVERSION)
public class NMFC {
	
    public static final String MODID = "de";

    public static final String MODNAME = "Nature Makes a Fowl Comeback Mod";

    public static final String MODVERSION = "1.0.0";
    
	@SidedProxy(clientSide="com.example.examplemod.proxy.ClientProxy", serverSide="com.example.examplemod.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static NMFC instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NMFC.MODID + ":preInit");
		ModItems.init();
		ModBlocks.init();
        ModEntities.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(NMFC.MODID + ":init");
		ModRecipes.init();
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(NMFC.MODID + ":postInit");
	}
	
}
