package com.example.examplemod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Andean Goose Gosling - Oceanssss
 * Created using Tabula 5.1.0
 */
public class ModelAndeanGosling extends ModelBase {
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
    public ModelRenderer Head;
    public ModelRenderer Beak;
    public ModelRenderer shape61;
    public ModelRenderer RightLeg;
    public ModelRenderer RightToe;
    public ModelRenderer LEFTleg;
    public ModelRenderer LEFTtoe;

    public ModelAndeanGosling() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.shape65 = new ModelRenderer(this, 18, 34);
        this.shape65.setRotationPoint(0.0F, 0.1F, 1.9F);
        this.shape65.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(shape65, -0.6373942428283291F, 0.0F, 0.0F);
        this.shape66 = new ModelRenderer(this, 16, 11);
        this.shape66.setRotationPoint(0.0F, 1.15F, 2.2F);
        this.shape66.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(shape66, 0.40980330836826856F, 0.0F, 0.0F);
        this.shape23 = new ModelRenderer(this, 0, 11);
        this.shape23.setRotationPoint(0.5F, -1.6F, 3.3F);
        this.shape23.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(shape23, -0.31869712141416456F, 0.0F, 0.0F);
        this.Beak = new ModelRenderer(this, 21, 55);
        this.Beak.setRotationPoint(1.5F, 1.9F, 3.0F);
        this.Beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Beak, 0.40980330836826856F, 0.0F, 0.0F);
        this.RightToe = new ModelRenderer(this, 0, 117);
        this.RightToe.setRotationPoint(-0.5F, 3.5F, 1.2F);
        this.RightToe.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(RightToe, -2.9140017191297325F, 0.0F, 0.0F);
        this.LEFTThigh = new ModelRenderer(this, 19, 104);
        this.LEFTThigh.setRotationPoint(3.8F, 5.0F, 3.3F);
        this.LEFTThigh.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LEFTThigh, 0.045553093477052F, -0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 80);
        this.Body.setRotationPoint(-2.5F, 13.7F, -1.2F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Body, -0.10681415022205297F, -0.0F, 0.0F);
        this.RightWing1 = new ModelRenderer(this, 34, 18);
        this.RightWing1.setRotationPoint(0.2F, 0.4F, 6.3F);
        this.RightWing1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(RightWing1, 3.141592653589793F, 0.0F, -3.141592653589793F);
        this.Head = new ModelRenderer(this, 0, 53);
        this.Head.setRotationPoint(0.0F, 0.8F, 0.3F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Head, 1.17268672441499F, 0.0F, 0.0F);
        this.LEFTtoe = new ModelRenderer(this, 0, 117);
        this.LEFTtoe.setRotationPoint(-0.5F, 3.5F, 1.2F);
        this.LEFTtoe.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(LEFTtoe, -2.9140017191297325F, 0.0F, 0.0F);
        this.shape61 = new ModelRenderer(this, 21, 48);
        this.shape61.setRotationPoint(0.0F, -0.4F, 1.3F);
        this.shape61.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape61, -0.4553564018453205F, 0.0F, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 108);
        this.RightLeg.setRotationPoint(0.5F, 1.5F, 0.6F);
        this.RightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightLeg, -0.16388641676226753F, -0.0F, 0.0F);
        this.LEFTleg = new ModelRenderer(this, 0, 108);
        this.LEFTleg.setRotationPoint(0.5F, 1.5F, 0.6F);
        this.LEFTleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LEFTleg, -0.16388641676226753F, -0.0F, 0.0F);
        this.Butt = new ModelRenderer(this, 0, 97);
        this.Butt.setRotationPoint(0.5F, 0.2F, 6.0F);
        this.Butt.addBox(0.0F, 0.0F, 0.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(Butt, -0.4553564018453205F, -0.0F, 0.0F);
        this.RightThigh = new ModelRenderer(this, 19, 104);
        this.RightThigh.setRotationPoint(0.2F, 5.0F, 3.3F);
        this.RightThigh.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RightThigh, 0.045553093477052F, -0.0F, 0.0F);
        this.LeftWing1 = new ModelRenderer(this, 34, 0);
        this.LeftWing1.setRotationPoint(5.5F, 0.4F, 0.3F);
        this.LeftWing1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(LeftWing1, -3.141592653589793F, 3.141592653589793F, 3.141592653589793F);
        this.Neck = new ModelRenderer(this, 0, 64);
        this.Neck.setRotationPoint(0.5F, 4.0F, 1.6F);
        this.Neck.addBox(0.0F, -2.0F, 0.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Neck, 2.777342438698576F, 0.0F, 0.0F);
        this.shape23.addChild(this.shape65);
        this.shape65.addChild(this.shape66);
        this.Neck.addChild(this.shape23);
        this.Head.addChild(this.Beak);
        this.RightLeg.addChild(this.RightToe);
        this.Body.addChild(this.LEFTThigh);
        this.Body.addChild(this.RightWing1);
        this.shape66.addChild(this.Head);
        this.LEFTleg.addChild(this.LEFTtoe);
        this.Beak.addChild(this.shape61);
        this.RightThigh.addChild(this.RightLeg);
        this.LEFTThigh.addChild(this.LEFTleg);
        this.Body.addChild(this.Butt);
        this.Body.addChild(this.RightThigh);
        this.Body.addChild(this.LeftWing1);
        this.Body.addChild(this.Neck);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
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
}
