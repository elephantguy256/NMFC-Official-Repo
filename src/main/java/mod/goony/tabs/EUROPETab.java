package mod.goony.tabs;

import mod.goony.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EUROPETab extends CreativeTabs 
{
   public EUROPETab(String label) { super("europetab");
   this.setBackgroundImageName("europe.png");
      }
public ItemStack getTabIconItem() { return new ItemStack(ModItems.europesticker);}
	
}


