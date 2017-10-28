package com.example.examplemod.render;

import com.example.examplemod.entity.EntityPampasFox;
import com.example.examplemod.entity.EntityPuma;
import com.example.examplemod.model.ModelPampasFox;
import com.example.examplemod.model.ModelPuma;

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