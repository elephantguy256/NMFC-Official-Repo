package init;

import com.example.examplemod.proxy.NMFC;

import items.ItemBasic;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=NMFC.MODID)
public class ModItems {
	
	public static Item gpigpellets;
	public static Item rawguineapig;
	public static Item cookedguineapig;

	
	public static void init() {
		rawguineapig = new ItemBasic("rawguineapig").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);
		cookedguineapig = new ItemBasic("cookedguineapig").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);
		gpigpellets = new ItemBasic("gpigpellets").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(gpigpellets, gpigpellets);
		event.getRegistry().registerAll(cookedguineapig, cookedguineapig);
		event.getRegistry().registerAll(rawguineapig, rawguineapig);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(gpigpellets);
		registerRender(rawguineapig);
		registerRender(cookedguineapig);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
