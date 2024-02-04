package com.boiler.dwarf.boilersmod;

import com.boiler.dwarf.boilersmod.block.ModBlocks;
import com.boiler.dwarf.boilersmod.entity.ModEntities;
import com.boiler.dwarf.boilersmod.entity.client.ModModelLayers;
import com.boiler.dwarf.boilersmod.entity.client.TrilobiteModel;
import com.boiler.dwarf.boilersmod.entity.client.TrilobiteRenderer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;


public class BoilersModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.miku_block, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.TRILOBITE, TrilobiteRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TRILOBITE, TrilobiteModel::getTexturedModelData);
    }
}
