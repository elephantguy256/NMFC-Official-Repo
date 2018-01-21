package mod.goony.world.biome;

import mod.goony.entity.EntityAlpaca;
import mod.goony.entity.EntityAndeanGoose;
import mod.goony.entity.EntityPampasFox;
import mod.goony.entity.EntityPuma;
import mod.goony.entity.EntityVicuna;
import mod.goony.init.ModBlocks;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.world.biome.Biome;

public class BiomePatagonia extends Biome 
{
	private NMFCBiomeDecorator thedecorator;

	public BiomePatagonia() 
	{
		super(new BiomeProperties("Patagonia").setTemperature(0.8F).setRainfall(0.6F).setWaterColor(3120543).setBaseHeight(0.01F).setHeightVariation(0.02F));
		
		this.thedecorator = new NMFCBiomeDecorator();
		topBlock = ModBlocks.patagoniangrass.getDefaultState();
		fillerBlock = ModBlocks.patagoniandirt.getDefaultState();
		
		this.thedecorator.flowersPerChunk = -600;
		this.thedecorator.grassPerChunk = -700;
		this.thedecorator.pgrassperchunk = -700;
		this.thedecorator.shrubperchunk = 700;
		this.thedecorator.lupineperchunk = 700;

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		this.thedecorator.generateFalls = false;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityVicuna.class, 20, 5, 15));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityAlpaca.class, 15, 3, 12));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityLlama.class, 6, 3, 12));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPuma.class, 9, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityAndeanGoose.class, 10, 8, 15));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPampasFox.class, 8, 1, 1));
				
	}
}