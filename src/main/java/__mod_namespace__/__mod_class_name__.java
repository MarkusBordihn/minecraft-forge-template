package [[ --packageNamespace-- ]];

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import [[ --packageNamespace-- ]].block.ModBlocks;
import [[ --packageNamespace-- ]].item.ModItems;

@Mod(Constants.MOD_ID)
public class [[ --ModClassName-- ]] {

  protected static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  public [[ --ModClassName-- ]]() {
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    modEventBus.addListener(ClientSetup::new);

    log.info("{} Items ...", Constants.LOG_REGISTER_PREFIX);
    ModItems.ITEMS.register(modEventBus);

    log.info("{} Blocks ...", Constants.LOG_REGISTER_PREFIX);
    ModBlocks.BLOCKS.register(modEventBus);

    DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
      log.info("{} Client Setup ...", Constants.LOG_REGISTER_PREFIX);
    });
  }
}
