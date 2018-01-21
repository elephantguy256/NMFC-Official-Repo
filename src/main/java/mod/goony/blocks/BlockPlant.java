package mod.goony.blocks;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;

public class BlockPlant extends BlockBush {

	public BlockPlant(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
		}
