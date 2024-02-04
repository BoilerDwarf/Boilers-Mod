package com.boiler.dwarf.boilersmod.block.custom;

import com.boiler.dwarf.boilersmod.soundregistries.ModSounds;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class MikuBlock extends HorizontalFacingBlock {
    public MikuBlock(AbstractBlock.Settings settings) {
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
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.40625f, 0.75f, 0.625f, 0.59375f);
            case SOUTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.40625f, 0.75f, 0.625f, 0.59375f);
            case EAST:
                return VoxelShapes.cuboid(0.40625f, 0.0f, 0.25f, 0.59375f, 0.625f, 0.75f);
            case WEST:
                return VoxelShapes.cuboid(0.40625f, 0.0f, 0.25f, 0.59375f, 0.625f, 0.75f);
            default:
                return VoxelShapes.fullCube();
        }
    }
}
