package mod.goony.sounds;

import mod.goony.NMFC;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SoundEvents2
{
	public static SoundEvent GUINEA_PIG;
	public static SoundEvent GUINEA_PIG_HURT;
	public static SoundEvent PUMA_PURR;
	public static SoundEvent PUMA;
	public static SoundEvent PUMA_HURT;
	public static SoundEvent PUMA_MEW;

	
	  public static final RegistryNamespaced<ResourceLocation, SoundEvent> REGISTRY = net.minecraftforge.registries.GameData.getWrapper(SoundEvent.class);
	    private final ResourceLocation soundName;
	    private static int soundEventId;

	    public SoundEvents2(ResourceLocation soundNameIn)
	    {
	        this.soundName = soundNameIn;
	    }

	    @SideOnly(Side.CLIENT)
	    public ResourceLocation getSoundName()
	    {
	        return this.soundName;
	    }
    /**
     * Register the {@link SoundEvent}s.
     */
    public static void registerSounds()
    {
        GUINEA_PIG = registerSound("mob.guineapig.squeal");
        GUINEA_PIG_HURT = registerSound("mob.guineapig.warningsound");
        PUMA = registerSound("mob.puma.growl");
        PUMA_PURR = registerSound("mob.puma.purr");
        PUMA_MEW = registerSound("mob.puma.mew");
        PUMA_HURT = registerSound("mob.puma.hurt");

    }

    /**
     * Register a {@link SoundEvent}.
     *
     * @param soundName The SoundEvent's name without the testmod3 prefix
     * @return The SoundEvent
     */
    private static SoundEvent registerSound(String soundName)
    {
        final ResourceLocation soundID = new ResourceLocation(NMFC.MODID, soundName);
        return SoundEventRegister.register(new SoundEvent(soundID).setRegistryName(soundID));
    }
}