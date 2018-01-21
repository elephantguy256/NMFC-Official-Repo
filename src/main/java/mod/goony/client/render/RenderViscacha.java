package mod.goony.client.render;

import mod.goony.client.model.ModelViscacha;
import mod.goony.entity.EntityViscacha;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderViscacha extends RenderLiving<EntityViscacha>
{
    private static final ResourceLocation WILD_CHINCHILLA_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/visacha.png");
    

    public RenderViscacha(RenderManager renderManager, ModelViscacha modelViscacha, float f)
    {
        super(Minecraft.getMinecraft().getRenderManager(), new ModelViscacha(), 0.4F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityViscacha entity)
    {
        switch (entity.getTameSkin())
        {
            case 0:
            default:
                return WILD_CHINCHILLA_TEXTURES;
            
        }
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityViscacha entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);

        if (entitylivingbaseIn.isTamed())
        {
            GlStateManager.scale(0.8F, 0.8F, 0.8F);
        }
    }
}