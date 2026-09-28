package net.icecave.mod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.icecave.mod.block.ModBlocks;
import net.icecave.mod.entity.ModEntities;
import net.minecraft.client.render.RenderLayer;

public class IceCaveModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Ice Cube reuses the vanilla slime model, with our own texture
		// (assets/icecave/textures/entity/ice_cube.png) via a thin renderer subclass.
		EntityRendererRegistry.register(ModEntities.ICE_CUBE, IceCubeEntityRenderer::new);

		// Frozen reuses the vanilla zombie model, with our own texture
		// (assets/icecave/textures/entity/frozen.png).
		EntityRendererRegistry.register(ModEntities.FROZEN, FrozenEntityRenderer::new);

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_SPIKE, RenderLayer.getCutout());
	}
}
