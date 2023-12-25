package net.business.doom;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doomsday implements ModInitializer {
	public static final String MOD_ID = "doom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// dOON
		LOGGER.info("Hello Fabric world!");
	}
}