
package gh.termslime.termslm.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import gh.termslime.termslm.init.TermslimeModTabs;

public class AluminiumOreItem extends Item {
	public AluminiumOreItem() {
		super(new Item.Properties().tab(TermslimeModTabs.TAB_R_DS_MOD).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("shiny ore"));
	}
}
