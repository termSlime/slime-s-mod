
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import gh.termslime.termslm.item.IconDistortedItem;
import gh.termslime.termslm.item.DistDropItem;
import gh.termslime.termslm.item.CreepIconItem;
import gh.termslime.termslm.TermslimeMod;

public class TermslimeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TermslimeMod.MODID);
	public static final RegistryObject<Item> ICON_DISTORTED = REGISTRY.register("icon_distorted", () -> new IconDistortedItem());
	public static final RegistryObject<Item> DIST_DROP = REGISTRY.register("dist_drop", () -> new DistDropItem());
	public static final RegistryObject<Item> CREEP_ICON = REGISTRY.register("creep_icon", () -> new CreepIconItem());
}
