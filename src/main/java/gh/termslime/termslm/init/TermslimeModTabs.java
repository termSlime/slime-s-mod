
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TermslimeModTabs {
	public static CreativeModeTab TAB_R_DS_MOD;

	public static void load() {
		TAB_R_DS_MOD = new CreativeModeTab("tabr_ds_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.DIAMOND_SWORD);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
