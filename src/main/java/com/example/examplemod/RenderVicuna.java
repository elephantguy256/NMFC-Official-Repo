package com.example.examplemod;

import net.minecraft.client.model.ModelLlama;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerLlamaDecor;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderVicuna extends RenderLiving<EntityVicuna>
{
    private static final ResourceLocation[] LLAMA_TEXTURES = new ResourceLocation[] {new ResourceLocation("de:textures/entity/preyanimal/vicuna.png"), new ResourceLocation("de:textures/entity/preyanimal/vicuna2.png")};

    public RenderVicuna(RenderManager p_i47203_1_, ModelVicuna modelVicuna, float f)
    {
        super(p_i47203_1_, new ModelVicuna(), 0.7F);
        
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityVicuna entity)
    {
        return LLAMA_TEXTURES[entity.getVariant()];
    }
}