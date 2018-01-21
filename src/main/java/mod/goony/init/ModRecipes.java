package mod.goony.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.rawguineapig, new ItemStack(ModItems.cookedguineapig, 1), 1.5f);
		System.out.println("TEST");
	}
	
}
