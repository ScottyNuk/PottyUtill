package net.potty.pottyutil.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.potty.pottyutil.PottyUtil;
import net.potty.pottyutil.block.custom.PedestalBlock;
import net.potty.pottyutil.block.custom.PedestalBlock2;

public class ModBlocks {

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PEDESTAL = registerBlock("pedestal",
            new PedestalBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block PEDESTAL2 = registerBlock("pedestal2",
            new PedestalBlock2(AbstractBlock.Settings.create().nonOpaque()));










    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PottyUtil.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PottyUtil.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }



    public static void registerModBlocks() {
        PottyUtil.LOGGER.info("Registering Blocks for " + PottyUtil.MOD_ID);
    }
}
