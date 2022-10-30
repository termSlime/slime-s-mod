
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import gh.termslime.termslm.entity.SmilingSlimeEntity;
import gh.termslime.termslm.entity.FriendlyZombieEntityProjectile;
import gh.termslime.termslm.entity.FriendlyZombieEntity;
import gh.termslime.termslm.entity.DistZombieEntity;
import gh.termslime.termslm.entity.BslimeEntity;
import gh.termslime.termslm.TermslimeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TermslimeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TermslimeMod.MODID);
	public static final RegistryObject<EntityType<SmilingSlimeEntity>> SMILING_SLIME = register("smiling_slime",
			EntityType.Builder.<SmilingSlimeEntity>of(SmilingSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SmilingSlimeEntity::new)

					.sized(0.5f, 1f));
	public static final RegistryObject<EntityType<FriendlyZombieEntity>> FRIENDLY_ZOMBIE = register("friendly_zombie",
			EntityType.Builder.<FriendlyZombieEntity>of(FriendlyZombieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriendlyZombieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FriendlyZombieEntityProjectile>> FRIENDLY_ZOMBIE_PROJECTILE = register("projectile_friendly_zombie",
			EntityType.Builder.<FriendlyZombieEntityProjectile>of(FriendlyZombieEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(FriendlyZombieEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DistZombieEntity>> DIST_ZOMBIE = register("dist_zombie",
			EntityType.Builder.<DistZombieEntity>of(DistZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DistZombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BslimeEntity>> BSLIME = register("bslime",
			EntityType.Builder.<BslimeEntity>of(BslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BslimeEntity::new)

					.sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SmilingSlimeEntity.init();
			FriendlyZombieEntity.init();
			DistZombieEntity.init();
			BslimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SMILING_SLIME.get(), SmilingSlimeEntity.createAttributes().build());
		event.put(FRIENDLY_ZOMBIE.get(), FriendlyZombieEntity.createAttributes().build());
		event.put(DIST_ZOMBIE.get(), DistZombieEntity.createAttributes().build());
		event.put(BSLIME.get(), BslimeEntity.createAttributes().build());
	}
}
