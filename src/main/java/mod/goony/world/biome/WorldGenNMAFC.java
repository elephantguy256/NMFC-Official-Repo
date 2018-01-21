package mod.goony.world.biome;

import mod.goony.init.ModBiomes;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldGenNMAFC extends WorldType
{
	public WorldGenNMAFC() 
	{
		super("Copper");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) 
	{
		return new BiomeProviderSingle(ModBiomes.PATAGONIA);
	}
}