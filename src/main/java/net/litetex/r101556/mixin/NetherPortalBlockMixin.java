package net.litetex.r101556.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.BlockState;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


@Mixin(NetherPortalBlock.class)
public abstract class NetherPortalBlockMixin
{
	@Inject(
		method = "getInsideCollisionShape",
		at = @At("HEAD"),
		cancellable = true)
	public void getInsideCollisionShape(
		final BlockState state,
		final BlockView world,
		final BlockPos pos,
		final Entity entity,
		final CallbackInfoReturnable<VoxelShape> cir)
	{
		cir.setReturnValue(VoxelShapes.fullCube());
	}
}
