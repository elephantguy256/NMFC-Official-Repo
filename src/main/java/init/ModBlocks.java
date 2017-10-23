package init;

import com.example.examplemod.proxy.NMFC;

import blocks.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
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
	

	
	public static void init() {
		patagoniandirt = new BlockBasic("patagoniandirt", Material.GROUND).setHardness(1.5f).setCreativeTab(NMFC.nmafctab).setLightLevel(1.0f);
		patagoniandirt.setHarvestLevel("pickaxe", 2);
		patagoniangrass = new BlockBasic("patagoniangrass", Material.GROUND).setHardness(1.5f).setCreativeTab(NMFC.nmafctab).setLightLevel(1.0f);
		
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(patagoniandirt);
	    event.getRegistry().registerAll(patagoniangrass);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(patagoniangrass).setRegistryName(patagoniangrass.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(patagoniandirt).setRegistryName(patagoniandirt.getRegistryName()));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(patagoniandirt));
		registerRender(Item.getItemFromBlock(patagoniangrass));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
