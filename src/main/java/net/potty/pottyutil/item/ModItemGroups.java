package net.potty.pottyutil.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.potty.pottyutil.PottyUtil;
import net.potty.pottyutil.block.ModBlocks;
import net.potty.pottyutil.block.entity.ModBlockEntities;

public class ModItemGroups {


    public static final ItemGroup POTTY_UTIL_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PottyUtil.MOD_ID, "potty_util_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TEST_ITEM))
                    .displayName(Text.translatable("itemgroup.pottyutil.potty_util_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.TEST_ITEM);

                    }).build());

    public static final ItemGroup POTTY_UTIL_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PottyUtil.MOD_ID, "potty_util_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TEST_BLOCK))
                    .displayName(Text.translatable("itemgroup.pottyutil.potty_util_blocks"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.PEDESTAL);
                        entries.add(ModBlocks.PEDESTAL2);

                        ModBlockEntities.registerBlockEntities();

                    }).build());



    public static void registerModItemGroups() {
        PottyUtil.LOGGER.info("Registering Item Groups for " + PottyUtil.MOD_ID);
    }
}
