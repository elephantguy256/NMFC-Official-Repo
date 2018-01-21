package mod.goony.client.render;

import mod.goony.client.model.ModelPatagonianMara;
import mod.goony.entity.EntityChinchilla;
import mod.goony.entity.EntityPatagonianMara;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPatagonianMara extends RenderLiving<EntityPatagonianMara>
{
    private static final ResourceLocation WILDMARA = new ResourceLocation("de:textures/entity/preyanimal/pmara.png");
    private static final ResourceLocation TAMEMARA = new ResourceLocation("de:textures/entity/preyanimal/pmaratamed.png");
   
    

    public RenderPatagonianMara(RenderManager p_i47199_1_, ModelPatagonianMara modelGuineaPig, float f)
    {
        super(p_i47199_1_, new ModelPatagonianMara(), 0.4F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityPatagonianMara entity)
    {
        switch (entity.getTameSkin())
        {
        default:
        return WILDMARA;                
            case 1:
                return TAMEMARA;
        }                
        }
    }
