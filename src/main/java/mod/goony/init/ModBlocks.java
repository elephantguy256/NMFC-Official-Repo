package mod.goony.init;

import mod.goony.NMFC;
import mod.goony.blocks.BlockDirts;
import mod.goony.blocks.BlockPlant;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=NMFC.MODID)
public class ModBlocks {

	public static Block patagoniandirt;
	public static Block patagoniangrass;
	public static Block pgrass;
	public static Block lupine;
	public static Block pshrub;


	
	public static void init() {
		patagoniandirt = new BlockDirts("patagoniandirt", Material.GROUND).setHardness(1.5f).setCreativeTab(NMFC.nmafctab);
		patagoniandirt.setHarvestLevel("pickaxe", 2);
		patagoniangrass = new BlockDirts("patagoniangrass", Material.GROUND).setHardness(1.5f).setCreativeTab(NMFC.nmafctab);
		pgrass = new BlockPlant("pgrass", Material.GROUND).setHardness(1.5f).setCreativeTab(NMFC.nmafctab);
		lupine = new BlockPlant("lupine", Material.GROUND).setHardness(1.5f).setCreativeTab(NMFC.nmafctab);
		pshrub = new BlockPlant("pshrub", Material.GROUND).setHardness(1.5f).setCreativeTab(NMFC.nmafctab);

	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(pshrub);
		event.getRegistry().registerAll(patagoniandirt);
	    event.getRegistry().registerAll(patagoniangrass);
	    event.getRegistry().registerAll(pgrass);
	    event.getRegistry().registerAll(lupine);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(pshrub).setRegistryName(pshrub.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(lupine).setRegistryName(lupine.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(patagoniangrass).setRegistryName(patagoniangrass.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(patagoniandirt).setRegistryName(patagoniandirt.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(pgrass).setRegistryName(pgrass.getRegistryName()));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(patagoniandirt));
		registerRender(Item.getItemFromBlock(patagoniangrass));
		registerRender(Item.getItemFromBlock(pgrass));
		registerRender(Item.getItemFromBlock(lupine));
		registerRender(Item.getItemFromBlock(pshrub));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
