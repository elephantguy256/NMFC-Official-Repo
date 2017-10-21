	package com.example.examplemod.render;

import com.example.examplemod.entity.EntityGuineaPig;
import com.example.examplemod.model.ModelGuineaPig;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGuineaPig extends RenderLiving<EntityGuineaPig>
{
    private static final ResourceLocation AMERICAN_GUINEA_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/americanguinea1.png");
    private static final ResourceLocation GUINEAWILD_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/wildguinea.png");
    private static final ResourceLocation AMERICAN_GUINEA2_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/americanguinea2.png");
    private static final ResourceLocation HIMALAYAN_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/himalya.png");
    private static final ResourceLocation HALLOWEEN_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/halloweenguin.png");
    private static final ResourceLocation CREAM_DUTCH_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/hayleesguinea.png");
    private static final ResourceLocation MIXED_AMERICAN_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/mbmguinea.png");
    private static final ResourceLocation SPOTTED_GUINEA_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/spottedguinea.png");
    private static final ResourceLocation PEACH_GUINEA_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/peachguinea.png");
    public RenderGuineaPig(RenderManager p_i47199_1_, ModelGuineaPig modelGuineaPig, float f)
    {
        super(p_i47199_1_, new ModelGuineaPig(), 0.4F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityGuineaPig entity)
    {
        switch (entity.getTameSkin())
        {
            case 0:
            default:
                return GUINEAWILD_TEXTURES;
            case 1:
                return  AMERICAN_GUINEA_TEXTURES;
            case 2:
                return AMERICAN_GUINEA2_TEXTURES;
            case 3:
                return HIMALAYAN_TEXTURES;
            case 4:
                return HALLOWEEN_TEXTURES;
            case 5:
            	return CREAM_DUTCH_TEXTURES;
            case 6:
            	return MIXED_AMERICAN_TEXTURES;
            case 7:
            	return SPOTTED_GUINEA_TEXTURES;
            case 8:
            	return PEACH_GUINEA_TEXTURES;
        }
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityGuineaPig entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);

        if (entitylivingbaseIn.isTamed())
        {
            GlStateManager.scale(0.8F, 0.8F, 0.8F);
        }
    }
}