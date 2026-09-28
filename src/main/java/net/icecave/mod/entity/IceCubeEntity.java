package net.icecave.mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

/**
 * The "Ice Cube" - a slime variant that lives in the Ice Cave biome.
 * Reuses vanilla slime AI/behaviour (splitting on death, jump attack)
 * but with icy particles and a cold-themed texture (see IceCaveModClient).
 */
public class IceCubeEntity extends SlimeEntity {

	public IceCubeEntity(EntityType<? extends SlimeEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected void addSquishParticles() {
		if (!this.getWorld().isClient) {
			return;
		}
		for (int i = 0; i < 4; ++i) {
			this.getWorld().addParticle(
					ParticleTypes.SNOWFLAKE,
					this.getParticleX(0.5),
					this.getY(),
					this.getParticleZ(0.5),
					0.0, 0.0, 0.0
			);
		}
	}
}
