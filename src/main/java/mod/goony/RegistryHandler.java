package mod.goony;

import mod.goony.init.ModBiomes;
import mod.goony.init.ModBlocks;
import mod.goony.init.ModEntities;
import mod.goony.init.ModItems;
import mod.goony.world.biome.WorldGenNMAFC;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.*;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.*;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	
	
	public static void preInitRegistries()
	{
		
		ModBiomes.registerBiomes();
	}
	
	public static void postInitRegistries()
	{
		WorldType PATAGONIA = new WorldGenNMAFC();

	}
}