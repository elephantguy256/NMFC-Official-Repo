package mod.goony.tabs;

import mod.goony.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AFRICATab extends CreativeTabs 
{
   public AFRICATab(String label) { 
	   super(label);
	   this.setBackgroundImageName("africa.png");
   }
   
   public ItemStack getTabIconItem() {
	   return new ItemStack(ModItems.africasticker);
   }
}


