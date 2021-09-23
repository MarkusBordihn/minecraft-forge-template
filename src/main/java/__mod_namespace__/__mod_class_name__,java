package [[ --Mod Namespace-- ]];

import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.FMLNetworkConstants;

@Mod(Constants.MOD_ID)
public class [[ --Mod ClassName-- ]] {

  public [[ --Mod ClassName-- ]]() {
    // Make sure the mod being absent on the other network side does not cause the
    // client to display the server as incompatible
    ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST,
        () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
  }
}
