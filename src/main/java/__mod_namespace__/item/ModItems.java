package [[ --packageNamespace-- ]].item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import [[ --packageNamespace-- ]].Annotations.TemplateEntryPoint;
import [[ --packageNamespace-- ]].Constants;
import [[ --packageNamespace-- ]].block.ModBlocks;

public class ModItems {

  protected ModItems() {

  }

  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

  @TemplateEntryPoint("Register Items")

  @TemplateEntryPoint("Register Block Items")

  private static final String MINECRAFT_FORGE_TEMPLATE =
      "https://github.com/MarkusBordihn/minecraft-forge-template";
}
