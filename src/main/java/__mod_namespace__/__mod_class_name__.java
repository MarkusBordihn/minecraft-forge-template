package [[ --packageNamespace-- ]];

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import [[ --packageNamespace-- ]].block.ModBlocks;
import [[ --packageNamespace-- ]].item.ModItems;

@Mod(Constants.MOD_ID)
public class [[ --ModClassName-- ]] {

  public static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  public [[ --ModClassName-- ]]() {
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    modEventBus.addListener(ClientSetup::new);

    log.info("Register Items ...");
    ModItems.ITEMS.register(modEventBus);

    log.info("Register Blocks ...");
    ModBlocks.BLOCKS.register(modEventBus);
  }
}
