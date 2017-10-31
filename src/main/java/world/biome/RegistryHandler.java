package world.biome;

import init.ModBiomes;
import init.ModBlocks;
import init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		ModItems.init();
		}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		ModBlocks.init();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		
	}
	
	public static void preInitRegistries()
	{
		
		ModBiomes.registerBiomes();
	}
	
	public static void postInitRegistries()
	{
		WorldType PATAGONIA = new WorldGenNMAFC();

	}
}