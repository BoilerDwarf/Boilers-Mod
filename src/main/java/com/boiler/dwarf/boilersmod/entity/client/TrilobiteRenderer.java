package com.boiler.dwarf.boilersmod.entity.client;

import com.boiler.dwarf.boilersmod.BoilersMod;
import com.boiler.dwarf.boilersmod.entity.custom.Trilobite;
import com.boiler.dwarf.boilersmod.entity.client.TrilobiteModel;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;



public class TrilobiteRenderer extends MobEntityRenderer<Trilobite, TrilobiteModel<Trilobite>> {
    private static final Identifier TEXTURE = new Identifier(BoilersMod.MOD_ID, "textures/entity/trilobite.png");
    public TrilobiteRenderer(EntityRendererFactory.Context context) {
        super(context, new TrilobiteModel<>(context.getPart(ModModelLayers.TRILOBITE)), 0.5f);
    }

    @Override
    public Identifier getTexture(Trilobite entity) {
        return TEXTURE;
    }

    @Override
    public void render(Trilobite mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.3f, 0.3f, 0.3f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
