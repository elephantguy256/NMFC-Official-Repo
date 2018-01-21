package mod.goony.client.render;

import mod.goony.client.model.ModelPampasFox;
import mod.goony.client.model.ModelPuma;
import mod.goony.entity.EntityPampasFox;
import mod.goony.entity.EntityPuma;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPampasFox extends RenderLiving<EntityPampasFox>
{
	private static final ResourceLocation PAMPAS_FOX = new ResourceLocation("de:textures/entity/predator/pampasfox.png");
	

    public RenderPampasFox(RenderManager p_i47203_1_, ModelPampasFox modelPuma, float f)
    {
        super(p_i47203_1_, new ModelPampasFox(), 0.7F);
        
    }
  



	@Override
	protected ResourceLocation getEntityTexture(EntityPampasFox entity) {
		// TODO Auto-generated method stub
        return PAMPAS_FOX;
	}
    
}