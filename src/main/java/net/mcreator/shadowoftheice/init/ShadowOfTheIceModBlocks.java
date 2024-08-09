
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowoftheice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.shadowoftheice.block.ShadowBlockBlock;
import net.mcreator.shadowoftheice.ShadowOfTheIceMod;

public class ShadowOfTheIceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShadowOfTheIceMod.MODID);
	public static final RegistryObject<Block> SHADOW_BLOCK = REGISTRY.register("shadow_block", () -> new ShadowBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
