+++ block/ModBlocks.java
@@@ after:@TemplateEntryPoint("Register Blocks") @@@
  public static final RegistryObject<Block> [[ --BLOCK_NAME-- ]] =
      BLOCKS.register("[[ --block_name-- ]]", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
          .requiresCorrectToolForDrops().strength(3.0F, 3.0F)));

+++ item/ModItems.java
@@@ after:@TemplateEntryPoint("Register Block Items") @@@
  public static final RegistryObject<Item> [[ --BLOCK_NAME-- ]] =
      ITEMS.register("[[ --block_name-- ]]", () -> new BlockItem(ModBlocks.[[ --BLOCK_NAME-- ]].get(),
          new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
