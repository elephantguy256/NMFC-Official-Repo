package tabs;

import init.ModBlocks;
import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PETSTab extends CreativeTabs 
{
   public PETSTab(String label) { super("petstab");
  
      }
public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(ModBlocks.guineapigcage));}
	
}


