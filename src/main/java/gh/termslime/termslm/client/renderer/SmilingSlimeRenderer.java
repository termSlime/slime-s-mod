
package gh.termslime.termslm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import gh.termslime.termslm.entity.SmilingSlimeEntity;

public class SmilingSlimeRenderer extends MobRenderer<SmilingSlimeEntity, SlimeModel<SmilingSlimeEntity>> {
	public SmilingSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
		this.addLayer(new EyesLayer<SmilingSlimeEntity, SlimeModel<SmilingSlimeEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("termslime:textures/entities/slimetexturefix.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SmilingSlimeEntity entity) {
		return new ResourceLocation("termslime:textures/entities/slimetexturefix.png");
	}
}
