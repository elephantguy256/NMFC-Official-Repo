package com.example.examplemod;



import com.dabigjoe.obsidianAPI.render.ModelAnimated;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderChinchilla extends RenderLiving<EntityChinchilla>
{
    public RenderChinchilla(net.minecraft.client.renderer.entity.RenderManager rendermanagerIn, ModelBase modelbaseIn,
			float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}



	private static RenderManager RenderManager;


	private static final ResourceLocation BROWN = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    private static final ResourceLocation WHITE = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    private static final ResourceLocation BLACK = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    private static final ResourceLocation GOLD = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    private static final ResourceLocation SALT = new ResourceLocation("de:textures/entity/preyanimal/chinchillawhipng.png");
    private static final ResourceLocation WHITE_SPLOTCHED = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    private static final ResourceLocation TOAST = new ResourceLocation("de:textures/entity/mammal/chinchillawhite.png");
    private static final ResourceLocation CAERBANNOG = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");

    {
    }



    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityChinchilla entity)
    {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());

        if (s != null && "Toast".equals(s))
        {
            return TOAST;
        }
        else
        {
            switch (entity.getRabbitType())
            {
                case 0:
                default:
                    return BROWN;
                case 1:
                    return WHITE;
                case 2:
                    return BLACK;
                case 3:
                    return WHITE_SPLOTCHED;
                case 4:
                    return GOLD;
                case 5:
                    return SALT;
                case 99:
                    return CAERBANNOG;
            }
        }
    }
}