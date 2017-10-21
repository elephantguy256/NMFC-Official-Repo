package com.example.examplemod.render;

import com.example.examplemod.entity.EntityPuma;
import com.example.examplemod.model.ModelPuma;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPuma extends RenderLiving<EntityPuma>
{
	private static final ResourceLocation PUMA = new ResourceLocation("de:textures/entity/predator/puma.png");
	

    public RenderPuma(RenderManager p_i47203_1_, ModelPuma modelPuma, float f)
    {
        super(p_i47203_1_, new ModelPuma(), 0.7F);
        
    }
  



	@Override
	protected ResourceLocation getEntityTexture(EntityPuma entity) {
		// TODO Auto-generated method stub
        return PUMA;
	}
    
}