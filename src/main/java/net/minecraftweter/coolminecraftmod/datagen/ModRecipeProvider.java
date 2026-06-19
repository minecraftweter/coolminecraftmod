package net.minecraftweter.coolminecraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftweter.coolminecraftmod.block.ModBlocks;
import net.minecraftweter.coolminecraftmod.item.ModItems;
import org.jspecify.annotations.NullMarked;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    @NullMarked
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLUM_BLOCK)
                        .pattern("gg")
                        .pattern("gg")
                        .define('g', ModItems.GLUM)
                        .unlockedBy(getHasName(ModItems.GLUM), has(ModItems.GLUM))
                        .save(output);
            }
        };
    }

    @Override
    @NullMarked
    public String getName() {
        return "CoolMinecraftMod recipes";
    }
}
