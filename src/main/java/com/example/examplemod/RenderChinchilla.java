package com.example.examplemod;

import net.minecraft.client.model.ModelOcelot;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderChinchilla extends RenderLiving<EntityChinchilla>
{
    private static final ResourceLocation WILD_CHINCHILLA_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    private static final ResourceLocation WHITE = new ResourceLocation("de:textures/entity/preyanimal/chinchillawhipng.png");
    private static final ResourceLocation GREY = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    

    public RenderChinchilla(RenderManager p_i47199_1_, ModelChinchilla modelChinchilla, float f)
    {
        super(p_i47199_1_, new ModelChinchilla(), 0.4F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityChinchilla entity)
    {
        switch (entity.getTameSkin())
        {
            case 0:
            default:
                return WILD_CHINCHILLA_TEXTURES;
            case 1:
                return WHITE;
            case 2:
                return GREY;
            
        }
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityChinchilla entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);

        if (entitylivingbaseIn.isTamed())
        {
            GlStateManager.scale(0.8F, 0.8F, 0.8F);
        }
    }
}