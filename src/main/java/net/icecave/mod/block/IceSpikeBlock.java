package net.icecave.mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

/**
 * A slim, tapering icicle/spike block. Not a full cube - has a narrower
 * hitbox than a normal block so it visually reads as a spike sticking
 * out of the cave wall, floor or ceiling.
 */
public class IceSpikeBlock extends Block {

	private static final VoxelShape SHAPE = VoxelShapes.union(
			Block.createCuboidShape(4, 0, 4, 12, 6, 12),
			Block.createCuboidShape(6, 6, 6, 10, 12, 10),
			Block.createCuboidShape(7, 12, 7, 9, 16, 9)
	);

	public IceSpikeBlock(Settings settings) {
		super(settings);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}
}
