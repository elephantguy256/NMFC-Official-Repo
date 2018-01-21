package mod.goony.client.render;

import mod.goony.client.model.ModelChinchilla;
import mod.goony.entity.EntityChinchilla;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderChinchilla extends RenderLiving<EntityChinchilla>
{
    private static final ResourceLocation WILD_CHINCHILLA_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    private static final ResourceLocation WHITE = new ResourceLocation("de:textures/entity/preyanimal/chinchillawhipng.png");
    private static final ResourceLocation GREY = new ResourceLocation("de:textures/entity/preyanimal/chinchillagre.png");
    

    public RenderChinchilla()
    {
        super(Minecraft.getMinecraft().getRenderManager(), new ModelChinchilla(), 0.4F);
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
}