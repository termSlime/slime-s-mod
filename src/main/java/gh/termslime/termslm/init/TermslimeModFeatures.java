
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import gh.termslime.termslm.world.features.ores.AluminiumOreBlockFeature;
import gh.termslime.termslm.TermslimeMod;

@Mod.EventBusSubscriber
public class TermslimeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TermslimeMod.MODID);
	public static final RegistryObject<Feature<?>> ALUMINIUM_ORE_BLOCK = REGISTRY.register("aluminium_ore_block", AluminiumOreBlockFeature::feature);
}
