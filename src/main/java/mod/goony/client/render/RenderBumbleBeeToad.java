package mod.goony.client.render;

import mod.goony.client.model.ModelBumbleBeeToad;
import mod.goony.client.model.ModelPampasFox;
import mod.goony.entity.EntityPampasFox;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBumbleBeeToad extends RenderLiving<EntityBumbleBeeToad>
{
	private static final ResourceLocation TOAD_TEXTURE = new ResourceLocation("de:textures/entity/preyanimal/bbtoad.png");
	

    public RenderBumbleBeeToad(RenderManager p_i47203_1_, ModelBumbleBeeToad modelBumbleBeeToad, float f)
    {
        super(p_i47203_1_, new ModelBumbleBeeToad(), 0.7F);
        
    }
 


	@Override
	protected ResourceLocation getEntityTexture(EntityBumbleBeeToad entity) {
		// TODO Auto-generated method stub
        return TOAD_TEXTURE;
	}
    
}