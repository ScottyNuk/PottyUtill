package net.potty.pottyutil;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.potty.pottyutil.block.entity.ModBlockEntities;
import net.potty.pottyutil.block.entity.renderer.PedestalBlockEntityRenderer;
import net.potty.pottyutil.screen.ModScreenHandlers;
import net.potty.pottyutil.screen.custom.PedestalScreen;

public class PttyUtilClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.PEDESTAL_SCREEN_HANDLER, PedestalScreen::new);
    }
}
