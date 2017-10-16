package com.example.examplemod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Chinchilla (Gray) - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelChinchilla extends ModelBase {
    public double[] modelScale = new double[] { 2.3D, 2.3D, 2.3D };
    public ModelRenderer Body;
    public ModelRenderer FrontLeftLeg1;
    public ModelRenderer FrontRightLeg1;
    public ModelRenderer BackRightLeg1;
    public ModelRenderer BackLeftLeg1;
    public ModelRenderer Neck;
    public ModelRenderer ButtBody;
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
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontLeftFoot;
    public ModelRenderer FrontRightLeg2;
    public ModelRenderer FrontRightFoot;
    public ModelRenderer BackRightLeg2;
    public ModelRenderer BackRightFoot;
    public ModelRenderer BackLeftLeg2;
    public ModelRenderer BackLeftFoot;

    public ModelChinchilla() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.Neck = new ModelRenderer(this, 42, 17);
        this.Neck.setRotationPoint(0.5F, 0.2F, 0.4F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(Neck, 0.8806931405563386F, 0.0F, 0.0F);
        this.Tail4 = new ModelRenderer(this, 163, 0);
        this.Tail4.setRotationPoint(-0.5F, 6.4F, 0.2F);
        this.Tail4.addBox(0.0F, 0.0F, 0.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(Tail4, 0.18203784098300857F, 0.0F, 0.0F);
        this.SnoutCheeks_1 = new ModelRenderer(this, 0, 0);
        this.SnoutCheeks_1.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.SnoutCheeks_1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.RightEar = new ModelRenderer(this, 0, 36);
        this.RightEar.setRotationPoint(-5.1F, -9.1F, 1.6F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.10681415022205297F, -0.12217304763960307F, -0.1884955592153876F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontLeftLeg1.setRotationPoint(2.0F, 48.7F, -7.3F);
        this.FrontLeftLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FrontLeftLeg1, 0.6829473363053812F, 0.0F, 0.0F);
        this.FrontRightLeg2 = new ModelRenderer(this, 0, 60);
        this.FrontRightLeg2.setRotationPoint(0.5F, 4.5F, 3.5F);
        this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(FrontRightLeg2, -2.457423586808016F, 0.0F, 0.0F);
        this.BackLeftFoot = new ModelRenderer(this, 66, 0);
        this.BackLeftFoot.setRotationPoint(-0.5F, 9.2F, 1.1F);
        this.BackLeftFoot.addBox(0.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(BackLeftFoot, 2.321986036853256F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 20);
        this.Nose.setRotationPoint(3.0F, -0.4F, -0.1F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.BackLeftLeg1 = new ModelRenderer(this, 30, 0);
        this.BackLeftLeg1.setRotationPoint(3.0F, 42.9F, 7.8F);
        this.BackLeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 4, 8, 6, 0.0F);
        this.setRotateAngle(BackLeftLeg1, -0.6373942428283291F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 76, 13);
        this.Head.setRotationPoint(2.5F, 3.6F, 9.9F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 9, 8, 7, 0.0F);
        this.setRotateAngle(Head, -2.4586453172844123F, 0.0F, 0.0017453292519943296F);
        this.BackRightLeg1 = new ModelRenderer(this, 30, 0);
        this.BackRightLeg1.setRotationPoint(-4.1F, 42.9F, 8.3F);
        this.BackRightLeg1.addBox(-1.0F, 0.0F, -1.0F, 4, 7, 6, 0.0F);
        this.setRotateAngle(BackRightLeg1, -0.6373942428283291F, 0.0F, 0.0F);
        this.BackLeftLeg2 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2.setRotationPoint(-0.5F, 7.7F, -0.1F);
        this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.setRotateAngle(BackLeftLeg2, 1.4114477660878142F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 120, 0);
        this.Tail2.setRotationPoint(-1.5F, 6.6F, -1.5F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Tail2, 0.22759093446006054F, 0.0F, 0.0F);
        this.BackRightFoot = new ModelRenderer(this, 66, 0);
        this.BackRightFoot.setRotationPoint(-0.5F, 9.2F, 1.1F);
        this.BackRightFoot.addBox(0.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(BackRightFoot, 2.321287905152458F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 37);
        this.Body.setRotationPoint(-3.9F, 51.4F, -6.6F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 9, 10, 13, 0.0F);
        this.setRotateAngle(Body, 1.699950691442477F, 0.0F, 0.0F);
        this.Snout2 = new ModelRenderer(this, 0, 25);
        this.Snout2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Snout2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 3, 0.0F);
        this.setRotateAngle(Snout2, 0.4553564018453205F, 0.0F, 0.0F);
        this.UnderNose = new ModelRenderer(this, 21, 26);
        this.UnderNose.setRotationPoint(-0.5F, 0.2F, 0.2F);
        this.UnderNose.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
        this.Tail1 = new ModelRenderer(this, 100, 0);
        this.Tail1.setRotationPoint(4.5F, 9.4F, 9.4F);
        this.Tail1.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(Tail1, 1.4350097109897377F, 0.0F, 0.0F);
        this.FrontLeftFoot = new ModelRenderer(this, 0, 70);
        this.FrontLeftFoot.setRotationPoint(-0.5F, 0.0F, 5.3F);
        this.FrontLeftFoot.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FrontLeftFoot, -1.3658946726107624F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 8, 16);
        this.Snout.setRotationPoint(-2.0F, -2.9F, -2.0F);
        this.Snout.addBox(0.0F, 0.0F, 0.0F, 7, 3, 3, 0.0F);
        this.setRotateAngle(Snout, -0.686088928958971F, 0.0F, 0.0F);
        this.FrontLeftLeg2 = new ModelRenderer(this, 0, 60);
        this.FrontLeftLeg2.setRotationPoint(0.5F, 4.5F, 3.5F);
        this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(FrontLeftLeg2, -2.4586453172844123F, 0.0F, 0.0F);
        this.SnoutCheeks = new ModelRenderer(this, 0, 0);
        this.SnoutCheeks.setRotationPoint(-0.5F, 4.7F, 0.7F);
        this.SnoutCheeks.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(SnoutCheeks, 0.6672393730374321F, 0.0F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 140, 0);
        this.Tail3.setRotationPoint(0.03F, 6.7F, -0.7F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 4, 7, 6, 0.0F);
        this.setRotateAngle(Tail3, 0.28256880589788197F, 0.0F, 0.0F);
        this.BackRightLeg2 = new ModelRenderer(this, 52, 0);
        this.BackRightLeg2.setRotationPoint(-0.5F, 7.7F, -0.1F);
        this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.setRotateAngle(BackRightLeg2, 1.4114477660878142F, 0.0F, 0.0F);
        this.ButtBody = new ModelRenderer(this, 67, 34);
        this.ButtBody.setRotationPoint(-0.5F, 9.0F, 13.4F);
        this.ButtBody.addBox(0.0F, 0.0F, 0.0F, 10, 14, 11, 0.0F);
        this.setRotateAngle(ButtBody, -1.6596335857214082F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 36);
        this.LeftEar.setRotationPoint(4.1F, -9.8F, 2.1F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.10681415022205297F, 0.12217304763960307F, 0.1884955592153876F);
        this.FrontRightLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontRightLeg1.setRotationPoint(-3.7F, 49.1F, -7.0F);
        this.FrontRightLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FrontRightLeg1, 0.7740535232594852F, 0.0F, 0.0F);
        this.FrontRightFoot = new ModelRenderer(this, 0, 70);
        this.FrontRightFoot.setRotationPoint(-0.5F, 0.0F, 5.3F);
        this.FrontRightFoot.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FrontRightFoot, -1.3658946726107624F, 0.0F, 0.0F);
        this.Body.addChild(this.Neck);
        this.Tail3.addChild(this.Tail4);
        this.SnoutCheeks.addChild(this.SnoutCheeks_1);
        this.Head.addChild(this.RightEar);
        this.FrontRightLeg1.addChild(this.FrontRightLeg2);
        this.BackLeftLeg2.addChild(this.BackLeftFoot);
        this.SnoutCheeks.addChild(this.Nose);
        this.Neck.addChild(this.Head);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.Tail1.addChild(this.Tail2);
        this.BackRightLeg2.addChild(this.BackRightFoot);
        this.Snout.addChild(this.Snout2);
        this.Nose.addChild(this.UnderNose);
        this.ButtBody.addChild(this.Tail1);
        this.FrontLeftLeg2.addChild(this.FrontLeftFoot);
        this.Head.addChild(this.Snout);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.Snout.addChild(this.SnoutCheeks);
        this.Tail2.addChild(this.Tail3);
        this.BackRightLeg1.addChild(this.BackRightLeg2);
        this.Body.addChild(this.ButtBody);
        this.Head.addChild(this.LeftEar);
        this.FrontRightLeg2.addChild(this.FrontRightFoot);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        {
            super.render(entity, f, f1, f2, f3, f4, f5);
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            {
                if (this.isChild)
                {
                    float scaleFactor = 0.2F;
                    GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
                    GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
                    GL11.glPushMatrix();
                    GL11.glPopMatrix();
                    GlStateManager.pushMatrix();
                    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
                    GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
                    this.FrontLeftLeg1.render(f5);
                    this.BackLeftLeg1.render(f5);
                    this.BackRightLeg1.render(f5);
                    this.Body.render(f5);
                    this.FrontRightLeg1.render(f5);
                    GlStateManager.popMatrix();
            }
            else
            {
                float scaleFactor = 0.4F;
                GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
                GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
                GL11.glPushMatrix();
                GL11.glPopMatrix();
                GlStateManager.pushMatrix();
                setRotationAngles(f, f1, f2, f3, f4, f5, entity);
                GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
                this.FrontLeftLeg1.render(f5);
                this.BackLeftLeg1.render(f5);
                this.BackRightLeg1.render(f5);
                this.Body.render(f5);
                this.FrontRightLeg1.render(f5);
                GlStateManager.popMatrix();
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
        this.FrontLeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.FrontRightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BackRightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BackLeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
    }