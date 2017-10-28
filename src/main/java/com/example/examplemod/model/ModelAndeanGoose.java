package com.example.examplemod.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Andean Goose - Oceanssss
 * Created using Tabula 5.1.0
 */
public class ModelAndeanGoose extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer Butt;
    public ModelRenderer RightThigh;
    public ModelRenderer LEFTThigh;
    public ModelRenderer RightWing1;
    public ModelRenderer LeftWing1;
    public ModelRenderer shape23;
    public ModelRenderer shape65;
    public ModelRenderer shape66;
    public ModelRenderer shape67;
    public ModelRenderer Head;
    public ModelRenderer Beak;
    public ModelRenderer shape61;
    public ModelRenderer TailFeather1;
    public ModelRenderer TailFeather2;
    public ModelRenderer TailFeather3;
    public ModelRenderer SmallTailFeather1;
    public ModelRenderer SmallTailFeather2;
    public ModelRenderer RightLeg;
    public ModelRenderer RightToe;
    public ModelRenderer LEFTleg;
    public ModelRenderer LEFTtoe;
    public ModelRenderer RightWing2;
    public ModelRenderer RightWing3;
    public ModelRenderer RightWing4;
    public ModelRenderer LeftWing2;
    public ModelRenderer shape59;
    public ModelRenderer shape60;

    public ModelAndeanGoose() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.TailFeather1 = new ModelRenderer(this, 30, 75);
        this.TailFeather1.setRotationPoint(1.5F, -0.8F, 2.2F);
        this.TailFeather1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(TailFeather1, -0.3438298626428829F, 0.0F, 0.0F);
        this.SmallTailFeather2 = new ModelRenderer(this, 30, 75);
        this.SmallTailFeather2.setRotationPoint(-0.4F, -0.7F, 2.2F);
        this.SmallTailFeather2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(SmallTailFeather2, -0.3438298626428829F, 0.15707963267948966F, 0.0F);
        this.LeftWing1 = new ModelRenderer(this, 34, 0);
        this.LeftWing1.setRotationPoint(5.5F, 0.4F, 0.3F);
        this.LeftWing1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(LeftWing1, -3.141592653589793F, 3.141592653589793F, 3.141592653589793F);
        this.shape60 = new ModelRenderer(this, 0, 35);
        this.shape60.setRotationPoint(0.0F, -2.0F, -0.1F);
        this.shape60.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.TailFeather2 = new ModelRenderer(this, 30, 75);
        this.TailFeather2.setRotationPoint(0.3F, -0.8F, 2.2F);
        this.TailFeather2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(TailFeather2, -0.3438298626428829F, 0.06981317007977318F, 0.0F);
        this.LEFTleg = new ModelRenderer(this, 0, 108);
        this.LEFTleg.setRotationPoint(0.5F, 2.3F, 0.6F);
        this.LEFTleg.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LEFTleg, -0.16388641676226753F, -0.0F, 0.0F);
        this.RightWing2 = new ModelRenderer(this, 56, 20);
        this.RightWing2.setRotationPoint(-0.05F, 6.8F, 1.0F);
        this.RightWing2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 6, 0.0F);
        this.setRotateAngle(RightWing2, -3.141592653589793F, 0.0F, 0.0F);
        this.RightToe = new ModelRenderer(this, 0, 117);
        this.RightToe.setRotationPoint(-0.5F, 4.7F, 1.1F);
        this.RightToe.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(RightToe, -2.9140017191297325F, 0.0F, 0.0F);
        this.TailFeather3 = new ModelRenderer(this, 30, 75);
        this.TailFeather3.setRotationPoint(2.5F, -0.7F, 2.2F);
        this.TailFeather3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(TailFeather3, -0.34557519189487723F, -0.06981317007977318F, 0.0F);
        this.Butt = new ModelRenderer(this, 0, 97);
        this.Butt.setRotationPoint(0.5F, 1.5F, 5.7F);
        this.Butt.addBox(0.0F, 0.0F, 0.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(Butt, 0.31869712141416456F, -0.0F, 0.0F);
        this.RightThigh = new ModelRenderer(this, 19, 104);
        this.RightThigh.setRotationPoint(0.2F, 5.0F, 3.8F);
        this.RightThigh.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RightThigh, 0.045553093477052F, -0.0F, 0.0F);
        this.RightWing4 = new ModelRenderer(this, 0, 35);
        this.RightWing4.setRotationPoint(0.0F, -0.1F, -2.0F);
        this.RightWing4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.shape61 = new ModelRenderer(this, 21, 48);
        this.shape61.setRotationPoint(0.0F, -0.7F, 0.8F);
        this.shape61.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape61, -0.4553564018453205F, 0.0F, 0.0F);
        this.RightWing1 = new ModelRenderer(this, 34, 18);
        this.RightWing1.setRotationPoint(0.2F, 0.4F, 7.3F);
        this.RightWing1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(RightWing1, 3.141592653589793F, 0.0F, -3.141592653589793F);
        this.Head = new ModelRenderer(this, 0, 53);
        this.Head.setRotationPoint(0.0F, 0.8F, 1.2F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Head, 1.17268672441499F, 0.0F, 0.0F);
        this.LEFTThigh = new ModelRenderer(this, 19, 104);
        this.LEFTThigh.setRotationPoint(3.8F, 5.0F, 3.8F);
        this.LEFTThigh.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LEFTThigh, 0.045553093477052F, -0.0F, 0.0F);
        this.shape23 = new ModelRenderer(this, 0, 11);
        this.shape23.setRotationPoint(0.5F, -1.3F, 3.2F);
        this.shape23.addBox(0.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(shape23, -0.010995574287564275F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 80);
        this.Body.setRotationPoint(-2.5F, 11.7F, -1.2F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(Body, -0.10681415022205297F, -0.0F, 0.0F);
        this.shape59 = new ModelRenderer(this, 13, 25);
        this.shape59.setRotationPoint(0.0F, 4.0F, 7.0F);
        this.shape59.addBox(0.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(shape59, -3.141592653589793F, 0.020420352248333655F, 0.0F);
        this.shape65 = new ModelRenderer(this, 18, 34);
        this.shape65.setRotationPoint(0.0F, 0.4F, 2.0F);
        this.shape65.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(shape65, -0.6373942428283291F, 0.0F, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 108);
        this.RightLeg.setRotationPoint(0.5F, 2.3F, 0.6F);
        this.RightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RightLeg, -0.16388641676226753F, -0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 64);
        this.Neck.setRotationPoint(0.5F, 4.9F, 1.9F);
        this.Neck.addBox(0.0F, -2.0F, 0.0F, 5, 6, 4, 0.0F);
        this.setRotateAngle(Neck, 2.602984046424343F, 0.0F, 0.0F);
        this.SmallTailFeather1 = new ModelRenderer(this, 30, 75);
        this.SmallTailFeather1.setRotationPoint(3.2F, -0.7F, 2.2F);
        this.SmallTailFeather1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(SmallTailFeather1, -0.3438298626428829F, -0.15707963267948966F, 0.0F);
        this.RightWing3 = new ModelRenderer(this, 13, 25);
        this.RightWing3.setRotationPoint(0.0F, 7.0F, 4.0F);
        this.RightWing3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(RightWing3, -3.141592653589793F, 0.0F, -0.020420352248333655F);
        this.shape67 = new ModelRenderer(this, 17, 20);
        this.shape67.setRotationPoint(0.0F, -1.4F, 0.5F);
        this.shape67.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(shape67, 0.22759093446006054F, 0.0F, 0.0F);
        this.Beak = new ModelRenderer(this, 21, 55);
        this.Beak.setRotationPoint(1.5F, 1.7F, 4.5F);
        this.Beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Beak, 0.40980330836826856F, 0.0F, 0.0F);
        this.LeftWing2 = new ModelRenderer(this, 55, 0);
        this.LeftWing2.setRotationPoint(-0.05F, 6.8F, 6.0F);
        this.LeftWing2.addBox(0.0F, 0.0F, 0.0F, 1, 6, 7, 0.0F);
        this.setRotateAngle(LeftWing2, 1.593485607070823F, 0.0F, 0.0F);
        this.shape66 = new ModelRenderer(this, 16, 11);
        this.shape66.setRotationPoint(0.0F, 2.15F, 4.2F);
        this.shape66.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(shape66, 0.40980330836826856F, 0.0F, 0.0F);
        this.LEFTtoe = new ModelRenderer(this, 0, 117);
        this.LEFTtoe.setRotationPoint(-0.5F, 4.7F, 1.1F);
        this.LEFTtoe.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LEFTtoe, -2.9140017191297325F, 0.0F, 0.0F);
        this.Butt.addChild(this.TailFeather1);
        this.Butt.addChild(this.SmallTailFeather2);
        this.Body.addChild(this.LeftWing1);
        this.shape59.addChild(this.shape60);
        this.Butt.addChild(this.TailFeather2);
        this.LEFTThigh.addChild(this.LEFTleg);
        this.RightWing1.addChild(this.RightWing2);
        this.RightLeg.addChild(this.RightToe);
        this.Butt.addChild(this.TailFeather3);
        this.Body.addChild(this.Butt);
        this.Body.addChild(this.RightThigh);
        this.RightWing3.addChild(this.RightWing4);
        this.Beak.addChild(this.shape61);
        this.Body.addChild(this.RightWing1);
        this.shape66.addChild(this.Head);
        this.Body.addChild(this.LEFTThigh);
        this.Neck.addChild(this.shape23);
        this.LeftWing2.addChild(this.shape59);
        this.shape23.addChild(this.shape65);
        this.RightThigh.addChild(this.RightLeg);
        this.Body.addChild(this.Neck);
        this.Butt.addChild(this.SmallTailFeather1);
        this.RightWing2.addChild(this.RightWing3);
        this.shape66.addChild(this.shape67);
        this.Head.addChild(this.Beak);
        this.LeftWing1.addChild(this.LeftWing2);
        this.shape65.addChild(this.shape66);
        this.LEFTleg.addChild(this.LEFTtoe);
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
        this.LEFTThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.7777F) * 1.4F * limbSwingAmount;
        this.RightThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.7777F + (float)Math.PI) * 1.4F * limbSwingAmount;
        
        
    }
}
