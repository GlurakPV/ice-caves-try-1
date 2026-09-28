package net.icecave.mod.block;

import net.icecave.mod.IceCaveMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

	public static Block ICE_SPIKE;

	public static void register() {
		Identifier id = Identifier.of(IceCaveMod.MOD_ID, "ice_spike");
		RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);

		ICE_SPIKE = new IceSpikeBlock(
				AbstractBlock.Settings.create()
						.registryKey(blockKey)
						.mapColor(MapColor.LIGHT_BLUE)
						.sounds(BlockSoundGroup.GLASS)
						.strength(0.4F)
						.nonOpaque()
						.noCollision()
		);
		Registry.register(Registries.BLOCK, blockKey, ICE_SPIKE);
		Registry.register(Registries.ITEM, itemKey,
				new BlockItem(ICE_SPIKE, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey()));
	}
}
