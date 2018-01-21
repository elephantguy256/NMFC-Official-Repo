package mod.goony.tabs;

import mod.goony.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AUSTRALIATab extends CreativeTabs 
{
   public AUSTRALIATab(String label) { super("australiatab");
   this.setBackgroundImageName("australia.png");
      }
public ItemStack getTabIconItem() { return new ItemStack(ModItems.australiasticker);}
	
}


