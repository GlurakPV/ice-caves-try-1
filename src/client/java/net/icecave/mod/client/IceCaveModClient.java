package net.icecave.mod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.icecave.mod.entity.ModEntities;

public class IceCaveModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Ice Cube reuses the vanilla slime model, with our own texture.
		EntityRendererRegistry.register(ModEntities.ICE_CUBE, IceCubeEntityRenderer::new);

		// Frozen reuses the vanilla zombie model, with our own texture.
		EntityRendererRegistry.register(ModEntities.FROZEN, FrozenEntityRenderer::new);
	}
}
