package net.icecave.mod;

import net.fabricmc.api.ModInitializer;
import net.icecave.mod.block.ModBlocks;
import net.icecave.mod.entity.ModEntities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IceCaveMod implements ModInitializer {
	public static final String MOD_ID = "icecave";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[Ice Cave World] Initializing - the world is about to get a lot colder.");
		ModBlocks.register();
		ModEntities.register();
	}
}
