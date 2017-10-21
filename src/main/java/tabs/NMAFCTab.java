package tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class NMAFCTab extends CreativeTabs 
{
   public NMAFCTab(String label) { super("nmafctab");
      }
public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(init.ModBlocks.patagoniangrass));}
	
}

