
package net.mcreator.countrycraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.countrycraft.block.LimestoneBlock;
import net.mcreator.countrycraft.CountrycraftModElements;

@CountrycraftModElements.ModElement.Tag
public class CountryCraftBlocksItemGroup extends CountrycraftModElements.ModElement {
	public CountryCraftBlocksItemGroup(CountrycraftModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcountrycraftblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LimestoneBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
