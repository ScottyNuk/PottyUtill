package net.potty.pottyutil.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.potty.pottyutil.PottyUtil;
import net.potty.pottyutil.block.ModBlocks;
import net.potty.pottyutil.block.entity.custom.PedestalBlockEntity;

public class ModBlockEntities {
    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(PottyUtil.MOD_ID, "pedestal_be"),
                    BlockEntityType.Builder.create(PedestalBlockEntity::new,
                            ModBlocks.PEDESTAL,
                            ModBlocks.PEDESTAL2,
                            ModBlocks.PEDESTAL3
                    ).build()
            );
    public static final BlockEntityType<PedestalBlockEntity> PSC_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(PottyUtil.MOD_ID, "psc_be"),
                    BlockEntityType.Builder.create(PedestalBlockEntity::new,
                            ModBlocks.TEST_BLOCK
                    ).build()
            );
    public static void registerBlockEntities() {
        PottyUtil.LOGGER.info("Registering Block Entities for " + PottyUtil.MOD_ID);
    }
}
