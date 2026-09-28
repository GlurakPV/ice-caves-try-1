package net.icecave.mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.world.World;

/**
 * The "Ice Cube" - a slime variant that lives in the Ice Cave biome.
 * Reuses vanilla slime behaviour (splitting, jump attack) with an icy texture.
 */
public class IceCubeEntity extends SlimeEntity {

	public IceCubeEntity(EntityType<? extends SlimeEntity> entityType, World world) {
		super(entityType, world);
	}
}
