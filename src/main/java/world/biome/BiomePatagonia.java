package world.biome;

import com.example.examplemod.entity.EntityAlpaca;
import com.example.examplemod.entity.EntityAndeanGoose;
import com.example.examplemod.entity.EntityChinchilla;
import com.example.examplemod.entity.EntityGuineaPig;
import com.example.examplemod.entity.EntityPampasFox;
import com.example.examplemod.entity.EntityPuma;
import com.example.examplemod.entity.EntityVicuna;

import init.ModBlocks;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.world.biome.Biome;

public class BiomePatagonia extends Biome 
{

	public BiomePatagonia() 
	{
		super(new BiomeProperties("Patagonia").setBaseBiome("savanna_rock").setTemperature(0.05F).setRainfall(0.6F).setSnowEnabled().setWaterColor(3120543).setBaseHeight(1.5f));
		
		topBlock = ModBlocks.patagoniangrass.getDefaultState();
		fillerBlock = ModBlocks.patagoniandirt.getDefaultState();
		
		this.decorator.deadBushPerChunk = 2;
		this.decorator.treesPerChunk = 1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityVicuna.class, 10, 5, 15));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityAlpaca.class, 7, 3, 12));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityLlama.class, 5, 3, 12));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPuma.class, 3, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityAndeanGoose.class, 10, 8, 26));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPampasFox.class, 4, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityGuineaPig.class, 5, 3, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityChinchilla.class, 5, 3, 6));
				
	}
	
}
