package com.boiler.dwarf.boilersmod.entity.client;

import com.boiler.dwarf.boilersmod.entity.animation.ModAnimations;
import com.boiler.dwarf.boilersmod.entity.custom.Trilobite;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class TrilobiteModel<T extends Trilobite> extends SinglePartEntityModel<T> {
	private final ModelPart trilobite;
	private final ModelPart face;

	public TrilobiteModel(ModelPart root) {
		this.trilobite = root.getChild("trilobite");
		this.face = trilobite.getChild("face");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData trilobite = modelPartData.addChild("trilobite", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData face = trilobite.addChild("face", ModelPartBuilder.create().uv(0, 5).cuboid(-5.0F, -0.4F, -1.5F, 10.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(2.0F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 18).cuboid(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-3.0F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-5.0F, 0.6F, -2.5F, 10.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.6F, -4.0F));

		ModelPartData cube_r1 = face.addChild("cube_r1", ModelPartBuilder.create().uv(8, 18).cuboid(-6.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 18).cuboid(-6.0F, -2.0F, 5.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.6F, 4.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData frontbone1 = trilobite.addChild("frontbone1", ModelPartBuilder.create().uv(18, 12).cuboid(-1.4924F, -1.6951F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 9).cuboid(-4.4924F, -1.1951F, -0.5F, 9.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.0076F, -1.8049F, -2.0F));

		ModelPartData cube_r2 = frontbone1.addChild("cube_r2", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.5076F, 0.5549F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r3 = frontbone1.addChild("cube_r3", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, -0.25F, -2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.9924F, 0.3049F, 2.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData frontbone2 = trilobite.addChild("frontbone2", ModelPartBuilder.create().uv(18, 12).cuboid(-1.4924F, -1.6951F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 9).cuboid(-4.4924F, -1.1951F, -0.5F, 9.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.0076F, -1.8049F, -1.0F));

		ModelPartData cube_r4 = frontbone2.addChild("cube_r4", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.5076F, 0.5549F, -1.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r5 = frontbone2.addChild("cube_r5", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, -0.25F, -1.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.9924F, 0.3049F, 1.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData frontbone3 = trilobite.addChild("frontbone3", ModelPartBuilder.create().uv(18, 12).cuboid(-1.4924F, -1.6951F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 9).cuboid(-4.4924F, -1.1951F, -0.5F, 9.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.0076F, -1.8049F, 0.0F));

		ModelPartData cube_r6 = frontbone3.addChild("cube_r6", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, 1.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.5076F, 0.5549F, -2.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r7 = frontbone3.addChild("cube_r7", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.9924F, 0.3049F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData middlebone1 = trilobite.addChild("middlebone1", ModelPartBuilder.create().uv(18, 12).cuboid(-1.5F, -1.6875F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 12).cuboid(-4.0F, -1.1875F, -0.5F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.8125F, 1.0F));

		ModelPartData cube_r8 = middlebone1.addChild("cube_r8", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 0.5625F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r9 = middlebone1.addChild("cube_r9", ModelPartBuilder.create().uv(18, 18).cuboid(-0.5F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.8125F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData middlebone2 = trilobite.addChild("middlebone2", ModelPartBuilder.create().uv(0, 12).cuboid(-4.0F, -1.1875F, -0.5F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(18, 12).cuboid(-1.5F, -1.6875F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.8125F, 2.0F));

		ModelPartData cube_r10 = middlebone2.addChild("cube_r10", ModelPartBuilder.create().uv(18, 18).cuboid(-0.5F, -0.25F, 0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.8125F, -1.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r11 = middlebone2.addChild("cube_r11", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 0.5625F, -1.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData middlebone3 = trilobite.addChild("middlebone3", ModelPartBuilder.create().uv(18, 12).cuboid(-1.4938F, -1.7058F, -0.4966F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 12).cuboid(-3.9938F, -1.2058F, -0.4966F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.7866F, 3.0F));

		ModelPartData cube_r12 = middlebone3.addChild("cube_r12", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, 1.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.0062F, 0.5442F, -1.9966F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r13 = middlebone3.addChild("cube_r13", ModelPartBuilder.create().uv(18, 18).cuboid(-0.5F, -0.25F, 1.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.9938F, 0.7942F, -1.9966F, 0.0F, 0.0F, -0.7854F));

		ModelPartData buttbone1 = trilobite.addChild("buttbone1", ModelPartBuilder.create().uv(18, 12).cuboid(-1.5F, -1.7134F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 15).cuboid(-3.5F, -1.2134F, -0.5F, 7.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.7866F, 4.0F));

		ModelPartData cube_r14 = buttbone1.addChild("cube_r14", ModelPartBuilder.create().uv(18, 18).cuboid(-0.75F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, 0.5366F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r15 = buttbone1.addChild("cube_r15", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, 0.5366F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData buttbone2 = trilobite.addChild("buttbone2", ModelPartBuilder.create().uv(18, 12).cuboid(-1.5F, -1.7134F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 15).cuboid(-3.5F, -1.2134F, -0.5F, 7.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.7866F, 5.0F));

		ModelPartData cube_r16 = buttbone2.addChild("cube_r16", ModelPartBuilder.create().uv(18, 18).cuboid(-1.25F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, 0.5366F, -1.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r17 = buttbone2.addChild("cube_r17", ModelPartBuilder.create().uv(18, 18).cuboid(-0.75F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, 0.5366F, -1.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData buttbone3 = trilobite.addChild("buttbone3", ModelPartBuilder.create().uv(16, 15).cuboid(-3.0F, -1.0F, -0.5F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(-2, -2).cuboid(1.5F, -0.5F, 0.5F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(-2, -2).cuboid(-1.5F, -0.5F, 0.5F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 6.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(Trilobite entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netFaceYaw, float facePitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setFaceAngles(netFaceYaw, facePitch);

		this.animateMovement(ModAnimations.WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, ageInTicks, 1f);
	}

		private void setFaceAngles(float faceYaw, float facePitch) {
			faceYaw = MathHelper.clamp(faceYaw, -10.0f, 10.0f);
			facePitch = MathHelper.clamp(facePitch, -15.0f, 25.0f);

			this.face.yaw = faceYaw * 0.017453292f;
			this.face.pitch = facePitch * 0.017453292f;
		}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		trilobite.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return trilobite;
	}
}


