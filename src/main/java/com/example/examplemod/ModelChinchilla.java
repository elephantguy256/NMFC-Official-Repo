package com.example.examplemod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Chinchilla - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelChinchilla extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer ButtBody;
    public ModelRenderer FrontLeftLegAnimationC;
    public ModelRenderer FrontRightLegAnimationC;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer SnoutCheeks;
    public ModelRenderer Snout2;
    public ModelRenderer Nose;
    public ModelRenderer SnoutCheeks_1;
    public ModelRenderer UnderNose;
    public ModelRenderer Tail1;
    public ModelRenderer BackLeftLegAnimationC;
    public ModelRenderer BackRightLegAnimationC;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer BackLeftLeg1;
    public ModelRenderer BackLeftLeg2;
    public ModelRenderer BackLeftFoot;
    public ModelRenderer BackRightLeg1;
    public ModelRenderer BackRightLeg2;
    public ModelRenderer BackRightFoot;
    public ModelRenderer FrontLeftLeg1;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontLeftFoot;
    public ModelRenderer FrontRightLeg1;
    public ModelRenderer FrontRightLeg2;
    public ModelRenderer FrontRightFoot;

    public ModelChinchilla() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.RightEar = new ModelRenderer(this, 0, 36);
        this.RightEar.setRotationPoint(-5.1F, -9.1F, 1.6F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.10681415022205297F, -0.12217304763960307F, -0.1884955592153876F);
        this.Snout = new ModelRenderer(this, 8, 16);
        this.Snout.setRotationPoint(-2.0F, -2.9F, -2.0F);
        this.Snout.addBox(0.0F, 0.0F, 0.0F, 7, 3, 3, 0.0F);
        this.setRotateAngle(Snout, -0.686088928958971F, 0.0F, 0.0F);
        this.BackRightFoot = new ModelRenderer(this, 66, 0);
        this.BackRightFoot.setRotationPoint(-0.5F, 9.2F, 1.1F);
        this.BackRightFoot.addBox(0.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(BackRightFoot, 2.321287905152458F, 0.0F, 0.0F);
        this.ButtBody = new ModelRenderer(this, 67, 34);
        this.ButtBody.setRotationPoint(-0.5F, 9.0F, 13.4F);
        this.ButtBody.addBox(0.0F, 0.0F, 0.0F, 10, 14, 11, 0.0F);
        this.setRotateAngle(ButtBody, -1.6596335857214082F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 120, 0);
        this.Tail2.setRotationPoint(-1.5F, 6.6F, -1.5F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Tail2, 0.22759093446006054F, 0.0F, 0.0F);
        this.SnoutCheeks = new ModelRenderer(this, 0, 0);
        this.SnoutCheeks.setRotationPoint(-0.5F, 4.7F, 0.7F);
        this.SnoutCheeks.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(SnoutCheeks, 0.6672393730374321F, 0.0F, 0.0F);
        this.BackLeftFoot = new ModelRenderer(this, 66, 0);
        this.BackLeftFoot.setRotationPoint(-0.5F, 9.2F, 1.1F);
        this.BackLeftFoot.addBox(0.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(BackLeftFoot, 2.321986036853256F, 0.0F, 0.0F);
        this.SnoutCheeks_1 = new ModelRenderer(this, 0, 0);
        this.SnoutCheeks_1.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.SnoutCheeks_1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.Tail1 = new ModelRenderer(this, 100, 0);
        this.Tail1.setRotationPoint(4.5F, 5.2F, 8.8F);
        this.Tail1.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(Tail1, 0.9105382707654417F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 20);
        this.Nose.setRotationPoint(3.0F, -0.4F, -0.1F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.BackRightLeg2 = new ModelRenderer(this, 52, 0);
        this.BackRightLeg2.setRotationPoint(-0.5F, 6.4F, -0.1F);
        this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.setRotateAngle(BackRightLeg2, 1.4114477660878142F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 76, 13);
        this.Head.setRotationPoint(2.5F, 3.6F, 9.9F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 9, 8, 7, 0.0F);
        this.setRotateAngle(Head, -2.4586453172844123F, 0.0F, 0.0017453292519943296F);
        this.Tail3 = new ModelRenderer(this, 140, 0);
        this.Tail3.setRotationPoint(0.03F, 6.7F, -0.7F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 4, 7, 6, 0.0F);
        this.setRotateAngle(Tail3, 0.28256880589788197F, 0.0F, 0.0F);
        this.FrontLeftFoot = new ModelRenderer(this, 0, 70);
        this.FrontLeftFoot.setRotationPoint(-0.5F, 0.0F, 5.3F);
        this.FrontLeftFoot.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FrontLeftFoot, -1.3658946726107624F, 0.0F, 0.0F);
        this.FrontRightFoot = new ModelRenderer(this, 0, 70);
        this.FrontRightFoot.setRotationPoint(-0.5F, 0.0F, 5.3F);
        this.FrontRightFoot.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FrontRightFoot, -1.3658946726107624F, 0.0F, 0.0F);
        this.BackLeftLegAnimationC = new ModelRenderer(this, 0, 0);
        this.BackLeftLegAnimationC.setRotationPoint(8.5F, 0.2F, 0.5F);
        this.BackLeftLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Body = new ModelRenderer(this, 18, 37);
        this.Body.setRotationPoint(-3.9F, 22.7F, -6.6F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 9, 10, 13, 0.0F);
        this.setRotateAngle(Body, 1.699950691442477F, 0.0F, 0.0F);
        this.BackLeftLeg2 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2.setRotationPoint(-0.5F, 7.7F, -0.1F);
        this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.setRotateAngle(BackLeftLeg2, 1.4114477660878142F, 0.0F, 0.0F);
        this.Snout2 = new ModelRenderer(this, 0, 25);
        this.Snout2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Snout2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 3, 0.0F);
        this.setRotateAngle(Snout2, 0.4553564018453205F, 0.0F, 0.0F);
        this.FrontLeftLegAnimationC = new ModelRenderer(this, 0, 0);
        this.FrontLeftLegAnimationC.setRotationPoint(7.5F, 0.4F, 0.4F);
        this.FrontLeftLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.FrontLeftLeg2 = new ModelRenderer(this, 0, 60);
        this.FrontLeftLeg2.setRotationPoint(0.5F, 4.7F, 3.5F);
        this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(FrontLeftLeg2, -2.4586453172844123F, 0.0F, 0.0F);
        this.Tail4 = new ModelRenderer(this, 163, 0);
        this.Tail4.setRotationPoint(-0.5F, 6.4F, 0.2F);
        this.Tail4.addBox(0.0F, 0.0F, 0.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(Tail4, 0.18203784098300857F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 42, 17);
        this.Neck.setRotationPoint(0.5F, 0.2F, 0.4F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(Neck, 0.8806931405563386F, 0.0F, 0.0F);
        this.FrontRightLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontRightLeg1.setRotationPoint(0.5F, -0.6F, 5.0F);
        this.FrontRightLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FrontRightLeg1, -1.0016444577195458F, 0.0F, 0.0F);
        this.UnderNose = new ModelRenderer(this, 21, 26);
        this.UnderNose.setRotationPoint(-0.5F, 0.2F, 0.2F);
        this.UnderNose.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
        this.BackRightLeg1 = new ModelRenderer(this, 30, 0);
        this.BackRightLeg1.setRotationPoint(-0.1F, 4.2F, 6.3F);
        this.BackRightLeg1.addBox(-1.0F, 0.0F, -1.0F, 4, 7, 6, 0.0F);
        this.setRotateAngle(BackRightLeg1, -0.6373942428283291F, 0.0F, 0.0F);
        this.FrontRightLeg2 = new ModelRenderer(this, 0, 60);
        this.FrontRightLeg2.setRotationPoint(0.5F, 4.7F, 3.5F);
        this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(FrontRightLeg2, -2.457423586808016F, 0.0F, 0.0F);
        this.BackRightLegAnimationC = new ModelRenderer(this, 0, 0);
        this.BackRightLegAnimationC.setRotationPoint(0.1F, 0.1F, 0.2F);
        this.BackRightLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 36);
        this.LeftEar.setRotationPoint(4.1F, -9.8F, 2.1F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.10681415022205297F, 0.12217304763960307F, 0.1884955592153876F);
        this.BackLeftLeg1 = new ModelRenderer(this, 30, 0);
        this.BackLeftLeg1.setRotationPoint(-0.5F, 4.2F, 6.3F);
        this.BackLeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 4, 8, 6, 0.0F);
        this.setRotateAngle(BackLeftLeg1, -0.6373942428283291F, 0.0F, 0.0F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontLeftLeg1.setRotationPoint(-1.9F, -0.6F, 5.0F);
        this.FrontLeftLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FrontLeftLeg1, -1.0016444577195458F, 0.0F, 0.0F);
        this.FrontRightLegAnimationC = new ModelRenderer(this, 0, 0);
        this.FrontRightLegAnimationC.setRotationPoint(0.3F, 0.6F, 0.4F);
        this.FrontRightLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Head.addChild(this.RightEar);
        this.Head.addChild(this.Snout);
        this.BackRightLeg2.addChild(this.BackRightFoot);
        this.Body.addChild(this.ButtBody);
        this.Tail1.addChild(this.Tail2);
        this.Snout.addChild(this.SnoutCheeks);
        this.BackLeftLeg2.addChild(this.BackLeftFoot);
        this.SnoutCheeks.addChild(this.SnoutCheeks_1);
        this.ButtBody.addChild(this.Tail1);
        this.SnoutCheeks.addChild(this.Nose);
        this.BackRightLeg1.addChild(this.BackRightLeg2);
        this.Neck.addChild(this.Head);
        this.Tail2.addChild(this.Tail3);
        this.FrontLeftLeg2.addChild(this.FrontLeftFoot);
        this.FrontRightLeg2.addChild(this.FrontRightFoot);
        this.ButtBody.addChild(this.BackLeftLegAnimationC);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.Snout.addChild(this.Snout2);
        this.Body.addChild(this.FrontLeftLegAnimationC);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.Tail3.addChild(this.Tail4);
        this.Body.addChild(this.Neck);
        this.FrontRightLegAnimationC.addChild(this.FrontRightLeg1);
        this.Nose.addChild(this.UnderNose);
        this.BackRightLegAnimationC.addChild(this.BackRightLeg1);
        this.FrontRightLeg1.addChild(this.FrontRightLeg2);
        this.ButtBody.addChild(this.BackRightLegAnimationC);
        this.Head.addChild(this.LeftEar);
        this.BackLeftLegAnimationC.addChild(this.BackLeftLeg1);
        this.FrontLeftLegAnimationC.addChild(this.FrontLeftLeg1);
        this.Body.addChild(this.FrontRightLegAnimationC);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor = 0.3F;
        GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
        GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
        GL11.glPushMatrix();
        GL11.glPopMatrix();
        this.Body.render(f5);
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
        this.FrontLeftLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.FrontRightLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BackLeftLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.FrontRightLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
    }