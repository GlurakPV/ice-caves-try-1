package net.icecave.mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.world.World;

public class IceCubeEntity extends SlimeEntity {

	public IceCubeEntity(EntityType<? extends SlimeEntity> entityType, World world) {
		super(entityType, world);
	}
}
