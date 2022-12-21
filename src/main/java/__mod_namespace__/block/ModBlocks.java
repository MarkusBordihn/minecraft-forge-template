package [[ --packageNamespace-- ]].block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import [[ --packageNamespace-- ]].Annotations.TemplateEntryPoint;
import [[ --packageNamespace-- ]].Constants;

public class ModBlocks {

  protected ModBlocks() {

  }

  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

  @TemplateEntryPoint("Register Blocks")

  @TemplateEntryPoint("Register Blocks Entity")

  private static final String MINECRAFT_FORGE_TEMPLATE =
      "https://github.com/MarkusBordihn/minecraft-forge-template";
}
