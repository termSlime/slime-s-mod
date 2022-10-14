// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsmileslime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "smileslime"), "main");
	private final ModelPart inner;
	private final ModelPart outer;

	public Modelsmileslime(ModelPart root) {
		this.inner = root.getChild("inner");
		this.outer = root.getChild("outer");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition inner = partdefinition.addOrReplaceChild("inner", CubeListBuilder.create().texOffs(0, 16).addBox(
				-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition outer = partdefinition.addOrReplaceChild("outer", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		inner.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		outer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}