package net.icecave.mod.client;

import net.icecave.mod.IceCaveMod;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.client.render.entity.state.ZombieEntityRenderState;
import net.minecraft.util.Identifier;

public class FrozenEntityRenderer extends ZombieEntityRenderer {

	private static final Identifier TEXTURE =
			Identifier.of(IceCaveMod.MOD_ID, "textures/entity/frozen.png");

	public FrozenEntityRenderer(EntityRendererFactory.Context context) {
		super(context);
	}

	@Override
	public Identifier getTexture(ZombieEntityRenderState state) {
		return TEXTURE;
	}
}
