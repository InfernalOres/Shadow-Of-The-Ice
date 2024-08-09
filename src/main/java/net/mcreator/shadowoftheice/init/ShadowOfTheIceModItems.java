
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowoftheice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.shadowoftheice.ShadowOfTheIceMod;

public class ShadowOfTheIceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShadowOfTheIceMod.MODID);
	public static final RegistryObject<Item> SHADOW_BLOCK = block(ShadowOfTheIceModBlocks.SHADOW_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
