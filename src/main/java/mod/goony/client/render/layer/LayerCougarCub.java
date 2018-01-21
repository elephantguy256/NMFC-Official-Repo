package mod.goony.client.render.layer;

import mod.goony.client.model.ModelPuma;
import mod.goony.client.render.RenderPuma;
import mod.goony.entity.EntityPumaCub;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerCougarCub implements LayerRenderer<EntityPumaCub>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation("de:textures/entity/predator/cougarcub.png");
    private final RenderPuma render;
    private final ModelPuma pigModel = new ModelPuma();

    public LayerCougarCub(RenderPuma pigRendererIn)
    {
        this.render = pigRendererIn;
    }

    public void doRenderLayer(EntityPumaCub e, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (e.isChild())
        {
            this.render.bindTexture(TEXTURE);
            this.pigModel.setModelAttributes(this.render.getMainModel());
            this.pigModel.render(e, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            this.pigModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, e);
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		
	}

		// TODO Auto-generated method stub
		
	
		
	