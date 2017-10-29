package world.biome;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldGenNMAFC extends WorldType
{
    public WorldGenNMAFC() 
    {
        super("Patagonia");
    }

    @Override
    public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, ChunkGeneratorSettings chunkSettings) 
    {
        return new GenLayerTest(worldSeed, parentLayer, this, chunkSettings);
    }
}