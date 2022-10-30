
package gh.termslime.termslm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import gh.termslime.termslm.entity.FriendlyZombieEntity;
import gh.termslime.termslm.client.model.ModelzombieModel;

public class FriendlyZombieRenderer extends MobRenderer<FriendlyZombieEntity, ModelzombieModel<FriendlyZombieEntity>> {
	public FriendlyZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelzombieModel(context.bakeLayer(ModelzombieModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FriendlyZombieEntity entity) {
		return new ResourceLocation("termslime:textures/entities/friendly_zombie.png");
	}
}
