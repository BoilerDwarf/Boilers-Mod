package com.boiler.dwarf.boilersmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BeegMikuBlock extends HorizontalFacingBlock {
    public BeegMikuBlock(Settings settings) {
        super(settings);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0.125f, 0.0f, 0.25f, 0.875f, 0.75f, 0.75f);
            case SOUTH:
                return VoxelShapes.cuboid(0.125f, 0.0f, 0.25f, 0.875f, 0.75f, 0.75f);
            case EAST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.125f, 0.75f, 0.75f, 0.875f);
            case WEST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.125f, 0.75f, 0.75f, 0.875f);
            default:
                return VoxelShapes.fullCube();
        }
    }
}
