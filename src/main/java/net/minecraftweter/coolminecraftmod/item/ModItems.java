package net.minecraftweter.coolminecraftmod.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraftweter.coolminecraftmod.CoolMinecraftMod;

import java.util.function.Function;

public class ModItems {

    public static Item GLUM = registerItem("glum", Item::new);

    public static Item registerItem(String name, Function<Item.Properties, Item> function) {
        Identifier identifier = Identifier.fromNamespaceAndPath(CoolMinecraftMod.MOD_ID, name);
        return Registry.register(BuiltInRegistries.ITEM, identifier, function.apply(
                new Item.Properties().setId(ResourceKey.create(Registries.ITEM, identifier))
        ));
    }

    public static void registerModItems() {
        CoolMinecraftMod.LOGGER.info("Registering items for " + CoolMinecraftMod.MOD_ID + "!");
    }
}
