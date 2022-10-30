
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import gh.termslime.termslm.block.AluminiumOreBlockBlock;
import gh.termslime.termslm.TermslimeMod;

public class TermslimeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TermslimeMod.MODID);
	public static final RegistryObject<Block> ALUMINIUM_ORE_BLOCK = REGISTRY.register("aluminium_ore_block", () -> new AluminiumOreBlockBlock());
}
