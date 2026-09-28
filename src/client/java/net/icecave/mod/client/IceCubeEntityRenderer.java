package net.icecave.mod.client;

import net.icecave.mod.IceCaveMod;
import net.icecave.mod.entity.IceCubeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.util.Identifier;

public class IceCubeEntityRenderer extends SlimeEntityRenderer {

	private static final Identifier TEXTURE =
			Identifier.of(IceCaveMod.MOD_ID, "textures/entity/ice_cube.png");

	public IceCubeEntityRenderer(EntityRendererFactory.Context context) {
		super(context);
	}

	@Override
	public Identifier getTexture(net.minecraft.entity.mob.SlimeEntity entity) {
		return TEXTURE;
	}
}
