+++ item/ModItems.java
@@@ after:@TemplateEntryPoint("Register Items") @@@
  public static final RegistryObject<Item> [[ --ITEM_NAME-- ]] = ITEMS.register([[ --ItemClassName-- ]].NAME,
      () -> new [[ --ItemClassName-- ]](new Item.Properties().tab(CreativeModeTab.[[ --CreativeTab-- ]])));
