package net.icecave.mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.world.World;

/**
 * The "Frozen" - a zombie variant native to the Ice Cave biome.
 * Reuses vanilla zombie AI; attributes (extra health/speed) are set
 * in ModEntities on top of the standard zombie attribute builder.
 * Texture is swapped client-side in IceCaveModClient.
 */
public class FrozenEntity extends ZombieEntity {

	public FrozenEntity(EntityType<? extends ZombieEntity> entityType, World world) {
		super(entityType, world);
	}
}
