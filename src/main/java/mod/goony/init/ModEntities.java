package mod.goony.init;


import mod.goony.NMFC;
import mod.goony.client.render.EntityBumbleBeeToad;
import mod.goony.entity.EntityAlpaca;
import mod.goony.entity.EntityAndeanGoose;
import mod.goony.entity.EntityChinchilla;
import mod.goony.entity.EntityGuineaPig;
import mod.goony.entity.EntityPampasFox;
import mod.goony.entity.EntityPatagonianMara;
import mod.goony.entity.EntityPuma;
import mod.goony.entity.EntityVicuna;
import mod.goony.entity.EntityViscacha;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // mobs spawn eggs are put here, just replace Entity.class with Entity "Whatever the entity file was"
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de5"), EntityPuma.class, "Cougar", id++, NMFC.instance, 64, 3, true, 0xffe0bd	, 0xffad60	); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de1"), EntityGuineaPig.class, "GuineaPig", id++, NMFC.instance, 64, 3, true, 0xff7800, 0xd5a377); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de2"), EntityChinchilla.class, "Chinchilla", id++, NMFC.instance, 64, 3, true, 0x696969, 0xdcdcdc);      
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de3"), EntityVicuna.class, "Vicuna", id++, NMFC.instance, 64, 3, true, 0xCD853F, 0xdfc49f);       
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de4"), EntityAlpaca.class, "Alpaca", id++, NMFC.instance, 64, 3, true, 0xfffff8, 0xffffff); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de6"), EntityPampasFox.class, "PampasFox", id++, NMFC.instance, 64, 3, true, 0xc1af7e, 0xf4ecd6 ); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de7"), EntityAndeanGoose.class, "AndeanGoose", id++, NMFC.instance, 64, 3, true, 0xe0d6d1, 0x141110 ); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de8"), EntityViscacha.class, "Viscacha", id++, NMFC.instance, 64, 3, true, 0xb7a669, 0x9f8d4d ); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de9"), EntityBumbleBeeToad.class, "BumbleBeeToad", id++, NMFC.instance, 64, 3, true, 0xb7a669, 0x9f8d4d ); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de10"), EntityPatagonianMara.class, "PatagonianMara", id++, NMFC.instance, 64, 3, true, 0xb7a669, 0x9f8d4d ); 

       
        
    }	
    
    

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        //put mobs registry here,, replace entity, render, and model with the model, render, and entity classes of the desired entity.
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        // RenderingRegistry.registerEntityRenderingHandler(Entity.class, new Render(renderManager, new Model(), 0.5F)); // 0.5F is shadow size 
    }
}