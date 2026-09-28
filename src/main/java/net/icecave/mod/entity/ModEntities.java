package net.icecave.mod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.icecave.mod.IceCaveMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {

	public static final EntityType<IceCubeEntity> ICE_CUBE = register("ice_cube",
			EntityType.Builder.create(IceCubeEntity::new, SpawnGroup.MONSTER)
					.dimensions(2.04f, 2.04f)
					.maxTrackingRange(6));

	public static final EntityType<FrozenEntity> FROZEN = register("frozen",
			EntityType.Builder.create(FrozenEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6f, 1.95f));

	private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
		RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(IceCaveMod.MOD_ID, name));
		return Registry.register(Registries.ENTITY_TYPE, key, builder.build(key));
	}

	public static void register() {
		FabricDefaultAttributeRegistry.register(ICE_CUBE, HostileEntity.createHostileAttributes());

		DefaultAttributeContainer.Builder frozenAttributes = ZombieEntity.createZombieAttributes()
				.add(EntityAttributes.MAX_HEALTH, 24.0)
				.add(EntityAttributes.MOVEMENT_SPEED, 0.26)
				.add(EntityAttributes.ATTACK_DAMAGE, 4.0);
		FabricDefaultAttributeRegistry.register(FROZEN, frozenAttributes);
	}
}
