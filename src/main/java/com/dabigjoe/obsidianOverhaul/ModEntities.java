package com.dabigjoe.obsidianOverhaul;

import com.example.examplemod.EntityGuineaPig;
import com.example.examplemod.proxy.NMFC;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(NMFC.MODID, "de1"),EntityGuineaPig.class, "Safari Jeep", id++, NMFC.instance, 64, 3, true, 0x996600, 0x00ff00);	

        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually

        // This is the loot table for our mob
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    }
}