package tabs;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MEATTab extends CreativeTabs 
{
   public MEATTab(String label) { super("meattab");
   
      }
public ItemStack getTabIconItem() { return new ItemStack(ModItems.rawguineapig);}
	
}


