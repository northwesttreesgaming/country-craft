package net.mcreator.countrycraft.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.countrycraft.CountrycraftModElements;

@CountrycraftModElements.ModElement.Tag
public class PlowItemToolInHandTickProcedure extends CountrycraftModElements.ModElement {
	public PlowItemToolInHandTickProcedure(CountrycraftModElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure PlowItemToolInHandTick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).getOrCreateTag().putBoolean("countrycraftPlowItem", (true));
	}
}
