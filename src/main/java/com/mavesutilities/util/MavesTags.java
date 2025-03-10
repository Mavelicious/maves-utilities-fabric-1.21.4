package com.mavesutilities.util;

import com.mavesutilities.MavesUtilitiesMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MavesTags {
    public static class Blocks {
        public static final TagKey<Block> APPLE_TREE_LOGS = createTag("apple_tree_logs");
        public static final TagKey<Block> AZALEA_STEMS = createTag("azalea_stems");
        public static final TagKey<Block> CACAO_TREE_LOGS = createTag("cacao_tree_logs");
        public static final TagKey<Block> RUBBER_TREE_LOGS = createTag("rubber_tree_logs");
        public static final TagKey<Block> WILLOW_LOGS = createTag("willow_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MavesUtilitiesMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> APPLE_TREE_LOGS = createTag("apple_tree_logs");
        public static final TagKey<Item> AZALEA_STEMS = createTag("azalea_stems");
        public static final TagKey<Item> CACAO_TREE_LOGS = createTag("cacao_tree_logs");
        public static final TagKey<Item> RUBBER_TREE_LOGS = createTag("rubber_tree_logs");
        public static final TagKey<Item> WILLOW_LOGS = createTag("willow_logs");

        public static final TagKey<Item> APPLES = createTag("apples");
        public static final TagKey<Item> WILD_BERRIES = createTag("wild_berries");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MavesUtilitiesMod.MOD_ID, name));
        }
    }
}
