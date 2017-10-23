package tabs;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class NMAFCTab extends CreativeTabs 
{
   public NMAFCTab(String label) { super("nmafctab");
   this.setBackgroundImageName("tutorial.png");
      }
public ItemStack getTabIconItem() { return new ItemStack(ModItems.southamericasticker);}
	
}


