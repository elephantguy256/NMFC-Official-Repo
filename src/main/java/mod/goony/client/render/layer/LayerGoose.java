package mod.goony.client.render.layer;

import mod.goony.client.model.ModelAndeanGosling;
import mod.goony.client.render.RenderAndeanGoose;
import mod.goony.entity.EntityAndeanGoose;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerGoose implements LayerRenderer<EntityAndeanGoose>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation("de:textures/entity/preyanimal/andeangosling.png");
    private final RenderAndeanGoose render;
    private final ModelAndeanGosling pigModel = new ModelAndeanGosling();

    public LayerGoose(RenderAndeanGoose pigRendererIn)
    {
        this.render = pigRendererIn;
    }

    public void doRenderLayer(EntityAndeanGoose e, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
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
}