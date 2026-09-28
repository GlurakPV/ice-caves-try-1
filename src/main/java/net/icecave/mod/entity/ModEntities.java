package net.icecave.mod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.icecave.mod.IceCaveMod;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

	public static final EntityType<IceCubeEntity> ICE_CUBE = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(IceCaveMod.MOD_ID, "ice_cube"),
			EntityType.Builder.create(IceCubeEntity::new, SpawnGroup.MONSTER)
					.dimensions(EntityDimensions.fixed(2.04f, 2.04f))
					.maxTrackingRange(6)
					.build()
	);

	public static final EntityType<FrozenEntity> FROZEN = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(IceCaveMod.MOD_ID, "frozen"),
			EntityType.Builder.create(FrozenEntity::new, SpawnGroup.MONSTER)
					.dimensions(EntityDimensions.fixed(0.6f, 1.95f))
					.build()
	);

	public static void register() {
		FabricDefaultAttributeRegistry.register(ICE_CUBE, SlimeEntity.createSlimeAttributes());

		DefaultAttributeContainer.Builder frozenAttributes = ZombieEntity.createZombieAttributes()
				.add(EntityAttributes.MAX_HEALTH, 24.0)
				.add(EntityAttributes.MOVEMENT_SPEED, 0.26)
				.add(EntityAttributes.ATTACK_DAMAGE, 4.0);
		FabricDefaultAttributeRegistry.register(FROZEN, frozenAttributes);
	}
}
