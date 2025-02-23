package com.mavesutilities.util;

import com.mavesutilities.block.MavesBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MavesFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(MavesBlocks.APPLE_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.APPLE_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_APPLE_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_APPLE_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.APPLE_TREE_LEAVES, 30, 60);

        registry.add(MavesBlocks.APPLE_TREE_PLANKS, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_FENCE, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_SLAB, 5, 20);
        registry.add(MavesBlocks.APPLE_TREE_STAIRS, 5, 20);

        registry.add(MavesBlocks.AZALEA_STEM, 5, 5);
        registry.add(MavesBlocks.AZALEA_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_AZALEA_STEM, 5, 5);
        registry.add(MavesBlocks.STRIPPED_AZALEA_WOOD, 5, 5);

        registry.add(MavesBlocks.AZALEA_PLANKS, 5, 20);
        registry.add(MavesBlocks.AZALEA_FENCE, 5, 20);
        registry.add(MavesBlocks.AZALEA_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.AZALEA_SLAB, 5, 20);
        registry.add(MavesBlocks.AZALEA_STAIRS, 5, 20);

        registry.add(MavesBlocks.CACAO_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.CACAO_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_CACAO_TREE_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_CACAO_TREE_WOOD, 5, 5);
        registry.add(MavesBlocks.CACAO_TREE_LEAVES, 30, 60);

        registry.add(MavesBlocks.CACAO_TREE_PLANKS, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_FENCE, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_SLAB, 5, 20);
        registry.add(MavesBlocks.CACAO_TREE_STAIRS, 5, 20);

        registry.add(MavesBlocks.RUBBER_LOG, 5, 5);
        registry.add(MavesBlocks.RUBBER_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_RUBBER_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_RUBBER_WOOD, 5, 5);
        registry.add(MavesBlocks.RUBBER_LEAVES, 30, 60);

        registry.add(MavesBlocks.RUBBER_PLANKS, 5, 20);
        registry.add(MavesBlocks.RUBBER_FENCE, 5, 20);
        registry.add(MavesBlocks.RUBBER_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.RUBBER_SLAB, 5, 20);
        registry.add(MavesBlocks.RUBBER_STAIRS, 5, 20);

        registry.add(MavesBlocks.WILLOW_LOG, 5, 5);
        registry.add(MavesBlocks.WILLOW_WOOD, 5, 5);
        registry.add(MavesBlocks.STRIPPED_WILLOW_LOG, 5, 5);
        registry.add(MavesBlocks.STRIPPED_WILLOW_WOOD, 5, 5);
        registry.add(MavesBlocks.WILLOW_LEAVES, 30, 60);

        registry.add(MavesBlocks.WILLOW_PLANKS, 5, 20);
        registry.add(MavesBlocks.WILLOW_FENCE, 5, 20);
        registry.add(MavesBlocks.WILLOW_FENCE_GATE, 5, 20);
        registry.add(MavesBlocks.WILLOW_SLAB, 5, 20);
        registry.add(MavesBlocks.WILLOW_STAIRS, 5, 20);
    }
}
