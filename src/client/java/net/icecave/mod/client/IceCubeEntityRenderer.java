package net.icecave.mod.client;

import net.icecave.mod.IceCaveMod;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.client.render.entity.state.SlimeEntityRenderState;
import net.minecraft.util.Identifier;

public class IceCubeEntityRenderer extends SlimeEntityRenderer {

	private static final Identifier TEXTURE =
			Identifier.of(IceCaveMod.MOD_ID, "textures/entity/ice_cube.png");

	public IceCubeEntityRenderer(EntityRendererFactory.Context context) {
		super(context);
	}

	@Override
	public Identifier getTexture(SlimeEntityRenderState state) {
		return TEXTURE;
	}
}
