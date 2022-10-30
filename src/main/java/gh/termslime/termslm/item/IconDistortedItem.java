
package gh.termslime.termslm.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import gh.termslime.termslm.init.TermslimeModTabs;

public class IconDistortedItem extends Item {
	public IconDistortedItem() {
		super(new Item.Properties().tab(TermslimeModTabs.TAB_R_DS_MOD).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("nah"));
	}
}
