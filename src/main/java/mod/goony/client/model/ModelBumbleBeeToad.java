package mod.goony.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Bumble Bee Toad - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelBumbleBeeToad extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer LeftBackLeg;
    public ModelRenderer RightBackLeg;
    public ModelRenderer LeftFrontLeg;
    public ModelRenderer RightFrontLeg;
    public ModelRenderer Head;
    public ModelRenderer shape6;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer LeftBackFoot;
    public ModelRenderer RightBackFoot;

    public ModelBumbleBeeToad() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Neck = new ModelRenderer(this, 21, 16);
        this.Neck.setRotationPoint(0.5F, 0.2F, -0.8F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Neck, -0.16318828506146982F, 0.0F, 0.0F);
        this.RightFrontLeg = new ModelRenderer(this, 0, 12);
        this.RightFrontLeg.setRotationPoint(-0.3F, 3.6F, 0.5F);
        this.RightFrontLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightFrontLeg, -0.36425021489121656F, 0.0F, 0.0F);
        this.RightBackFoot = new ModelRenderer(this, 9, 0);
        this.RightBackFoot.setRotationPoint(0.0F, 3.5F, -0.6F);
        this.RightBackFoot.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(RightBackFoot, 0.43493604959698695F, 0.0F, 0.0F);
        this.LeftBackLeg = new ModelRenderer(this, 0, 0);
        this.LeftBackLeg.setRotationPoint(4.6F, 2.2F, 5.2F);
        this.LeftBackLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(LeftBackLeg, -0.36425021489121656F, 0.0F, 0.0F);
        this.shape6 = new ModelRenderer(this, 5, 8);
        this.shape6.setRotationPoint(0.5F, 1.7F, -2.1F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(shape6, -0.15655603390389136F, 0.0F, 0.0F);
        this.RightBackLeg = new ModelRenderer(this, 0, 0);
        this.RightBackLeg.setRotationPoint(-0.6F, 2.2F, 5.2F);
        this.RightBackLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(RightBackLeg, -0.36425021489121656F, 0.0F, -0.0033161255787892262F);
        this.shape5 = new ModelRenderer(this, 2, 8);
        this.shape5.setRotationPoint(3.3F, 0.1F, 1.7F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape5, 0.0F, 0.0F, -0.19303341527057286F);
        this.LeftBackFoot = new ModelRenderer(this, 9, 0);
        this.LeftBackFoot.setRotationPoint(0.0F, 3.5F, -0.6F);
        this.LeftBackFoot.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(LeftBackFoot, 0.43493604959698695F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 21, 0);
        this.Head.setRotationPoint(0.0F, 1.25F, -3.8F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Head, 0.31869712141416456F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 2, 8);
        this.shape4.setRotationPoint(-0.3F, -0.1F, 1.7F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape4, 0.0F, 0.0F, 0.19303341527057286F);
        this.LeftFrontLeg = new ModelRenderer(this, 0, 12);
        this.LeftFrontLeg.setRotationPoint(4.3F, 3.6F, 0.5F);
        this.LeftFrontLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftFrontLeg, -0.36425021489121656F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 15);
        this.Body.setRotationPoint(-3.0F, 17.6F, -2.2F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Body, -0.091106186954104F, 0.0F, 0.0F);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.RightFrontLeg);
        this.RightBackLeg.addChild(this.RightBackFoot);
        this.Body.addChild(this.LeftBackLeg);
        this.Neck.addChild(this.shape6);
        this.Body.addChild(this.RightBackLeg);
        this.Head.addChild(this.shape5);
        this.LeftBackLeg.addChild(this.LeftBackFoot);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.shape4);
        this.Body.addChild(this.LeftFrontLeg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor = 0.4F;
    	GL11.glPushMatrix();
    	GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
    	this.Body.render(f5);
    	GL11.glPopMatrix();
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
