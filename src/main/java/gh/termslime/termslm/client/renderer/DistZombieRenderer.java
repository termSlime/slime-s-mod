
package gh.termslime.termslm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import gh.termslime.termslm.entity.DistZombieEntity;
import gh.termslime.termslm.client.model.ModelzombieModel;

public class DistZombieRenderer extends MobRenderer<DistZombieEntity, ModelzombieModel<DistZombieEntity>> {
	public DistZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelzombieModel(context.bakeLayer(ModelzombieModel.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<DistZombieEntity, ModelzombieModel<DistZombieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("termslime:textures/entities/dist_zombie.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DistZombieEntity entity) {
		return new ResourceLocation("termslime:textures/entities/dist_zombie.png");
	}
}
