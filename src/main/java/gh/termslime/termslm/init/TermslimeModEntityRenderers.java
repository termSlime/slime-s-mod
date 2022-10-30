
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import gh.termslime.termslm.client.renderer.SmilingSlimeRenderer;
import gh.termslime.termslm.client.renderer.FriendlyZombieRenderer;
import gh.termslime.termslm.client.renderer.DistZombieRenderer;
import gh.termslime.termslm.client.renderer.BslimeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TermslimeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TermslimeModEntities.SMILING_SLIME.get(), SmilingSlimeRenderer::new);
		event.registerEntityRenderer(TermslimeModEntities.FRIENDLY_ZOMBIE.get(), FriendlyZombieRenderer::new);
		event.registerEntityRenderer(TermslimeModEntities.FRIENDLY_ZOMBIE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TermslimeModEntities.DIST_ZOMBIE.get(), DistZombieRenderer::new);
		event.registerEntityRenderer(TermslimeModEntities.BSLIME.get(), BslimeRenderer::new);
	}
}
