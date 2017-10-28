package com.example.examplemod.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Pampas Fox - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelPampasFox extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer FrontLeftLegAnimationC;
    public ModelRenderer FrontRightLegAnimationC;
    public ModelRenderer Neck;
    public ModelRenderer ButtBody;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer Jaw;
    public ModelRenderer SnoutCheeks;
    public ModelRenderer Nose;
    public ModelRenderer Tail1;
    public ModelRenderer BackLeftLeg1;
    public ModelRenderer BackRightLeg1;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer BackLeftLeg2;
    public ModelRenderer BackLeftFoot;
    public ModelRenderer BackRightLeg2;
    public ModelRenderer BackRightFoot;
    public ModelRenderer FrontLeftLeg1;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontRightLeg1;
    public ModelRenderer FrontRightLeg2;

    public ModelPampasFox() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.Tail4 = new ModelRenderer(this, 163, 0);
        this.Tail4.setRotationPoint(0.5F, 6.3F, 0.7F);
        this.Tail4.addBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(Tail4, -0.045553093477052F, 0.0F, 0.0F);
        this.SnoutCheeks = new ModelRenderer(this, 0, 0);
        this.SnoutCheeks.setRotationPoint(-1.0F, -0.5F, -6.8F);
        this.SnoutCheeks.addBox(0.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(SnoutCheeks, -0.045553093477052F, 0.0F, 0.0F);
        this.BackRightLeg1 = new ModelRenderer(this, 30, 0);
        this.BackRightLeg1.setRotationPoint(0.1F, 6.2F, 7.0F);
        this.BackRightLeg1.addBox(-1.0F, 0.0F, -1.0F, 3, 8, 5, 0.0F);
        this.setRotateAngle(BackRightLeg1, -0.2506292805863857F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 20);
        this.Nose.setRotationPoint(1.5F, -0.1F, -0.1F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Jaw = new ModelRenderer(this, 0, 25);
        this.Jaw.setRotationPoint(-0.4F, 3.5F, 0.4F);
        this.Jaw.addBox(0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F);
        this.setRotateAngle(Jaw, -3.141592653589793F, 0.0F, 0.0F);
        this.FrontLeftLeg2 = new ModelRenderer(this, 0, 63);
        this.FrontLeftLeg2.setRotationPoint(0.5F, 6.3F, 3.6F);
        this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(FrontLeftLeg2, -1.730144887501979F, 0.0F, 0.0F);
        this.BackRightLeg2 = new ModelRenderer(this, 52, 0);
        this.BackRightLeg2.setRotationPoint(-0.5F, 7.7F, -0.1F);
        this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(BackRightLeg2, 0.6373942428283291F, 0.0F, 0.0F);
        this.FrontLeftLegAnimationC = new ModelRenderer(this, 0, 0);
        this.FrontLeftLegAnimationC.setRotationPoint(3.3F, 10.5F, -11.0F);
        this.FrontLeftLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FrontLeftLegAnimationC, -1.6845917940249266F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 100, 0);
        this.Tail1.setRotationPoint(3.5F, 1.1F, 9.1F);
        this.Tail1.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Tail1, 0.5935864786032714F, 0.0F, 0.0F);
        this.BackRightFoot = new ModelRenderer(this, 66, 0);
        this.BackRightFoot.setRotationPoint(0.0F, 5.9F, 2.7F);
        this.BackRightFoot.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(BackRightFoot, -2.160892146894179F, 0.0F, 0.0F);
        this.BackLeftLeg2 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2.setRotationPoint(-0.5F, 7.7F, -0.1F);
        this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(BackLeftLeg2, 0.6373942428283291F, 0.0F, 0.0F);
        this.BackLeftFoot = new ModelRenderer(this, 66, 0);
        this.BackLeftFoot.setRotationPoint(0.0F, 5.9F, 2.7F);
        this.BackLeftFoot.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(BackLeftFoot, -2.1553070932877976F, 0.0F, 0.0F);
        this.FrontRightLegAnimationC = new ModelRenderer(this, 0, 0);
        this.FrontRightLegAnimationC.setRotationPoint(-3.3F, 10.5F, -11.0F);
        this.FrontRightLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FrontRightLegAnimationC, -1.6845917940249266F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 0, 36);
        this.RightEar.setRotationPoint(-3.8F, -6.2F, 3.7F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.10681415022205297F, -0.12217304763960307F, -0.1884955592153876F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontLeftLeg1.setRotationPoint(-1.4F, 0.9F, 1.1F);
        this.FrontLeftLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(FrontLeftLeg1, 1.8212510744560826F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 76, 13);
        this.Head.setRotationPoint(2.5F, 1.5F, 11.7F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 8, 7, 8, 0.0F);
        this.setRotateAngle(Head, -2.276432943376204F, 0.0F, 0.0017453292519943296F);
        this.BackLeftLeg1 = new ModelRenderer(this, 30, 0);
        this.BackLeftLeg1.setRotationPoint(6.9F, 6.2F, 7.0F);
        this.BackLeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 3, 8, 5, 0.0F);
        this.setRotateAngle(BackLeftLeg1, -0.2495820830351891F, 0.0F, 0.0F);
        this.FrontRightLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontRightLeg1.setRotationPoint(-0.4F, 0.9F, 1.1F);
        this.FrontRightLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(FrontRightLeg1, 1.8212510744560826F, 0.0F, 0.0F);
        this.FrontRightLeg2 = new ModelRenderer(this, 0, 63);
        this.FrontRightLeg2.setRotationPoint(0.5F, 6.3F, 3.6F);
        this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(FrontRightLeg2, -1.730144887501979F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 120, 0);
        this.Tail2.setRotationPoint(-1.0F, 6.6F, -1.7F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Tail2, -0.023736477827122883F, 0.0F, 0.0F);
        this.ButtBody = new ModelRenderer(this, 67, 34);
        this.ButtBody.setRotationPoint(0.5F, 11.6F, 12.0F);
        this.ButtBody.addBox(0.0F, 0.0F, 0.0F, 8, 12, 11, 0.0F);
        this.setRotateAngle(ButtBody, -1.533969879577816F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 42, 17);
        this.Neck.setRotationPoint(1.0F, 0.3F, 0.6F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 7, 8, 10, 0.0F);
        this.setRotateAngle(Neck, 0.6829473363053812F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 37);
        this.Body.setRotationPoint(-3.9F, 13.5F, -12.5F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 9, 13, 12, 0.0F);
        this.setRotateAngle(Body, 1.593485607070823F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 36);
        this.LeftEar.setRotationPoint(2.9F, -6.7F, 4.0F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.10681415022205297F, 0.12217304763960307F, 0.1884955592153876F);
        this.Snout = new ModelRenderer(this, 8, 16);
        this.Snout.setRotationPoint(-1.0F, -2.9F, -1.5F);
        this.Snout.addBox(0.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(Snout, -1.0016444577195458F, 0.0F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 140, 0);
        this.Tail3.setRotationPoint(-0.5F, 2.2F, -0.4F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Tail3, -0.045553093477052F, 0.0F, 0.0F);
        this.Tail3.addChild(this.Tail4);
        this.Head.addChild(this.SnoutCheeks);
        this.ButtBody.addChild(this.BackRightLeg1);
        this.SnoutCheeks.addChild(this.Nose);
        this.Head.addChild(this.Jaw);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.BackRightLeg1.addChild(this.BackRightLeg2);
        this.ButtBody.addChild(this.Tail1);
        this.BackRightLeg2.addChild(this.BackRightFoot);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.BackLeftLeg2.addChild(this.BackLeftFoot);
        this.Head.addChild(this.RightEar);
        this.FrontLeftLegAnimationC.addChild(this.FrontLeftLeg1);
        this.Neck.addChild(this.Head);
        this.ButtBody.addChild(this.BackLeftLeg1);
        this.FrontRightLegAnimationC.addChild(this.FrontRightLeg1);
        this.FrontRightLeg1.addChild(this.FrontRightLeg2);
        this.Tail1.addChild(this.Tail2);
        this.Body.addChild(this.ButtBody);
        this.Body.addChild(this.Neck);
        this.Head.addChild(this.LeftEar);
        this.Head.addChild(this.Snout);
        this.Tail2.addChild(this.Tail3);
    }





    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor = 0.5F;
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
        float f6 = (180F / (float)Math.PI);
        this.BackRightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BackLeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
}
}
    
