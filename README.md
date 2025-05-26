<!-- modrinth_exclude.start -->

[![Version](https://img.shields.io/modrinth/v/AfFOiyXv)](https://modrinth.com/mod/revert-mc-101556)
[![Build](https://img.shields.io/github/actions/workflow/status/litetex-oss/mcm-revert-mc-101556/check-build.yml?branch=dev)](https://github.com/litetex-oss/mcm-revert-mc-101556/actions/workflows/check-build.yml?query=branch%3Adev)

# Revert MC-101556

<!-- modrinth_exclude.end -->

Reverts the "fix" for [MC-101556](https://bugs.mojang.com/browse/MC/issues/MC-101556) (only affects ``1.21.5``).

Makes nether portals/chunk loaders work properly again.

Please note that the "fix" for MC-101556 was reverted by Mojang in ``25w16a`` (``1.21.6``) and the mod is no longer required in these versions.

The mod itself is extremely minimalistic and only a single line of code was patched.

<!-- modrinth_exclude.start -->

## Installation
[Installation guide for the latest release](https://github.com/litetex-oss/mcm-revert-mc-101556/releases/latest#Installation)

### Usage in other mods

Add the following to ``build.gradle``:
```groovy
dependencies {
    modImplementation 'net.litetex.mcm:revert-mc-101556:<version>'
    // Further documentation: https://wiki.fabricmc.net/documentation:fabric_loom
}
```

> [!NOTE]
> The contents are hosted on [Maven Central](https://repo.maven.apache.org/maven2/net/litetex/mcm/). You shouldn't have to change anything as this is the default maven repo.<br/>
> If this somehow shouldn't work you can also try [Modrinth Maven](https://support.modrinth.com/en/articles/8801191-modrinth-maven).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

<!-- modrinth_exclude.end -->
