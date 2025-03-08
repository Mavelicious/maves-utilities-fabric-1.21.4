package com.mavesutilities.datagen;

import com.mavesutilities.MavesUtilitiesMod;
import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MavesLootTableProvider extends FabricBlockLootTableProvider {
    public MavesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(MavesBlocks.APPLE_TREE_LOG);
        addDrop(MavesBlocks.APPLE_TREE_WOOD);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_LOG);
        addDrop(MavesBlocks.STRIPPED_APPLE_TREE_WOOD);
        addDrop(MavesBlocks.APPLE_TREE_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_APPLE_TREE_SAPLING);
        addDrop(MavesBlocks.APPLE_TREE_PLANKS);
        addDrop(MavesBlocks.APPLE_TREE_BUTTON);
        addDrop(MavesBlocks.APPLE_TREE_DOOR, doorDrops(MavesBlocks.APPLE_TREE_DOOR));
        addDrop(MavesBlocks.APPLE_TREE_FENCE);
        addDrop(MavesBlocks.APPLE_TREE_FENCE_GATE);
        addDrop(MavesBlocks.APPLE_TREE_HANGING_SIGN);
        addDrop(MavesBlocks.APPLE_TREE_PRESSURE_PLATE);
        addDrop(MavesBlocks.APPLE_TREE_SIGN);
        addDrop(MavesBlocks.APPLE_TREE_SLAB, slabDrops(MavesBlocks.APPLE_TREE_SLAB));
        addDrop(MavesBlocks.APPLE_TREE_STAIRS);
        addDrop(MavesBlocks.APPLE_TREE_TRAPDOOR);

        addDrop(MavesBlocks.AZALEA_STEM);
        addDrop(MavesBlocks.AZALEA_WOOD);
        addDrop(MavesBlocks.STRIPPED_AZALEA_STEM);
        addDrop(MavesBlocks.STRIPPED_AZALEA_WOOD);
        addDrop(MavesBlocks.AZALEA_PLANKS);
        addDrop(MavesBlocks.AZALEA_BUTTON);
        addDrop(MavesBlocks.AZALEA_DOOR, doorDrops(MavesBlocks.AZALEA_DOOR));
        addDrop(MavesBlocks.AZALEA_FENCE);
        addDrop(MavesBlocks.AZALEA_FENCE_GATE);
        addDrop(MavesBlocks.AZALEA_HANGING_SIGN);
        addDrop(MavesBlocks.AZALEA_PRESSURE_PLATE);
        addDrop(MavesBlocks.AZALEA_SIGN);
        addDrop(MavesBlocks.AZALEA_SLAB, slabDrops(MavesBlocks.AZALEA_SLAB));
        addDrop(MavesBlocks.AZALEA_STAIRS);
        addDrop(MavesBlocks.AZALEA_TRAPDOOR);

        addDrop(MavesBlocks.CACAO_TREE_LOG);
        addDrop(MavesBlocks.CACAO_TREE_WOOD);
        addDrop(MavesBlocks.STRIPPED_CACAO_TREE_LOG);
        addDrop(MavesBlocks.STRIPPED_CACAO_TREE_WOOD);
        addDrop(MavesBlocks.CACAO_TREE_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_CACAO_TREE_SAPLING);
        addDrop(MavesBlocks.CACAO_TREE_PLANKS);
        addDrop(MavesBlocks.CACAO_TREE_BUTTON);
        addDrop(MavesBlocks.CACAO_TREE_DOOR, doorDrops(MavesBlocks.CACAO_TREE_DOOR));
        addDrop(MavesBlocks.CACAO_TREE_FENCE);
        addDrop(MavesBlocks.CACAO_TREE_FENCE_GATE);
        addDrop(MavesBlocks.CACAO_TREE_HANGING_SIGN);
        addDrop(MavesBlocks.CACAO_TREE_PRESSURE_PLATE);
        addDrop(MavesBlocks.CACAO_TREE_SIGN);
        addDrop(MavesBlocks.CACAO_TREE_SLAB, slabDrops(MavesBlocks.CACAO_TREE_SLAB));
        addDrop(MavesBlocks.CACAO_TREE_STAIRS);
        addDrop(MavesBlocks.CACAO_TREE_TRAPDOOR);

        addDrop(MavesBlocks.RUBBER_LOG);
        addDrop(MavesBlocks.RUBBER_WOOD);
        addDrop(MavesBlocks.STRIPPED_RUBBER_LOG);
        addDrop(MavesBlocks.STRIPPED_RUBBER_WOOD);
        addDrop(MavesBlocks.RUBBER_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_RUBBER_SAPLING);
        addDrop(MavesBlocks.RUBBER_PLANKS);
        addDrop(MavesBlocks.RUBBER_BUTTON);
        addDrop(MavesBlocks.RUBBER_DOOR, doorDrops(MavesBlocks.RUBBER_DOOR));
        addDrop(MavesBlocks.RUBBER_FENCE);
        addDrop(MavesBlocks.RUBBER_FENCE_GATE);
        addDrop(MavesBlocks.RUBBER_HANGING_SIGN);
        addDrop(MavesBlocks.RUBBER_PRESSURE_PLATE);
        addDrop(MavesBlocks.RUBBER_SIGN);
        addDrop(MavesBlocks.RUBBER_SLAB, slabDrops(MavesBlocks.RUBBER_SLAB));
        addDrop(MavesBlocks.RUBBER_STAIRS);
        addDrop(MavesBlocks.RUBBER_TRAPDOOR);

        addDrop(MavesBlocks.WILLOW_LOG);
        addDrop(MavesBlocks.WILLOW_WOOD);
        addDrop(MavesBlocks.STRIPPED_WILLOW_LOG);
        addDrop(MavesBlocks.STRIPPED_WILLOW_WOOD);
        addDrop(MavesBlocks.WILLOW_SAPLING);
        addPottedPlantDrops(MavesBlocks.POTTED_WILLOW_SAPLING);
        addDrop(MavesBlocks.WILLOW_PLANKS);
        addDrop(MavesBlocks.WILLOW_BUTTON);
        addDrop(MavesBlocks.WILLOW_DOOR, doorDrops(MavesBlocks.WILLOW_DOOR));
        addDrop(MavesBlocks.WILLOW_FENCE);
        addDrop(MavesBlocks.WILLOW_FENCE_GATE);
        addDrop(MavesBlocks.WILLOW_HANGING_SIGN);
        addDrop(MavesBlocks.WILLOW_PRESSURE_PLATE);
        addDrop(MavesBlocks.WILLOW_SIGN);
        addDrop(MavesBlocks.WILLOW_SLAB, slabDrops(MavesBlocks.WILLOW_SLAB));
        addDrop(MavesBlocks.WILLOW_STAIRS);
        addDrop(MavesBlocks.WILLOW_TRAPDOOR);

        addDrop(MavesBlocks.ACACIA_FLOWERING_LEAVES, leavesDrops(MavesBlocks.ACACIA_FLOWERING_LEAVES,
                Blocks.ACACIA_SAPLING, 0.0625f));
        addDrop(MavesBlocks.ACACIA_FLOWERED_LEAVES, leavesDrops(MavesBlocks.ACACIA_FLOWERED_LEAVES,
                Blocks.ACACIA_SAPLING, 0.0625f));
        addDrop(MavesBlocks.BIRCH_FLOWERING_LEAVES, leavesDrops(MavesBlocks.BIRCH_FLOWERING_LEAVES,
                Blocks.BIRCH_SAPLING, 0.0625f));
        addDrop(MavesBlocks.CHERRY_FLOWERING_LEAVES, leavesDrops(MavesBlocks.CHERRY_FLOWERING_LEAVES,
                Blocks.CHERRY_SAPLING, 0.0625f));
        addDrop(MavesBlocks.DARK_OAK_FLOWERING_LEAVES, leavesDrops(MavesBlocks.DARK_OAK_FLOWERING_LEAVES,
                Blocks.DARK_OAK_SAPLING, 0.0625f));
        addDrop(MavesBlocks.JUNGLE_FLOWERING_LEAVES, leavesDrops(MavesBlocks.JUNGLE_FLOWERING_LEAVES,
                Blocks.JUNGLE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.OAK_FLOWERING_LEAVES, leavesDrops(MavesBlocks.OAK_FLOWERING_LEAVES,
                Blocks.OAK_SAPLING, 0.0625f));
        addDrop(MavesBlocks.PALE_OAK_FLOWERING_LEAVES, leavesDrops(MavesBlocks.PALE_OAK_FLOWERING_LEAVES,
                Blocks.PALE_OAK_SAPLING, 0.0625f));

        addDrop(MavesBlocks.APPLE_TREE_LEAVES, leavesDrops(MavesBlocks.APPLE_TREE_LEAVES,
                MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES, leavesDrops(MavesBlocks.APPLE_TREE_FLOWERING_LEAVES,
                MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES, leavesDrops(MavesBlocks.APPLE_TREE_FLOWERED_LEAVES,
                MavesBlocks.APPLE_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.CACAO_TREE_LEAVES, leavesDrops(MavesBlocks.CACAO_TREE_LEAVES,
                MavesBlocks.CACAO_TREE_SAPLING, 0.0625f));
        addDrop(MavesBlocks.RUBBER_LEAVES, leavesDrops(MavesBlocks.RUBBER_LEAVES,
                MavesBlocks.RUBBER_SAPLING, 0.0625f));
        addDrop(MavesBlocks.WILLOW_LEAVES, leavesDrops(MavesBlocks.WILLOW_LEAVES,
                MavesBlocks.WILLOW_SAPLING, 0.0625f));

    }
}
