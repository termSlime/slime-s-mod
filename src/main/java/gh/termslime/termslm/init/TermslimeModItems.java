
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import gh.termslime.termslm.item.TopShellItem;
import gh.termslime.termslm.item.MagneticDiskItem;
import gh.termslime.termslm.item.LinerItem;
import gh.termslime.termslm.item.IconDistortedItem;
import gh.termslime.termslm.item.FloppyDiskShatterItem;
import gh.termslime.termslm.item.DistDropItem;
import gh.termslime.termslm.item.DiskHubItem;
import gh.termslime.termslm.item.DiskDriveItem;
import gh.termslime.termslm.item.CreepIconItem;
import gh.termslime.termslm.item.AluminiumOreItem;
import gh.termslime.termslm.TermslimeMod;

public class TermslimeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TermslimeMod.MODID);
	public static final RegistryObject<Item> ICON_DISTORTED = REGISTRY.register("icon_distorted", () -> new IconDistortedItem());
	public static final RegistryObject<Item> DIST_DROP = REGISTRY.register("dist_drop", () -> new DistDropItem());
	public static final RegistryObject<Item> CREEP_ICON = REGISTRY.register("creep_icon", () -> new CreepIconItem());
	public static final RegistryObject<Item> SMILING_SLIME = REGISTRY.register("smiling_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(TermslimeModEntities.SMILING_SLIME, -13382656, -3407872,
					new Item.Properties().tab(TermslimeModTabs.TAB_R_DS_MOD)));
	public static final RegistryObject<Item> DISK_DRIVE = REGISTRY.register("disk_drive", () -> new DiskDriveItem());
	public static final RegistryObject<Item> TOP_SHELL = REGISTRY.register("top_shell", () -> new TopShellItem());
	public static final RegistryObject<Item> FLOPPY_DISK_SHATTER = REGISTRY.register("floppy_disk_shatter", () -> new FloppyDiskShatterItem());
	public static final RegistryObject<Item> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", () -> new AluminiumOreItem());
	public static final RegistryObject<Item> ALUMINIUM_ORE_BLOCK = block(TermslimeModBlocks.ALUMINIUM_ORE_BLOCK, TermslimeModTabs.TAB_R_DS_MOD);
	public static final RegistryObject<Item> LINER = REGISTRY.register("liner", () -> new LinerItem());
	public static final RegistryObject<Item> FRIENDLY_ZOMBIE = REGISTRY.register("friendly_zombie_spawn_egg",
			() -> new ForgeSpawnEggItem(TermslimeModEntities.FRIENDLY_ZOMBIE, -1, -1, new Item.Properties().tab(TermslimeModTabs.TAB_R_DS_MOD)));
	public static final RegistryObject<Item> DISK_HUB = REGISTRY.register("disk_hub", () -> new DiskHubItem());
	public static final RegistryObject<Item> MAGNETIC_DISK = REGISTRY.register("magnetic_disk", () -> new MagneticDiskItem());
	public static final RegistryObject<Item> DIST_ZOMBIE = REGISTRY.register("dist_zombie_spawn_egg",
			() -> new ForgeSpawnEggItem(TermslimeModEntities.DIST_ZOMBIE, -16777216, -1, new Item.Properties().tab(TermslimeModTabs.TAB_R_DS_MOD)));
	public static final RegistryObject<Item> BSLIME = REGISTRY.register("bslime_spawn_egg",
			() -> new ForgeSpawnEggItem(TermslimeModEntities.BSLIME, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
