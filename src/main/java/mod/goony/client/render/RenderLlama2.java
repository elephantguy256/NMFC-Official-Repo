package mod.goony.client.render;

import mod.goony.client.model.ModelAlpaca;
import mod.goony.client.model.ModelLlama2;
import mod.goony.client.render.layer.LayerAlpacaDecor;

import mod.goony.entity.EntityAlpaca;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerLlamaDecor;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLlama2 extends RenderLiving<EntityLlama>
{
    private static final ResourceLocation[] LLAMA_TEXTURES = new ResourceLocation[] {new ResourceLocation("de:textures/entity/preyanimal/llama1.png"), new ResourceLocation("de:textures/entity/preyanimal/llama2.png"), new ResourceLocation("de:textures/entity/preyanimal/llama3.png"), new ResourceLocation("de:textures/entity/preyanimal/llama4.png")};

    public RenderLlama2(RenderManager p_i47203_1_, ModelLlama2 modelLlama, float f)
    {
        super(p_i47203_1_, new ModelLlama2(), 0.7F);
        
       
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityLlama entity)
    {
        return LLAMA_TEXTURES[entity.getVariant()];
    }
}