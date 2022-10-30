
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import gh.termslime.termslm.TermslimeMod;

public class TermslimeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TermslimeMod.MODID);
	public static final RegistryObject<SoundEvent> SLIMESMOD_BETTERSLIME_AMBIENT = REGISTRY.register("slimesmod.betterslime.ambient",
			() -> new SoundEvent(new ResourceLocation("termslime", "slimesmod.betterslime.ambient")));
	public static final RegistryObject<SoundEvent> SLIMESMOD_BETTERSLIME_CLIMB = REGISTRY.register("slimesmod.betterslime.climb",
			() -> new SoundEvent(new ResourceLocation("termslime", "slimesmod.betterslime.climb")));
	public static final RegistryObject<SoundEvent> SLIMESMOD_BETTERSLIME_ATTACK = REGISTRY.register("slimesmod.betterslime.attack",
			() -> new SoundEvent(new ResourceLocation("termslime", "slimesmod.betterslime.attack")));
	public static final RegistryObject<SoundEvent> SLIMESMOD_BETTERSLIME_HURT = REGISTRY.register("slimesmod.betterslime.hurt",
			() -> new SoundEvent(new ResourceLocation("termslime", "slimesmod.betterslime.hurt")));
	public static final RegistryObject<SoundEvent> SLIMESMOD_BETTERSLIME_JUMP = REGISTRY.register("slimesmod.betterslime.jump",
			() -> new SoundEvent(new ResourceLocation("termslime", "slimesmod.betterslime.jump")));
	public static final RegistryObject<SoundEvent> SLIMESMOD_BETTERSLIME_HARDATTACK = REGISTRY.register("slimesmod.betterslime.hardattack",
			() -> new SoundEvent(new ResourceLocation("termslime", "slimesmod.betterslime.hardattack")));
}
