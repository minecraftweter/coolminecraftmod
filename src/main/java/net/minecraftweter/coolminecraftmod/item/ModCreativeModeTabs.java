package net.minecraftweter.coolminecraftmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftweter.coolminecraftmod.CoolMinecraftMod;
import net.minecraftweter.coolminecraftmod.block.ModBlocks;

public class ModCreativeModeTabs {


    public static void registerModCreativeTabs() {
        CoolMinecraftMod.LOGGER.info("Registering creativemodetabs for " + CoolMinecraftMod.MOD_ID);


        //noinspection CodeBlock2Expr
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(tab -> {
            tab.accept(new ItemStack(ModItems.GLUM));
        });

        //noinspection CodeBlock2Expr
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(tab -> {
            tab.accept(new ItemStack(ModBlocks.GLUM_BLOCK));
        });
    }
}
