package net.icecave.mod.block;

import net.icecave.mod.IceCaveMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

	public static final Block ICE_SPIKE = new IceSpikeBlock(
			AbstractBlock.Settings.create()
					.mapColor(MapColor.PALE_BLUE)
					.sounds(BlockSoundGroup.GLASS)
					.strength(0.4F)
					.nonOpaque()
					.noCollision()
	);

	public static void register() {
		Identifier blockId = Identifier.of(IceCaveMod.MOD_ID, "ice_spike");
		Registry.register(Registries.BLOCK, blockId, ICE_SPIKE);
		Registry.register(Registries.ITEM, blockId,
				new BlockItem(ICE_SPIKE, new Item.Settings()));
	}
}
