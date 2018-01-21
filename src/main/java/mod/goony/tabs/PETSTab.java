package mod.goony.tabs;

import mod.goony.init.ModBlocks;
import mod.goony.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PETSTab extends CreativeTabs 
{
   public PETSTab(String label) { super("petstab");
  
      }
public ItemStack getTabIconItem() { return new ItemStack(ModItems.gpigpellets);}
	
}


