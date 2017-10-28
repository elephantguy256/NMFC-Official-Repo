package init;


import com.example.examplemod.entity.EntityAlpaca;
import com.example.examplemod.entity.EntityAndeanGoose;
import com.example.examplemod.entity.EntityChinchilla;
import com.example.examplemod.entity.EntityGuineaPig;
import com.example.examplemod.entity.EntityPuma;
import com.example.examplemod.entity.EntityVicuna;
import com.example.examplemod.proxy.NMFC;
import com.example.examplemod.entity.EntityPampasFox;
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
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de1"), EntityGuineaPig.class, "Guinea Pig", id++, NMFC.instance, 64, 3, true, 0xff7800, 0xd5a377); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de2"), EntityChinchilla.class, "Chinchilla", id++, NMFC.instance, 64, 3, true, 0x696969, 0xdcdcdc);      
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de3"), EntityVicuna.class, "Vicuna", id++, NMFC.instance, 64, 3, true, 0xCD853F, 0xdfc49f);       
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de4"), EntityAlpaca.class, "Alpaca", id++, NMFC.instance, 64, 3, true, 0xfffff8, 0xffffff); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de6"), EntityPampasFox.class, "Pampas Fox", id++, NMFC.instance, 64, 3, true, 0xc1af7e, 0xf4ecd6 ); 
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de7"), EntityAndeanGoose.class, "Andean Goose", id++, NMFC.instance, 64, 3, true, 0x141110, 0xe0d6d1 ); 
       
        
    }
    
    

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        //put mobs registry here,, replace entity, render, and model with the model, render, and entity classes of the desired entity.
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        // RenderingRegistry.registerEntityRenderingHandler(Entity.class, new Render(renderManager, new Model(), 0.5F)); // 0.5F is shadow size 
    }
}