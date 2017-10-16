package com.example.examplemod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Vicuña - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelVicuna extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer ButtBody;
    public ModelRenderer FrontLeftLegAnimationC;
    public ModelRenderer FrontRightLegAnimationC;
    public ModelRenderer shape32;
    public ModelRenderer Head;
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

    public ModelVicuna() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.BackRightLeg2 = new ModelRenderer(this, 52, 0);
        this.BackRightLeg2.setRotationPoint(-0.8F, 7.6F, -0.6F);
        this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(BackRightLeg2, 0.6829473363053812F, 0.0F, 0.0F);
        this.FrontLeftLeg2 = new ModelRenderer(this, 0, 63);
        this.FrontLeftLeg2.setRotationPoint(0.5F, 5.3F, 3.6F);
        this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F);
        this.setRotateAngle(FrontLeftLeg2, -1.593485607070823F, 0.0F, 0.0F);
        this.FrontRightFoot = new ModelRenderer(this, 0, 75);
        this.FrontRightFoot.setRotationPoint(0.0F, -0.3F, 12.4F);
        this.FrontRightFoot.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(FrontRightFoot, -1.5025539530419183F, 0.0F, 0.0F);
        this.BackLeftLeg2 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2.setRotationPoint(-1.1F, 7.6F, -0.7F);
        this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(BackLeftLeg2, 0.6829473363053812F, 0.0F, 0.0F);
        this.FrontRightLeg2 = new ModelRenderer(this, 0, 63);
        this.FrontRightLeg2.setRotationPoint(0.5F, 5.3F, 3.6F);
        this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F);
        this.setRotateAngle(FrontRightLeg2, -1.593485607070823F, 0.0F, 0.0F);
        this.BackLeftLeg1 = new ModelRenderer(this, 30, 0);
        this.BackLeftLeg1.setRotationPoint(7.5F, 7.4F, 9.2F);
        this.BackLeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 3, 9, 6, 0.0F);
        this.setRotateAngle(BackLeftLeg1, -0.18203784098300857F, 0.0F, 0.018675022996339326F);
        this.shape46 = new ModelRenderer(this, 24, 17);
        this.shape46.setRotationPoint(2.5F, 2.8F, 8.8F);
        this.shape46.addBox(0.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(shape46, -0.6373942428283291F, 0.0F, 0.0F);
        this.FrontLeftFoot = new ModelRenderer(this, 0, 75);
        this.FrontLeftFoot.setRotationPoint(0.0F, -0.3F, 12.4F);
        this.FrontLeftFoot.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(FrontLeftFoot, -1.5025539530419183F, 0.0F, 0.0F);
        this.ButtBody = new ModelRenderer(this, 72, 31);
        this.ButtBody.setRotationPoint(-0.5F, 11.8F, 14.1F);
        this.ButtBody.addBox(0.0F, 0.0F, 0.0F, 9, 14, 12, 0.0F);
        this.setRotateAngle(ButtBody, -1.593485607070823F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 40, 19);
        this.Neck.setRotationPoint(0.5F, 0.1F, 1.0F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 7, 7, 13, 0.0F);
        this.setRotateAngle(Neck, 0.5462880558742251F, 0.0F, 0.0F);
        this.BackRightLeg1 = new ModelRenderer(this, 30, 0);
        this.BackRightLeg1.setRotationPoint(0.5F, 7.4F, 9.2F);
        this.BackRightLeg1.addBox(-1.0F, 0.0F, -1.0F, 3, 9, 6, 0.0F);
        this.setRotateAngle(BackRightLeg1, -0.18203784098300857F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 8, 16);
        this.Snout.setRotationPoint(-2.0F, -2.8F, -2.3F);
        this.Snout.addBox(0.0F, -0.4F, 0.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(Snout, -0.9875072907783915F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 40);
        this.Body.setRotationPoint(-3.9F, 8.7F, -12.5F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 13, 14, 0.0F);
        this.setRotateAngle(Body, 1.593485607070823F, 0.0F, 0.0F);
        this.BackRightleg3 = new ModelRenderer(this, 66, 6);
        this.BackRightleg3.setRotationPoint(0.5F, 9.3F, 4.0F);
        this.BackRightleg3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(BackRightleg3, -2.1399481958702475F, 0.0F, 0.0F);
        this.SnoutCheeks = new ModelRenderer(this, 0, 0);
        this.SnoutCheeks.setRotationPoint(0.0F, 3.8F, -0.6F);
        this.SnoutCheeks.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(SnoutCheeks, 0.9606292202976789F, 0.0F, 0.0F);
        this.BackLeftleg3 = new ModelRenderer(this, 66, 6);
        this.BackLeftleg3.setRotationPoint(0.5F, 9.3F, 4.0F);
        this.BackLeftleg3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(BackLeftleg3, -2.1399481958702475F, 0.0F, 0.0F);
        this.FrontRightLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontRightLeg1.setRotationPoint(-0.6F, 0.7F, -0.1F);
        this.FrontRightLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(FrontRightLeg1, -1.6390387005478748F, 0.0F, 0.0F);
        this.FrontRightLegAnimationC = new ModelRenderer(this, 0, 55);
        this.FrontRightLegAnimationC.setRotationPoint(0.6F, -0.5F, 2.4F);
        this.FrontRightLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.hip = new ModelRenderer(this, 67, 59);
        this.hip.setRotationPoint(0.0F, 12.0F, 7.0F);
        this.hip.addBox(0.0F, 0.0F, 0.0F, 9, 6, 13, 0.0F);
        this.setRotateAngle(hip, 1.1873474901317425F, 0.0F, 0.00942477796076938F);
        this.LeftEar = new ModelRenderer(this, 0, 36);
        this.LeftEar.setRotationPoint(2.4F, -6.7F, 3.5F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, 0.0F, 0.31869712141416456F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontLeftLeg1.setRotationPoint(-1.3F, 0.7F, -0.1F);
        this.FrontLeftLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(FrontLeftLeg1, -1.629788455512305F, 0.0F, 0.0F);
        this.FrontLeftLegAnimationC = new ModelRenderer(this, 0, 55);
        this.FrontLeftLegAnimationC.setRotationPoint(6.3F, -0.5F, 2.4F);
        this.FrontLeftLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape32 = new ModelRenderer(this, 101, 0);
        this.shape32.setRotationPoint(0.5F, 0.2F, 12.7F);
        this.shape32.addBox(0.0F, 0.0F, 0.0F, 6, 6, 9, 0.0F);
        this.setRotateAngle(shape32, -0.40980330836826856F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 13, 36);
        this.RightEar.setRotationPoint(-4.3F, -6.1F, 3.5F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.0F, -0.31869712141416456F);
        this.Head = new ModelRenderer(this, 84, 16);
        this.Head.setRotationPoint(3.0F, 1.1F, 10.6F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 6, 5, 7, 0.0F);
        this.setRotateAngle(Head, -1.6390387005478748F, 0.0F, 0.0017453292519943296F);
        this.BackRightLeg1.addChild(this.BackRightLeg2);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.FrontRightLeg2.addChild(this.FrontRightFoot);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.FrontRightLeg1.addChild(this.FrontRightLeg2);
        this.ButtBody.addChild(this.BackLeftLeg1);
        this.hip.addChild(this.shape46);
        this.FrontLeftLeg2.addChild(this.FrontLeftFoot);
        this.Body.addChild(this.ButtBody);
        this.Body.addChild(this.Neck);
        this.ButtBody.addChild(this.BackRightLeg1);
        this.Head.addChild(this.Snout);
        this.BackRightLeg2.addChild(this.BackRightleg3);
        this.Snout.addChild(this.SnoutCheeks);
        this.BackLeftLeg2.addChild(this.BackLeftleg3);
        this.FrontRightLegAnimationC.addChild(this.FrontRightLeg1);
        this.Body.addChild(this.FrontRightLegAnimationC);
        this.ButtBody.addChild(this.hip);
        this.Head.addChild(this.LeftEar);
        this.FrontLeftLegAnimationC.addChild(this.FrontLeftLeg1);
        this.Body.addChild(this.FrontLeftLegAnimationC);
        this.Neck.addChild(this.shape32);
        this.Head.addChild(this.RightEar);
        this.shape32.addChild(this.Head);
    }



    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        {
            super.render(entity, f, f1, f2, f3, f4, f5);
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            {
                if (this.isChild)
                {
                    float scaleFactor = 0.3F;
                    GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
                    GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
                    GL11.glPushMatrix();
                    GL11.glPopMatrix();
                    this.Body.render(f5);
            }
            else
            {
                float scaleFactor = 0.5F;
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
