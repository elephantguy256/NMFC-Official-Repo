package com.example.examplemod.render;

import com.example.examplemod.entity.EntityVicuna;
import com.example.examplemod.model.ModelVicuna;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderVicuna extends RenderLiving<EntityVicuna>
{
    private static final ResourceLocation COW_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/vicuna2.png");

    public RenderVicuna(RenderManager p_i47210_1_, ModelVicuna modelVicuna, float f)
    {
        super(p_i47210_1_, new ModelVicuna(), 0.7F);
    }

    

	/**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityVicuna entity)
    {
        return COW_TEXTURES;
    }
}