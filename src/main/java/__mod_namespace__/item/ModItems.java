package [[ --Mod Namespace-- ]].item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import [[ --Mod Namespace-- ]].Constants;

public class ModItems {

  protected ModItems() {

  }

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

  // Register Items

}
