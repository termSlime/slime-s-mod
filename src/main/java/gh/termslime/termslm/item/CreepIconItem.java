
package gh.termslime.termslm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import gh.termslime.termslm.init.TermslimeModTabs;

public class CreepIconItem extends Item {
	public CreepIconItem() {
		super(new Item.Properties().tab(TermslimeModTabs.TAB_R_DS_MOD).stacksTo(64).rarity(Rarity.EPIC));
	}
}
