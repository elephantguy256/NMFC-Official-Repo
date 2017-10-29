package com.example.examplemod.render;

import com.example.examplemod.entity.EntityAndeanGoose;
import com.example.examplemod.entity.EntityGuineaPig;
import com.example.examplemod.model.ModelAndeanGoose;
import com.example.examplemod.model.ModelAndeanGosling;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAndeanGoose extends RenderLiving<EntityAndeanGoose>
{
    private static final ResourceLocation GOOSE_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/andeangoose.png");
    private static final ResourceLocation GOSLING_TEXTURES = new ResourceLocation("de:textures/entity/preyanimal/andeangosling.png");

    public RenderAndeanGoose(RenderManager p_i47211_1_, ModelAndeanGoose modelAndeanGoose, float f)
    {
        super(p_i47211_1_, new ModelAndeanGoose(), 0.3F);
    }
    

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityAndeanGoose entity)
    {
        return GOOSE_TEXTURES;
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityAndeanGoose livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
    
        
}