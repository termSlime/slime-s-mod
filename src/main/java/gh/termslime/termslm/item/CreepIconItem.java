
package gh.termslime.termslm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CreepIconItem extends Item {
	public CreepIconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.EPIC));
	}
}
