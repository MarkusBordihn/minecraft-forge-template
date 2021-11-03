+++ block/[[ --BlockClassName-- ]].java
@@@ create @@@
package [[ --packageNamespace-- ]].block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RodBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.PushReaction;

public class [[ --BlockClassName-- ]] extends RodBlock {

  public [[ --BlockClassName-- ]](Properties properties) {
    super(properties);
    this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP));
  }

  @Override
  public BlockState getStateForPlacement(BlockPlaceContext context) {
    Direction direction = context.getClickedFace();
    BlockState blockState =
        context.getLevel().getBlockState(context.getClickedPos().relative(direction.getOpposite()));
    return blockState.is(this) && blockState.getValue(FACING) == direction
        ? this.defaultBlockState().setValue(FACING, direction.getOpposite())
        : this.defaultBlockState().setValue(FACING, direction);
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockState) {
    blockState.add(FACING);
  }

  @Override
  public PushReaction getPistonPushReaction(BlockState blockState) {
    return PushReaction.NORMAL;
  }

}

+++ block/ModBlocks.java
@@@ after:@TemplateEntryPoint("Register Blocks") @@@
  public static final RegistryObject<Block> [[ --BLOCK_NAME-- ]] =
      BLOCKS.register("[[ --block_name-- ]]", () -> new [[ --BlockClassName-- ]](BlockBehaviour.Properties.of(Material.METAL)
          .requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound([[ --SoundType-- ]])));

+++ item/ModItems.java
@@@ after:@TemplateEntryPoint("Register Block Items") @@@
  public static final RegistryObject<Item> [[ --BLOCK_NAME-- ]] =
      ITEMS.register("[[ --block_name-- ]]", () -> new BlockItem(ModBlocks.[[ --BLOCK_NAME-- ]].get(),
          new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
