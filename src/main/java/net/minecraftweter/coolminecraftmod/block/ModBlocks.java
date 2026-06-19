package net.minecraftweter.coolminecraftmod.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftweter.coolminecraftmod.CoolMinecraftMod;
import net.minecraftweter.coolminecraftmod.item.ModItems;

import java.util.function.Function;

public class ModBlocks {

    public static Block GLUM_BLOCK = registerBlock("glum_block", properties -> new Block(
            properties.strength(1.4f).sound(SoundType.STONE).mapColor(DyeColor.WHITE).requiresCorrectToolForDrops()
    ));


    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Identifier identifier = Identifier.fromNamespaceAndPath(CoolMinecraftMod.MOD_ID, name);

        Block block = function.apply(
                BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, identifier))
        );
        ModItems.registerItem(name, properties -> new BlockItem(
                block, properties.useBlockDescriptionPrefix()
        ));
        return Registry.register(BuiltInRegistries.BLOCK, identifier, block);
    }

    public static void registerModBlocks() {
        CoolMinecraftMod.LOGGER.info("Registering blocks for " + CoolMinecraftMod.MOD_ID);
    }
}
