
package gh.termslime.termslm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import gh.termslime.termslm.init.TermslimeModTabs;

public class MagneticDiskItem extends Item {
	public MagneticDiskItem() {
		super(new Item.Properties().tab(TermslimeModTabs.TAB_R_DS_MOD).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
