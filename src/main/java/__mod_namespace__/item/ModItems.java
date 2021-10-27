package [[ --packageNamespace-- ]].item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import [[ --packageNamespace-- ]].Constants;
import [[ --packageNamespace-- ]].block.ModBlocks;
import [[ --packageNamespace-- ]].Annotations.TemplateEntryPoint;

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
