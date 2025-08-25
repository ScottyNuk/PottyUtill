package net.potty.pottyutil;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.potty.pottyutil.block.entity.ModBlockEntities;
import net.potty.pottyutil.block.entity.renderer.PedestalBlockEntityRenderer;

public class PttyUtilClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);

    }
}
