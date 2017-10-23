package tabs;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ASIATab extends CreativeTabs 
{
   public ASIATab(String label) { super("asiatab");
   this.setBackgroundImageName("asia.png");
      }
public ItemStack getTabIconItem() { return new ItemStack(ModItems.asiasticker);}
	
}


