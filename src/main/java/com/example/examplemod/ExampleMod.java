package com.example.examplemod;


import com.dabigjoe.obsidianAPI.ObsidianEventHandler;
import com.dabigjoe.obsidianAPI.network.AnimationNetworkHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ExampleMod.MODID, name = ExampleMod.MODNAME, version = ExampleMod.MODVERSION)


public class ExampleMod {

        public static final String MODID = "de";
        public static final String MODNAME = "Nature Makes A Fowl Comeback";
        public static final String MODVERSION = "1.0.0";


    	@SidedProxy(clientSide="com.example.examplemod.ClientProxy", serverSide="com.example.examplemod.ServerProxy")
        public static CommonProxy proxy;

        @Mod.Instance
        public static ExampleMod instance;

        public static org.apache.logging.log4j.Logger logger;

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent e) {
            logger = e.getModLog();
            proxy.preInit(e);
        	ModEntities.init();
        }

        @Mod.EventHandler
        public void init(FMLInitializationEvent e) {
            proxy.init(e);
            proxy.registerRenders();
		    proxy.registerRenders(); 
            SoundEvents2.registerSounds();
            AnimationNetworkHandler.init();
        }

        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent e) {
            proxy.postInit(e);
        }

        public static ExampleMod getInstance(){

        return instance;

        }
        @EventHandler
        public void load(FMLInitializationEvent event) {
            MinecraftForge.EVENT_BUS.register(new ObsidianEventHandler());
        }
}