package mod.goony;

import mod.goony.init.ModBiomes;
import mod.goony.world.biome.WorldGenNMAFC;
import mod.goony.world.biome.WorldGeneratorNMFAFCB;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	
	public static void initRegistries() {
		GameRegistry.registerWorldGenerator(new WorldGeneratorNMFAFCB(), 10);
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