package net.potty.pottyutil.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.potty.pottyutil.PottyUtil;

public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings()));









    private static final Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PottyUtil.MOD_ID, name), item);
    }
    public static void registerModItems() {
        PottyUtil.LOGGER.info("Registering Mod Items for " + PottyUtil.MOD_ID);
    }
}
