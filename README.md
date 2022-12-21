# 📄 Minecraft Forge Template 1.18 (Deprecated)

This template could be used as a base line for the [Forge][minecraft_forge] mod development with [Visual Studio Code][visual_studio_code] and [Gradle][gradle].

## MinecraftForge / Forge Mod Loader (FML)

Forge is a free, open-source modding API to the Minecraft base files to assist in compatibility between mods.

Please take a look at the [fml folder](fml/) or [MinecraftForge][minecraft_forge] for additional information.

## Preparation

Before you could jump into coding there are some tasks which needs to be performed.

### 🖊️ Replace Placeholders

Before you could use this template, make sure to replace all placeholder in this project.
This can be simple done with "Replace in files" or something similar.

Tip: You should also make sure to create the project as experimental project in [Curse Forge][curse_forge] to avoid any delays or naming issues later.

#### General Placeholders

- [ ] `[[ --Author-- ]]` with the Author name e.g. Markus Bordihn
- [ ] `[[ --ModId-- ]]` with the Mod Id e.g. my_first_mod
- [ ] `[[ --ModName-- ]]` with the Mod Name e.g. My First Mod
- [ ] `[[ --ModLicense-- ]]` with the Mod License e.g. MIT
- [ ] `[[ --ModDescription-- ]]` with the Mod description.
- [ ] `[[ --ModClassName-- ]]` with your mod main class name e.g. MyFirstMod
- [ ] `[[ --packageNamespace-- ]]` with your mod namespace e.g. de.markusbordihn.myfirstmod
- [ ] `[[ --VendorName-- ]]` with the Vendor name e.g. markusbordihn

#### Curse Forge Placeholders

- [ ] `[[ --Curse Forge Project Id-- ]]` with your Curse Forge project id.
- [ ] `[[ --Change Log-- ]]` with the changelog like: See http://....

#### Item Template Placeholders
- [ ] `[[ --ITEM_NAME-- ]]` Variable safe item name (upper_case) e.g. MY_ITEM
- [ ] `[[ --item_name-- ]]` Variable safe item name (lower_case) e.g. my_item
- [ ] `[[ --CreativeTab-- ]]` Item creative tab e.g. TAB_MISC

### 💾 Install recommended extensions for Visual Studio Code

If you are not prompted to install the recommended extensions, please go to the extension tab inside Visual Studio Code and install all recommended extensions for the project. Perform a restart of Visual Studio Code after the installation.

### 🏃 Run Gradle Wrapper

As next step run the grandle wrapper with `./gradlew` and `./gradlew genVSCodeRuns` to make sure all dependencies are installed and resolved.
Try to fix any error message which came up and restart Visual Studio Code before going to the next step.
Note: This step could take some time until all dependencies are resolved.

### 📂 Add you basic Java project folders and files

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

### ⌨️ Start Coding and have fun

Run `./gradlew runClient` to see if your environment is ready to use.
This should start a Minecraft client with your Mod showing up under "Mods".

Resolve any issues before you start coding.

## ℹ️ CurseGrandle

CurseGrandle is a gradle plugin for publishing artifacts to CurseForge.
You should store your curseforge_api_token only over grandle and never in the gradle.properties file directly!

### Add a Token

`.\gradlew.bat addCredentials --key curseforge_api_token --value ...`

### Remove a Token

`.\gradlew.bat removeCredentials --key curseforge_api_token`

### Push your project to CurseForge

`.\gradlew.bat curseforge`

## 📚 Additional Resources

Please take a look at the [Forge Docs][forge_docs] to get an full overview of the Forge API.

## Disclaimer

NOT OFFICIAL MINECRAFT PRODUCT. NOT APPROVED BY OR ASSOCIATED WITH MOJANG.

[curse_forge]: https://www.curseforge.com/
[forge_docs]: https://mcforge.readthedocs.io/en/latest/
[gradle]: https://docs.gradle.org/
[minecraft_forge]: https://github.com/MinecraftForge/MinecraftForge
[visual_studio_code]: https://code.visualstudio.com/
