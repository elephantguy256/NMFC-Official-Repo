package com.example.examplemod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Alpaca - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelAlpaca extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer ButtBody;
    public ModelRenderer FrontLeftLegAnimationC;
    public ModelRenderer FrontRightLegAnimationC;
    public ModelRenderer shape32;
    public ModelRenderer Head;
    public ModelRenderer Head2;
    public ModelRenderer Snout;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer SnoutCheeks;
    public ModelRenderer BackLeftLeg1;
    public ModelRenderer hip;
    public ModelRenderer BackRightLeg1;
    public ModelRenderer BackLeftLeg2;
    public ModelRenderer BackLeftleg3;
    public ModelRenderer shape46;
    public ModelRenderer BackRightLeg2;
    public ModelRenderer BackRightleg3;
    public ModelRenderer FrontLeftLeg1;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontLeftFoot;
    public ModelRenderer FrontRightLeg1;
    public ModelRenderer FrontRightLeg2;
    public ModelRenderer FrontRightFoot;

    public ModelAlpaca() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.FrontLeftLeg2 = new ModelRenderer(this, 0, 65);
        this.FrontLeftLeg2.setRotationPoint(0.5F, 7.3F, 4.5F);
        this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 4, 6, 0.0F);
        this.setRotateAngle(FrontLeftLeg2, -1.593485607070823F, 0.0F, 0.0F);
        this.FrontRightFoot = new ModelRenderer(this, 0, 77);
        this.FrontRightFoot.setRotationPoint(0.1F, 0.0F, 11.2F);
        this.FrontRightFoot.addBox(0.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(FrontRightFoot, -1.5025539530419183F, 0.0F, 0.0F);
        this.BackRightLeg1 = new ModelRenderer(this, 30, 0);
        this.BackRightLeg1.setRotationPoint(0.5F, 8.4F, 9.2F);
        this.BackRightLeg1.addBox(-1.0F, 0.0F, -1.0F, 3, 9, 6, 0.0F);
        this.setRotateAngle(BackRightLeg1, -0.18203784098300857F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 84, 20);
        this.Head.setRotationPoint(4.0F, 0.5F, 10.7F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 5, 5, 2, 0.0F);
        this.setRotateAngle(Head, -1.6390387005478748F, 0.0F, 0.0017453292519943296F);
        this.SnoutCheeks = new ModelRenderer(this, 0, 22);
        this.SnoutCheeks.setRotationPoint(0.0F, 2.3F, -0.6F);
        this.SnoutCheeks.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(SnoutCheeks, 0.9606292202976789F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 40, 19);
        this.Neck.setRotationPoint(0.5F, 0.1F, 0.4F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 8, 8, 13, 0.0F);
        this.setRotateAngle(Neck, 0.5462880558742251F, 0.0F, 0.0F);
        this.FrontLeftLegAnimationC = new ModelRenderer(this, 37, 0);
        this.FrontLeftLegAnimationC.setRotationPoint(8.8F, 0.1F, 1.1F);
        this.FrontLeftLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Body = new ModelRenderer(this, 20, 65);
        this.Body.setRotationPoint(-5.0F, 8.8F, -13.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 10, 13, 15, 0.0F);
        this.setRotateAngle(Body, 1.593485607070823F, 0.0F, 0.0F);
        this.hip = new ModelRenderer(this, 67, 59);
        this.hip.setRotationPoint(0.5F, 12.0F, 7.0F);
        this.hip.addBox(0.0F, 0.0F, 0.0F, 9, 6, 13, 0.0F);
        this.setRotateAngle(hip, 1.1873474901317425F, 0.0F, 0.0F);
        this.Head2 = new ModelRenderer(this, 0, 0);
        this.Head2.setRotationPoint(0.0F, -0.1F, 8.8F);
        this.Head2.addBox(0.0F, 0.0F, 0.0F, 7, 7, 5, 0.0F);
        this.shape46 = new ModelRenderer(this, 18, 17);
        this.shape46.setRotationPoint(2.5F, 2.2F, 8.0F);
        this.shape46.addBox(0.0F, 0.0F, 0.0F, 4, 9, 6, 0.0F);
        this.setRotateAngle(shape46, -0.6373942428283291F, 0.0F, 0.0F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontLeftLeg1.setRotationPoint(-2.3F, 0.7F, 2.2F);
        this.FrontLeftLeg1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(FrontLeftLeg1, -1.6516050711622339F, 0.0F, 0.0F);
        this.FrontRightLegAnimationC = new ModelRenderer(this, 0, 0);
        this.FrontRightLegAnimationC.setRotationPoint(0.4F, 0.1F, 1.1F);
        this.FrontRightLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.RightEar = new ModelRenderer(this, 13, 36);
        this.RightEar.setRotationPoint(-5.2F, -6.1F, 3.5F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.0F, -0.31869712141416456F);
        this.FrontLeftFoot = new ModelRenderer(this, 0, 77);
        this.FrontLeftFoot.setRotationPoint(-0.1F, 0.0F, 11.2F);
        this.FrontLeftFoot.addBox(0.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(FrontLeftFoot, -1.5025539530419183F, 0.0F, 0.0F);
        this.BackLeftleg3 = new ModelRenderer(this, 70, 6);
        this.BackLeftleg3.setRotationPoint(0.5F, 9.3F, 4.0F);
        this.BackLeftleg3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(BackLeftleg3, -2.1399481958702475F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 8, 16);
        this.Snout.setRotationPoint(-2.5F, -2.3F, -2.3F);
        this.Snout.addBox(0.0F, -0.4F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(Snout, -0.9875072907783915F, 0.0F, 0.0F);
        this.BackRightLeg2 = new ModelRenderer(this, 52, 0);
        this.BackRightLeg2.setRotationPoint(-0.8F, 7.6F, -0.6F);
        this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 10, 5, 0.0F);
        this.setRotateAngle(BackRightLeg2, 0.6829473363053812F, 0.0F, 0.0F);
        this.ButtBody = new ModelRenderer(this, 77, 30);
        this.ButtBody.setRotationPoint(0.0F, 11.8F, 15.0F);
        this.ButtBody.addBox(0.0F, 0.0F, 0.0F, 10, 15, 12, 0.0F);
        this.setRotateAngle(ButtBody, -1.593485607070823F, 0.0F, 0.0F);
        this.BackLeftLeg1 = new ModelRenderer(this, 30, 0);
        this.BackLeftLeg1.setRotationPoint(8.3F, 8.4F, 9.2F);
        this.BackLeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 3, 9, 6, 0.0F);
        this.setRotateAngle(BackLeftLeg1, -0.18203784098300857F, 0.0F, 0.018675022996339326F);
        this.BackRightleg3 = new ModelRenderer(this, 70, 6);
        this.BackRightleg3.setRotationPoint(0.7F, 9.3F, 4.0F);
        this.BackRightleg3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(BackRightleg3, -2.1399481958702475F, 0.0F, 0.0F);
        this.shape32 = new ModelRenderer(this, 101, 0);
        this.shape32.setRotationPoint(0.5F, 0.2F, 12.7F);
        this.shape32.addBox(0.0F, 0.0F, 0.0F, 7, 7, 9, 0.0F);
        this.setRotateAngle(shape32, -0.40980330836826856F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 36);
        this.LeftEar.setRotationPoint(2.3F, -6.8F, 3.5F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, 0.0F, 0.31869712141416456F);
        this.BackLeftLeg2 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2.setRotationPoint(-1.1F, 7.6F, -0.7F);
        this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 10, 5, 0.0F);
        this.setRotateAngle(BackLeftLeg2, 0.6829473363053812F, 0.0F, 0.0F);
        this.FrontRightLeg2 = new ModelRenderer(this, 0, 65);
        this.FrontRightLeg2.setRotationPoint(0.5F, 7.3F, 4.5F);
        this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 4, 6, 0.0F);
        this.setRotateAngle(FrontRightLeg2, -1.593485607070823F, 0.0F, 0.0F);
        this.FrontRightLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontRightLeg1.setRotationPoint(-1.0F, 0.7F, 2.2F);
        this.FrontRightLeg1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(FrontRightLeg1, -1.6523032028630318F, 0.0F, 0.0F);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.FrontRightLeg2.addChild(this.FrontRightFoot);
        this.ButtBody.addChild(this.BackRightLeg1);
        this.shape32.addChild(this.Head);
        this.Snout.addChild(this.SnoutCheeks);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.FrontLeftLegAnimationC);
        this.ButtBody.addChild(this.hip);
        this.shape32.addChild(this.Head2);
        this.hip.addChild(this.shape46);
        this.FrontLeftLegAnimationC.addChild(this.FrontLeftLeg1);
        this.Body.addChild(this.FrontRightLegAnimationC);
        this.Head.addChild(this.RightEar);
        this.FrontLeftLeg2.addChild(this.FrontLeftFoot);
        this.BackLeftLeg2.addChild(this.BackLeftleg3);
        this.Head.addChild(this.Snout);
        this.BackRightLeg1.addChild(this.BackRightLeg2);
        this.Body.addChild(this.ButtBody);
        this.ButtBody.addChild(this.BackLeftLeg1);
        this.BackRightLeg2.addChild(this.BackRightleg3);
        this.Neck.addChild(this.shape32);
        this.Head.addChild(this.LeftEar);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.FrontRightLeg1.addChild(this.FrontRightLeg2);
        this.FrontRightLegAnimationC.addChild(this.FrontRightLeg1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        {
            super.render(entity, f, f1, f2, f3, f4, f5);
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            {
                if (this.isChild)
                {
                    float scaleFactor = 0.4F;
                    GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
                    GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
                    GL11.glPushMatrix();
                    GL11.glPopMatrix();
                    this.Body.render(f5);
            }
            else
            {
                float scaleFactor = 0.7F;
                GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
                GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
                GL11.glPushMatrix();
                GL11.glPopMatrix();
                this.Body.render(f5);
            }
            }
            }
        }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        float f6 = (180F / (float)Math.PI);
        this.FrontLeftLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.7777F) * 1.4F * limbSwingAmount;
        this.FrontRightLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.7777F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BackRightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.7777F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BackLeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.7777F) * 1.4F * limbSwingAmount;
    }
}
