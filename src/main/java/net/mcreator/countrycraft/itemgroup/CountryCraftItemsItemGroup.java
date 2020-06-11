
package net.mcreator.countrycraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.countrycraft.item.DiamondPlowItem;
import net.mcreator.countrycraft.CountrycraftModElements;

@CountrycraftModElements.ModElement.Tag
public class CountryCraftItemsItemGroup extends CountrycraftModElements.ModElement {
	public CountryCraftItemsItemGroup(CountrycraftModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcountrycraftitems") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DiamondPlowItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
