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
	public static Item southamericasticker; 
	public static Item europesticker; 
	public static Item asiasticker; 
	public static Item africasticker; 
	public static Item australiasticker; 
	
	
	public static void init() {
		rawguineapig = new ItemBasic("rawguineapig").setCreativeTab(NMFC.meattab).setMaxStackSize(32);
		cookedguineapig = new ItemBasic("cookedguineapig").setCreativeTab(NMFC.meattab).setMaxStackSize(32);
		gpigpellets = new ItemBasic("gpigpellets").setCreativeTab(NMFC.petstab).setMaxStackSize(32);
		southamericasticker = new ItemBasic("southamericasticker").setMaxStackSize(32);
		europesticker = new ItemBasic("europesticker").setMaxStackSize(32);
		asiasticker = new ItemBasic("asiasticker").setMaxStackSize(32);
		africasticker = new ItemBasic("africasticker").setMaxStackSize(32);
		australiasticker = new ItemBasic("australiasticker").setMaxStackSize(32);
		
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(gpigpellets, gpigpellets);
		event.getRegistry().registerAll(cookedguineapig, cookedguineapig);
		event.getRegistry().registerAll(rawguineapig, rawguineapig);
		event.getRegistry().registerAll(southamericasticker, southamericasticker);
		event.getRegistry().registerAll(europesticker, europesticker);
		event.getRegistry().registerAll(asiasticker, asiasticker);
		event.getRegistry().registerAll(africasticker, africasticker);
		event.getRegistry().registerAll(australiasticker, australiasticker);
		
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(gpigpellets);
		registerRender(rawguineapig);
		registerRender(cookedguineapig);
		registerRender(southamericasticker);
		registerRender(europesticker);
		registerRender(asiasticker);
		registerRender(africasticker);
		registerRender(australiasticker);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
