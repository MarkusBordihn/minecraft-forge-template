package [[ --Mod Namespace-- ]];

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.network.FMLNetworkConstants;

import [[ --Mod Namespace-- ]].item.ModItems;

@Mod(Constants.MOD_ID)
public class [[ --Mod ClassName-- ]] {

  public [[ --Mod ClassName-- ]]() {
    // Make sure the mod being absent on the other network side does not cause the
    // client to display the server as incompatible
    ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class,
        () -> new IExtensionPoint.DisplayTest(() -> FMLNetworkConstants.IGNORESERVERONLY,
            (a, b) -> true));

    log.info("Register Items ...");
    ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }
}
