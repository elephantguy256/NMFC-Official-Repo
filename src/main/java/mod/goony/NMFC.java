package mod.goony;

import mod.goony.init.ModBlocks;
import mod.goony.init.ModEntities;
import mod.goony.init.ModItems;
import mod.goony.init.ModRecipes;
import mod.goony.proxy.CommonProxy;
import mod.goony.sounds.SoundEvents2;
import mod.goony.tabs.AFRICATab;
import mod.goony.tabs.ASIATab;
import mod.goony.tabs.AUSTRALIATab;
import mod.goony.tabs.EUROPETab;
import mod.goony.tabs.MEATTab;
import mod.goony.tabs.NMAFCTab;
import mod.goony.tabs.PETSTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NMFC.MODID, name = NMFC.MODNAME, version = NMFC.MODVERSION)
public class NMFC 
{
	public static final CreativeTabs nmafctab = new NMAFCTab("nmafctab");
	public static final CreativeTabs europetab = new EUROPETab("europetab");
	public static final CreativeTabs asiatab = new ASIATab("asiatab");
	public static final CreativeTabs africatab = new AFRICATab("africatab");
	public static final CreativeTabs australiatab = new AUSTRALIATab("australiatab");
	public static final CreativeTabs petstab = new PETSTab("petstab");
	public static final CreativeTabs meattab = new MEATTab("meattab");
	
    public static final String MODID = "de";

    public static final String MODNAME = "Nature Makes a Fowl Comeback Mod";

    public static final String MODVERSION = "1.0.0";
    
	@SidedProxy(clientSide="mod.goony.proxy.ClientProxy", serverSide="mod.goony.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static NMFC instance;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NMFC.MODID + ":preInit");
		ModBlocks.init();
		ModItems.init();
        ModEntities.init();
		RegistryHandler.preInitRegistries();
		SoundEvents2.registerSounds();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(NMFC.MODID + ":init");
		ModRecipes.init();
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(NMFC.MODID + ":postInit");
		RegistryHandler.postInitRegistries();
	}
	
}