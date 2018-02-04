package mod.goony.world.biome;

import mod.goony.entity.EntityAlpaca;
import mod.goony.entity.EntityAndeanGoose;
import mod.goony.entity.EntityPampasFox;
import mod.goony.entity.EntityPuma;
import mod.goony.entity.EntityVicuna;
import mod.goony.init.ModBlocks;
import mod.goony.world.gen.WorldGenLupine;
import mod.goony.world.gen.WorldGenPatagonianGrass;
import mod.goony.world.gen.WorldGenPatagonianShrub;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomePatagonia extends Biome 
{

	public BiomePatagonia() 
	{
		super(new BiomeProperties("Patagonia").setTemperature(0.8F).setRainfall(0.6F).setWaterColor(3120543).setBaseHeight(0.01F).setHeightVariation(0.02F));
		
		topBlock = ModBlocks.patagoniangrass.getDefaultState();
		fillerBlock = ModBlocks.patagoniandirt.getDefaultState();

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();

		this.decorator.generateFalls = false;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityVicuna.class, 20, 5, 15));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityAlpaca.class, 15, 3, 12));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityLlama.class, 6, 3, 12));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPuma.class, 9, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityAndeanGoose.class, 10, 8, 15));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPampasFox.class, 8, 1, 1));

			    }
			
				
	}
	

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {
		   int i;
	        int j;
	        int k;
			super.decorate(worldIn, rand, pos);
	        for (i = 0; i < 2; ++i)
	        {
	            j = rand.nextInt(16) + 1;
	            k = rand.nextInt(16) + 1;
	            WorldGenFlowers flowers = new WorldGenFlowers(5);
	            flowers.generate(worldIn, rand, worldIn.getHorizon());
	        }
	}
	
