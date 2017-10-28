package init;

import net.minecraft.init.Bootstrap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

public abstract class ModBiomes
{
    public static final Biome PATAGONIA;
    
    private static Biome getRegisteredBiome(String id)
    {
        Biome biome = Biome.REGISTRY.getObject(new ResourceLocation(id));

        if (biome == null)
        {
            throw new IllegalStateException("Invalid Biome requested: " + id);
        }
        else
        {
            return biome;
        }
    }

    static
    {
        if (!Bootstrap.isRegistered())
        {
            throw new RuntimeException("Accessed Biomes before Bootstrap!");
        }
        else
        {
            PATAGONIA = getRegisteredBiome("patagonia");
            
        }
    }
}