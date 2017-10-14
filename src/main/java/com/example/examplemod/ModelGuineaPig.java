package com.example.examplemod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * American Guinea Pig - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelGuineaPig extends ModelBase {
    public double[] modelScale = new double[] { 2.8D, 2.8D, 2.8D };
    public ModelRenderer Body;
    public ModelRenderer FrontLeftLeg1;
    public ModelRenderer FrontRightLeg1;
    public ModelRenderer BackLeftLeg1;
    public ModelRenderer BackRightLeg1;
    public ModelRenderer Neck;
    public ModelRenderer ButtBody;
    public ModelRenderer shape32;
    public ModelRenderer Throat;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer SnoutCheeks;
    public ModelRenderer Snout2;
    public ModelRenderer Nose;
    public ModelRenderer SnoutCheeks2;
    public ModelRenderer hip;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontLeftFoot;
    public ModelRenderer FrontLeftLeg2_1;
    public ModelRenderer FrontLeftFoot_1;
    public ModelRenderer BackLeftLeg2;
    public ModelRenderer BackLeftleg3;
    public ModelRenderer BackLeftFoot;
    public ModelRenderer BackLeftLeg2_1;
    public ModelRenderer BackLeftleg3_1;
    public ModelRenderer BackLeftFoot_1;

    public ModelGuineaPig() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.Snout = new ModelRenderer(this, 8, 16);
        this.Snout.setRotationPoint(-2.0F, -2.8F, -2.3F);
        this.Snout.addBox(0.0F, -0.4F, 0.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Snout, -0.9875072907783915F, 0.0F, 0.0F);
        this.BackLeftLeg1 = new ModelRenderer(this, 30, 0);
        this.BackLeftLeg1.setRotationPoint(2.1F, 57.7F, 8.2F);
        this.BackLeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(BackLeftLeg1, -0.31869712141416456F, 0.0F, 0.0F);
        this.BackLeftleg3 = new ModelRenderer(this, 66, 7);
        this.BackLeftleg3.setRotationPoint(0.7F, 5.0F, 2.4F);
        this.BackLeftleg3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(BackLeftleg3, 3.947934768011173F, 0.0F, 0.0F);
        this.FrontLeftLeg2_1 = new ModelRenderer(this, 0, 60);
        this.FrontLeftLeg2_1.setRotationPoint(0.5F, 4.5F, 3.5F);
        this.FrontLeftLeg2_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(FrontLeftLeg2_1, -2.4586453172844123F, 0.0F, 0.0F);
        this.BackLeftFoot = new ModelRenderer(this, 66, 0);
        this.BackLeftFoot.setRotationPoint(-0.5F, -0.4F, 3.4F);
        this.BackLeftFoot.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(BackLeftFoot, 4.667211663290356F, 0.0F, 0.0F);
        this.BackRightLeg1 = new ModelRenderer(this, 30, 0);
        this.BackRightLeg1.setRotationPoint(-4.3F, 58.0F, 7.5F);
        this.BackRightLeg1.addBox(-1.0F, 0.0F, -0.8F, 4, 5, 5, 0.0F);
        this.setRotateAngle(BackRightLeg1, -0.22759093446006054F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 42, 17);
        this.Neck.setRotationPoint(0.5F, 1.4F, 2.0F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 7, 10, 4, 0.0F);
        this.setRotateAngle(Neck, 1.3203415791337103F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 13, 36);
        this.RightEar.setRotationPoint(-2.6F, -3.0F, 0.6F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.0F, 1.8668041679331349F);
        this.BackLeftleg3_1 = new ModelRenderer(this, 66, 7);
        this.BackLeftleg3_1.setRotationPoint(0.7F, 5.0F, 2.4F);
        this.BackLeftleg3_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(BackLeftleg3_1, 3.947934768011173F, 0.0F, 0.0F);
        this.SnoutCheeks2 = new ModelRenderer(this, 23, 28);
        this.SnoutCheeks2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.SnoutCheeks2.addBox(0.0F, 0.0F, 0.0F, 6, 5, 1, 0.0F);
        this.setRotateAngle(SnoutCheeks2, 1.3658946726107624F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 76, 13);
        this.Head.setRotationPoint(2.5F, 6.3F, 6.6F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 8, 8, 6, 0.0F);
        this.setRotateAngle(Head, -3.0049333731586367F, 0.0F, 0.0017453292519943296F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontLeftLeg1.setRotationPoint(1.6F, 61.1F, -7.5F);
        this.FrontLeftLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FrontLeftLeg1, 0.6829473363053812F, 0.0F, 0.0F);
        this.FrontLeftFoot_1 = new ModelRenderer(this, 0, 70);
        this.FrontLeftFoot_1.setRotationPoint(-0.5F, 0.0F, 5.3F);
        this.FrontLeftFoot_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FrontLeftFoot_1, -1.3658946726107624F, 0.0F, 0.0F);
        this.hip = new ModelRenderer(this, 67, 59);
        this.hip.setRotationPoint(0.5F, 11.1F, 5.6F);
        this.hip.addBox(0.0F, 0.0F, 0.0F, 8, 6, 12, 0.0F);
        this.setRotateAngle(hip, 1.1873474901317425F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 36);
        this.LeftEar.setRotationPoint(4.6F, -1.9F, 0.6F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, 0.0F, -1.8668041679331349F);
        this.shape32 = new ModelRenderer(this, 101, 0);
        this.shape32.setRotationPoint(0.0F, 0.3F, 1.8F);
        this.shape32.addBox(0.0F, 0.0F, 0.0F, 7, 10, 3, 0.0F);
        this.setRotateAngle(shape32, 0.21711895894809458F, 0.0F, 0.0F);
        this.FrontLeftLeg2 = new ModelRenderer(this, 0, 60);
        this.FrontLeftLeg2.setRotationPoint(0.5F, 4.5F, 3.5F);
        this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(FrontLeftLeg2, -2.4586453172844123F, 0.0F, 0.0F);
        this.ButtBody = new ModelRenderer(this, 67, 34);
        this.ButtBody.setRotationPoint(-0.5F, 6.8F, 13.1F);
        this.ButtBody.addBox(0.0F, 0.0F, 0.0F, 9, 13, 10, 0.0F);
        this.setRotateAngle(ButtBody, -1.593485607070823F, 0.0F, 0.0F);
        this.SnoutCheeks = new ModelRenderer(this, 0, 0);
        this.SnoutCheeks.setRotationPoint(0.0F, 5.6F, 0.3F);
        this.SnoutCheeks.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.setRotateAngle(SnoutCheeks, 0.9606292202976789F, 0.0F, 0.0F);
        this.FrontRightLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontRightLeg1.setRotationPoint(-5.0F, 61.0F, -7.0F);
        this.FrontRightLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FrontRightLeg1, 0.6829473363053812F, 0.0F, 0.0F);
        this.BackLeftFoot_1 = new ModelRenderer(this, 66, 0);
        this.BackLeftFoot_1.setRotationPoint(-0.5F, -0.4F, 3.4F);
        this.BackLeftFoot_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(BackLeftFoot_1, 4.667211663290356F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 20);
        this.Nose.setRotationPoint(2.0F, -0.1F, -0.1F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Nose, -0.091106186954104F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 37);
        this.Body.setRotationPoint(-3.9F, 65.1F, -6.6F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 9, 13, 0.0F);
        this.setRotateAngle(Body, 1.593485607070823F, 0.0F, 0.0F);
        this.Snout2 = new ModelRenderer(this, 0, 27);
        this.Snout2.setRotationPoint(0.0F, 3.6F, 0.0F);
        this.Snout2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 3, 0.0F);
        this.setRotateAngle(Snout2, 0.17400932642383465F, 0.0017453292519943296F, 0.0F);
        this.FrontLeftFoot = new ModelRenderer(this, 0, 70);
        this.FrontLeftFoot.setRotationPoint(-0.5F, 0.0F, 5.3F);
        this.FrontLeftFoot.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FrontLeftFoot, -1.3658946726107624F, 0.0F, 0.0F);
        this.Throat = new ModelRenderer(this, 123, 0);
        this.Throat.setRotationPoint(0.0F, -1.1F, 0.8F);
        this.Throat.addBox(0.0F, 0.0F, 0.0F, 7, 2, 8, 0.0F);
        this.setRotateAngle(Throat, -0.17139133254584316F, 0.0F, 0.0F);
        this.BackLeftLeg2 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2.setRotationPoint(-0.5F, 4.9F, -0.6F);
        this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(BackLeftLeg2, 1.1196408818455437F, 0.0F, 0.0F);
        this.BackLeftLeg2_1 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2_1.setRotationPoint(-0.5F, 4.9F, -0.6F);
        this.BackLeftLeg2_1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(BackLeftLeg2_1, 1.1196408818455437F, 0.0F, 0.0F);
        this.Head.addChild(this.Snout);
        this.BackLeftLeg2.addChild(this.BackLeftleg3);
        this.FrontRightLeg1.addChild(this.FrontLeftLeg2_1);
        this.BackLeftleg3.addChild(this.BackLeftFoot);
        this.Body.addChild(this.Neck);
        this.Head.addChild(this.RightEar);
        this.BackLeftLeg2_1.addChild(this.BackLeftleg3_1);
        this.SnoutCheeks.addChild(this.SnoutCheeks2);
        this.shape32.addChild(this.Head);
        this.FrontLeftLeg2_1.addChild(this.FrontLeftFoot_1);
        this.ButtBody.addChild(this.hip);
        this.Head.addChild(this.LeftEar);
        this.Neck.addChild(this.shape32);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.Body.addChild(this.ButtBody);
        this.Snout.addChild(this.SnoutCheeks);
        this.BackLeftleg3_1.addChild(this.BackLeftFoot_1);
        this.SnoutCheeks.addChild(this.Nose);
        this.Snout.addChild(this.Snout2);
        this.FrontLeftLeg2.addChild(this.FrontLeftFoot);
        this.Neck.addChild(this.Throat);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.BackRightLeg1.addChild(this.BackLeftLeg2_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.BackLeftLeg1.render(f5);
        this.BackRightLeg1.render(f5);
        this.FrontLeftLeg1.render(f5);
        this.FrontRightLeg1.render(f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
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
    this.FrontLeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.FrontRightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.BackRightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.BackLeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
}
}