package mod.goony.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Patagonia Mara - Oceansssss
 * Created using Tabula 5.1.0
 */
public class ModelPatagonianMara extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer ButtBody;
    public ModelRenderer FrontLegAnimationC;
    public ModelRenderer FrontRightLegAnimationC;
    public ModelRenderer Throat;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer SnoutCheeks;
    public ModelRenderer shape50;
    public ModelRenderer SnoutCheeks2;
    public ModelRenderer Bucktooth;
    public ModelRenderer hip;
    public ModelRenderer BackLeftLegAnimationC;
    public ModelRenderer BackRightLegAnimationC;
    public ModelRenderer BackLeftLeg1;
    public ModelRenderer BackLeftLeg2;
    public ModelRenderer BackLeftleg3;
    public ModelRenderer BackRightLeg1;
    public ModelRenderer BackRightLeg2;
    public ModelRenderer BackRightleg3;
    public ModelRenderer FrontLeftLeg1;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontRightLeg1;
    public ModelRenderer FrontRightLeg2;

    public ModelPatagonianMara() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.BackRightLegAnimationC = new ModelRenderer(this, 0, 7);
        this.BackRightLegAnimationC.setRotationPoint(7.7F, 0.2F, 0.5F);
        this.BackRightLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.BackRightLeg1 = new ModelRenderer(this, 30, 0);
        this.BackRightLeg1.setRotationPoint(-7.5F, 7.3F, 7.3F);
        this.BackRightLeg1.addBox(-1.0F, 0.0F, -0.9F, 3, 7, 5, 0.0F);
        this.setRotateAngle(BackRightLeg1, -0.31869712141416456F, 0.0F, 0.0F);
        this.Bucktooth = new ModelRenderer(this, 0, 0);
        this.Bucktooth.setRotationPoint(2.0F, 2.3F, 0.1F);
        this.Bucktooth.addBox(0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F);
        this.BackRightLeg2 = new ModelRenderer(this, 52, 0);
        this.BackRightLeg2.setRotationPoint(-0.5F, 6.9F, -0.6F);
        this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(BackRightLeg2, 0.9105382707654417F, 0.0F, 0.0F);
        this.shape50 = new ModelRenderer(this, 0, 25);
        this.shape50.setRotationPoint(0.0F, 2.7F, 0.08F);
        this.shape50.addBox(0.0F, 0.0F, 0.0F, 6, 3, 2, 0.0F);
        this.setRotateAngle(shape50, -0.22759093446006054F, 0.0F, 0.0F);
        this.FrontRightLeg2 = new ModelRenderer(this, 0, 63);
        this.FrontRightLeg2.setRotationPoint(0.5F, 5.3F, 2.7F);
        this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(FrontRightLeg2, -1.730144887501979F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 42, 17);
        this.Neck.setRotationPoint(0.5F, 0.3F, 2.8F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 7, 8, 9, 0.0F);
        this.setRotateAngle(Neck, 0.9105382707654417F, 0.0F, 0.0F);
        this.FrontLegAnimationC = new ModelRenderer(this, 0, 7);
        this.FrontLegAnimationC.setRotationPoint(6.8F, 0.1F, 0.7F);
        this.FrontLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.SnoutCheeks2 = new ModelRenderer(this, 23, 28);
        this.SnoutCheeks2.setRotationPoint(0.5F, 3.0F, 5.1F);
        this.SnoutCheeks2.addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.setRotateAngle(SnoutCheeks2, -1.593485607070823F, 0.0F, 0.0F);
        this.BackRightleg3 = new ModelRenderer(this, 66, 2);
        this.BackRightleg3.setRotationPoint(0.0F, 6.8F, 2.9F);
        this.BackRightleg3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(BackRightleg3, 3.947934768011173F, 0.0F, 0.0F);
        this.SnoutCheeks = new ModelRenderer(this, 0, 6);
        this.SnoutCheeks.setRotationPoint(-2.0F, 0.8F, -6.7F);
        this.SnoutCheeks.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.ButtBody = new ModelRenderer(this, 67, 34);
        this.ButtBody.setRotationPoint(-0.5F, 9.6F, 13.5F);
        this.ButtBody.addBox(0.0F, 0.0F, 0.0F, 9, 14, 10, 0.0F);
        this.setRotateAngle(ButtBody, -1.593485607070823F, 0.0F, 0.0F);
        this.BackLeftLeg2 = new ModelRenderer(this, 52, 0);
        this.BackLeftLeg2.setRotationPoint(-0.5F, 6.9F, -0.6F);
        this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(BackLeftLeg2, 0.9105382707654417F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 13, 36);
        this.RightEar.setRotationPoint(-1.8F, -2.4F, 0.6F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.0F, 2.9380872628072545F);
        this.FrontRightLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontRightLeg1.setRotationPoint(-1.0F, -0.1F, 1.7F);
        this.FrontRightLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(FrontRightLeg1, -1.5025539530419183F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 37);
        this.Body.setRotationPoint(-3.9F, 12.3F, -8.1F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 11, 13, 0.0F);
        this.setRotateAngle(Body, 1.593485607070823F, 0.0F, 0.0F);
        this.BackLeftleg3 = new ModelRenderer(this, 66, 2);
        this.BackLeftleg3.setRotationPoint(0.0F, 6.8F, 2.9F);
        this.BackLeftleg3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(BackLeftleg3, 3.947934768011173F, 0.0F, 0.0F);
        this.FrontRightLegAnimationC = new ModelRenderer(this, 0, 7);
        this.FrontRightLegAnimationC.setRotationPoint(0.3F, 0.4F, 1.4F);
        this.FrontRightLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 36);
        this.LeftEar.setRotationPoint(4.8F, -2.2F, 0.6F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, 0.0F, -2.940705256685246F);
        this.Throat = new ModelRenderer(this, 123, 0);
        this.Throat.setRotationPoint(0.0F, -2.2F, -1.2F);
        this.Throat.addBox(0.0F, 0.0F, 0.0F, 7, 2, 10, 0.0F);
        this.setRotateAngle(Throat, -0.17139133254584316F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 76, 13);
        this.Head.setRotationPoint(2.5F, 2.7F, 11.2F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 8, 8, 7, 0.0F);
        this.setRotateAngle(Head, -2.504198410761464F, 0.0F, 0.0017453292519943296F);
        this.hip = new ModelRenderer(this, 67, 59);
        this.hip.setRotationPoint(0.5F, 11.5F, 5.4F);
        this.hip.addBox(0.0F, 0.0F, 0.0F, 8, 6, 12, 0.0F);
        this.setRotateAngle(hip, 1.1873474901317425F, 0.0F, 0.0F);
        this.BackLeftLeg1 = new ModelRenderer(this, 30, 0);
        this.BackLeftLeg1.setRotationPoint(7.5F, 7.0F, 7.3F);
        this.BackLeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 5, 0.0F);
        this.setRotateAngle(BackLeftLeg1, -0.31869712141416456F, 0.0F, 0.0F);
        this.FrontLeftLeg2 = new ModelRenderer(this, 0, 63);
        this.FrontLeftLeg2.setRotationPoint(0.5F, 5.3F, 2.7F);
        this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(FrontLeftLeg2, -1.730144887501979F, 0.0F, 0.0F);
        this.BackLeftLegAnimationC = new ModelRenderer(this, 0, 7);
        this.BackLeftLegAnimationC.setRotationPoint(0.2F, 0.5F, 0.6F);
        this.BackLeftLegAnimationC.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.FrontLeftLeg1 = new ModelRenderer(this, 0, 50);
        this.FrontLeftLeg1.setRotationPoint(-1.0F, 0.1F, 2.3F);
        this.FrontLeftLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(FrontLeftLeg1, -1.5025539530419183F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 8, 16);
        this.Snout.setRotationPoint(-2.0F, -2.6F, -2.3F);
        this.Snout.addBox(0.0F, -0.4F, 0.0F, 6, 4, 3, 0.0F);
        this.setRotateAngle(Snout, -0.7850490975470494F, 0.0F, 0.0F);
        this.ButtBody.addChild(this.BackRightLegAnimationC);
        this.BackRightLegAnimationC.addChild(this.BackRightLeg1);
        this.SnoutCheeks.addChild(this.Bucktooth);
        this.BackRightLeg1.addChild(this.BackRightLeg2);
        this.Snout.addChild(this.shape50);
        this.FrontRightLeg1.addChild(this.FrontRightLeg2);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.FrontLegAnimationC);
        this.SnoutCheeks.addChild(this.SnoutCheeks2);
        this.BackRightLeg2.addChild(this.BackRightleg3);
        this.Head.addChild(this.SnoutCheeks);
        this.Body.addChild(this.ButtBody);
        this.BackLeftLeg1.addChild(this.BackLeftLeg2);
        this.Head.addChild(this.RightEar);
        this.FrontRightLegAnimationC.addChild(this.FrontRightLeg1);
        this.BackLeftLeg2.addChild(this.BackLeftleg3);
        this.Body.addChild(this.FrontRightLegAnimationC);
        this.Head.addChild(this.LeftEar);
        this.Neck.addChild(this.Throat);
        this.Neck.addChild(this.Head);
        this.ButtBody.addChild(this.hip);
        this.BackLeftLegAnimationC.addChild(this.BackLeftLeg1);
        this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
        this.ButtBody.addChild(this.BackLeftLegAnimationC);
        this.FrontLegAnimationC.addChild(this.FrontLeftLeg1);
        this.Head.addChild(this.Snout);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor = 0.5F;
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
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        float f6 = (180F / (float)Math.PI);
        this.FrontLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.FrontRightLegAnimationC.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.BackRightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BackLeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
}
}
