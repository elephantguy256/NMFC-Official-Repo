package mod.goony.client.render;

import mod.goony.client.model.ModelPuma;
import mod.goony.entity.EntityPuma;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPuma extends RenderLiving<EntityPuma>
{
	private static final ResourceLocation PUMA = new ResourceLocation("de:textures/entity/predator/puma.png");
    private static final ResourceLocation TEXTURE = new ResourceLocation("de:textures/entity/predator/cougarcub.png");


    public RenderPuma(RenderManager p_i47203_1_, ModelPuma modelPuma, float f)
    {
        super(p_i47203_1_, new ModelPuma(), 0.7F);
        
    }
  



	@Override
	protected ResourceLocation getEntityTexture(EntityPuma entity) {
	  	if(entity.isChild())
    		return TEXTURE;
	  	{
	}
        return PUMA;
	}
    
}