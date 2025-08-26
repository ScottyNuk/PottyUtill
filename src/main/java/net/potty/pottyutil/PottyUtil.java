package net.potty.pottyutil;

import net.fabricmc.api.ModInitializer;

import net.potty.pottyutil.block.ModBlocks;
import net.potty.pottyutil.block.entity.ModBlockEntities;
import net.potty.pottyutil.item.ModItemGroups;
import net.potty.pottyutil.item.ModItems;
import net.potty.pottyutil.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PottyUtil implements ModInitializer {
	public static final String MOD_ID = "pottyutil";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}