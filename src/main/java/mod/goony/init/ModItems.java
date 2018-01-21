package mod.goony.init;

import mod.goony.NMFC;
import mod.goony.items.ItemBasic;
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
	public static Item goldenpot;
	public static Item goldenllama;
	public static Item goldenface;
	public static Item goldenbird;
	public static Item cdpellets;

	
	public static void init() {
		rawguineapig = new ItemBasic("rawguineapig").setCreativeTab(NMFC.meattab).setMaxStackSize(32);
		cookedguineapig = new ItemBasic("cookedguineapig").setCreativeTab(NMFC.meattab).setMaxStackSize(32);
		gpigpellets = new ItemBasic("gpigpellets").setCreativeTab(NMFC.petstab).setMaxStackSize(32);
		rawguineapig = new ItemBasic("rawguineapig").setCreativeTab(NMFC.meattab).setMaxStackSize(32);
		goldenpot = new ItemBasic("goldenpot").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);
		goldenllama = new ItemBasic("goldenllama").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);
		goldenface = new ItemBasic("goldenface").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);
		goldenbird = new ItemBasic("goldenbird").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);
		southamericasticker = new ItemBasic("southamericasticker").setMaxStackSize(32);
		europesticker = new ItemBasic("europesticker").setMaxStackSize(32);
		asiasticker = new ItemBasic("asiasticker").setMaxStackSize(32);
		africasticker = new ItemBasic("africasticker").setMaxStackSize(32);
		australiasticker = new ItemBasic("australiasticker").setMaxStackSize(32);
		cdpellets = new ItemBasic("cdpellets").setCreativeTab(NMFC.nmafctab).setMaxStackSize(32);

	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(gpigpellets);
		event.getRegistry().register(cookedguineapig);
		event.getRegistry().register(rawguineapig);
		event.getRegistry().register(southamericasticker);
		event.getRegistry().register(europesticker);
		event.getRegistry().register(asiasticker);
		event.getRegistry().register(africasticker);
		event.getRegistry().register(australiasticker);
		event.getRegistry().register(cdpellets);

		event.getRegistry().register(goldenbird);
		event.getRegistry().register(goldenllama);
		event.getRegistry().register(goldenpot);
		event.getRegistry().register(goldenface);
		
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
		registerRender(cdpellets);

		registerRender(goldenbird);
		registerRender(goldenllama);
		registerRender(goldenpot);
		registerRender(goldenface);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
