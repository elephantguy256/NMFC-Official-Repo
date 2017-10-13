package com.dabigjoe.obsidianOverhaul;

import com.example.examplemod.proxy.NMFC;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterials {
    public static final Item.ToolMaterial starToolMaterial = EnumHelper.addToolMaterial("Star", 6, 50000, 10, 10, 14);
    public static final ItemArmor.ArmorMaterial cobbleArmorMaterial = EnumHelper.addArmorMaterial("COBBLE",NMFC.MODID + ":cobble", 1250, new int[]{1, 3, 4, 2}, 15, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, 0);
    public static final ItemArmor.ArmorMaterial blstarArmorMaterial = EnumHelper.addArmorMaterial("BLSTAR", NMFC.MODID + ":blstar", 50000, new int[]{4, 8, 10, 4}, 18, SoundEvents.ITEM_BUCKET_FILL, 10.0F);
    public static final ItemArmor.ArmorMaterial bstarArmorMaterial = EnumHelper.addArmorMaterial("BSTAR", NMFC.MODID + ":bstar", 50000, new int[]{4, 8, 10, 4}, 18, SoundEvents.ITEM_BUCKET_FILL, 10.0F);
    public static final ItemArmor.ArmorMaterial gstarArmorMaterial = EnumHelper.addArmorMaterial("GSTAR", NMFC.MODID + ":gstar", 50000, new int[]{4, 8, 10, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 10.0F);
    public static final ItemArmor.ArmorMaterial rstarArmorMaterial = EnumHelper.addArmorMaterial("RSTAR", NMFC.MODID + ":rstar", 50000, new int[]{4, 8, 10, 4}, 18, SoundEvents.ITEM_BUCKET_FILL_LAVA, 10.0F);
}