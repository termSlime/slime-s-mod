
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import gh.termslime.termslm.TermslimeMod;

public class TermslimeModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TermslimeMod.MODID);
	public static final RegistryObject<SimpleParticleType> FLOWER_STUFF = REGISTRY.register("flower_stuff", () -> new SimpleParticleType(false));
}
