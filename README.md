# Minecraft Forge Template

This template could be used as a base line for the forge mod development with Visual Studio Code and Grandle.

## 1. Step - Replace Placeholders

Before you could use this template, make sure to replace all placeholder in this project.
This can be simple done with "Replace in files" or something similar.

### General Placeholders

- `[[ --Author-- ]]` with the Author name e.g. Markus Bordihn
- `[[ --Mod Id-- ]]` with the Mod Id e.g. my_first_mod
- `[[ --Mod Name-- ]]` with the Mod Name e.g. My First Mod
- `[[ --Mod License-- ]]` with the Mod License e.g. MIT
- `[[ --Mod Description-- ]]` with the Mod description.
- `[[ --Mod ClassName-- ]]` with our Mod Class path e.g. de.markusbordihn.myfirstmod
- `[[ --Vendor Name-- ]]` with the Vendor name e.g. markusbordihn

### Curse Forge Placeholders

- `[[ --Curse Forge Project Id-- ]]` with your Curse Forge project id.
- `[[ --Change Log-- ]]` with the changelog like: See http://....

## 2. Step - Install recommended extensions for Visual Studio Code

If you are not prompted to install the recommended extensions, please go to the extension tab inside Visual Studio Code and install all recommended extensions for the project. Perform a restart of Visual Studio Code after the installation.

## 3. Step - Run Gradle Wrapper

As next step run the grandle wrapper with `./gradlew` and `./gradlew genVSCodeRuns` to make sure all dependencies are installed and resolved.
Try to fix any error message which came up and restart Visual Studio Code before going to the next step.
Note: This step could take some time until all dependencies are resolved.

## 4. Step - Add you basic Java project folders and files

Depending on your project, add the basic folders and files like:

- `src/main/java/<namespace>/<mod name>` (e.g. src/main/java/de/markusbordihn/myfirstmod)
- `src/main/java/<namespace>/<mod name>/<mod name>.java` (e.g. src/main/java/de/markusbordihn/myfirstmod/MyFirstMod.java)
- `src/main/resources/logo.png` (recommended image size is 400x400)

Example MyFirstMod.java:

```java
package de.markusbordihn.myfirstmod;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.network.FMLNetworkConstants;

@Mod("my_first_mod")
public class MyFirstMod {

  public MyFirstMod() {
    // Make sure the mod being absent on the other network side does not cause the
    // client to display the server as incompatible
    ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST,
        () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
  }

}
```

## 5. Start Coding and have fun

Run `./gradlew runClient` to see if your environment is ready to use.
This should start a Minecraft client with your Mod showing up under "Mods".

Resolve any issues before you start coding.

# Additional Resources

* https://mcforge.readthedocs.io/en/1.16.x/
* https://mcforge.readthedocs.io/en/1.17.x/
