package net.potty.pottyutil.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.potty.pottyutil.PottyUtil;
import net.potty.pottyutil.screen.custom.PedestalScreenHandler;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PedestalScreenHandler> PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PottyUtil.MOD_ID, "pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PedestalScreenHandler::new, BlockPos.PACKET_CODEC));





    public static void registerScreenHandlers() {
        PottyUtil.LOGGER.info("Registering Screen Handlers for " + PottyUtil.MOD_ID);
    }
}
