package net.minecraftweter.coolminecraftmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.minecraftweter.coolminecraftmod.block.ModBlocks;
import net.minecraftweter.coolminecraftmod.item.ModCreativeModeTabs;
import net.minecraftweter.coolminecraftmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolMinecraftMod implements ModInitializer {
	public static final String MOD_ID = "coolminecraftmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCreativeModeTabs.registerModCreativeTabs();
	}

	@SuppressWarnings("unused")
	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
