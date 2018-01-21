package mod.goony.client.render.layer;

import mod.goony.client.model.ModelAlpaca;
import mod.goony.client.render.RenderAlpaca;
import mod.goony.entity.EntityAlpaca;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerAlpacaDecor implements LayerRenderer<EntityAlpaca>
{
    private static final ResourceLocation[] Alpaca_DECOR_TEXTURES = new ResourceLocation[] {new ResourceLocation("textures/entity/Alpaca/decor/decor_white.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_orange.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_magenta.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_light_blue.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_yellow.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_lime.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_pink.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_gray.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_silver.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_cyan.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_purple.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_blue.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_brown.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_green.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_red.png"), new ResourceLocation("textures/entity/Alpaca/decor/decor_black.png")};
    private final RenderAlpaca renderer;
    private final ModelAlpaca model = new ModelAlpaca();

    public LayerAlpacaDecor(RenderAlpaca p_i47184_1_)
    {
        this.renderer = p_i47184_1_;
    }

    public void doRenderLayer(EntityAlpaca entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (entitylivingbaseIn.hasColor())
        {
            this.renderer.bindTexture(Alpaca_DECOR_TEXTURES[entitylivingbaseIn.getColor().getMetadata()]);
            this.model.setModelAttributes(this.renderer.getMainModel());
            this.model.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
        if(entitylivingbaseIn.hasChest()) {
        	//Add stuff here
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }
}