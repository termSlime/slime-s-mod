
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TermslimeModTabs {
	public static CreativeModeTab TAB_R_DS_MOD;
	public static CreativeModeTab TAB_DISTORTED;
	public static CreativeModeTab TAB_CREEPY_STUFFS;

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
		TAB_DISTORTED = new CreativeModeTab("tabdistorted") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TermslimeModItems.ICON_DISTORTED.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CREEPY_STUFFS = new CreativeModeTab("tabcreepy_stuffs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TermslimeModItems.CREEP_ICON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
