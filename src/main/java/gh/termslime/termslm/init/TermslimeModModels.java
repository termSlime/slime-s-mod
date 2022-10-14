
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gh.termslime.termslm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import gh.termslime.termslm.client.model.ModelzombieModel;
import gh.termslime.termslm.client.model.Modelsmileslime;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TermslimeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelzombieModel.LAYER_LOCATION, ModelzombieModel::createBodyLayer);
		event.registerLayerDefinition(Modelsmileslime.LAYER_LOCATION, Modelsmileslime::createBodyLayer);
	}
}
