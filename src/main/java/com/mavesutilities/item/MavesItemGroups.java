package com.mavesutilities.item;

import com.mavesutilities.MavesUtilitiesMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MavesItemGroups {

    public static final Text MAVES_ITEMS = Text.translatable("itemGroup." + MavesUtilitiesMod.MOD_ID + ".maves_items");
    public static final Text MAVES_BLOCKS = Text.translatable("itemGroup." + MavesUtilitiesMod.MOD_ID + ".maves_blocks");

    public static final RegistryKey<ItemGroup> MAVES_ITEMS_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MavesUtilitiesMod.MOD_ID, "maves_items"));
    public static final RegistryKey<ItemGroup> MAVES_BLOCKS_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MavesUtilitiesMod.MOD_ID, "maves_blocks"));

    public static final ItemGroup MAVES_ITEMS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(MavesItems.APPLE_TREE_BARK))
            .displayName(MAVES_ITEMS)
            .build();

    public static final ItemGroup MAVES_BLOCKS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(MavesItems.APPLE_TREE_LOG))
            .displayName(MAVES_BLOCKS)
            .build();

    public static void registerItemGroups() {
        MavesUtilitiesMod.LOGGER.info("Registering Item Groups for " + MavesUtilitiesMod.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, MAVES_ITEMS_GROUP_KEY, MAVES_ITEMS_GROUP);
        Registry.register(Registries.ITEM_GROUP, MAVES_BLOCKS_GROUP_KEY, MAVES_BLOCKS_GROUP);

        ItemGroupEvents.modifyEntriesEvent(MAVES_ITEMS_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(MavesItems.OAK_BARK);
            itemGroup.add(MavesItems.SPRUCE_BARK);
            itemGroup.add(MavesItems.BIRCH_BARK);
            itemGroup.add(MavesItems.JUNGLE_BARK);
            itemGroup.add(MavesItems.ACACIA_BARK);
            itemGroup.add(MavesItems.DARK_OAK_BARK);
            itemGroup.add(MavesItems.MANGROVE_BARK);
            itemGroup.add(MavesItems.CHERRY_BARK);
            itemGroup.add(MavesItems.PALE_OAK_BARK);
            itemGroup.add(MavesItems.APPLE_TREE_BARK);
            itemGroup.add(MavesItems.AZALEA_BARK);
            itemGroup.add(MavesItems.CACAO_TREE_BARK);
            itemGroup.add(MavesItems.RUBBER_BARK);
            itemGroup.add(MavesItems.WILLOW_BARK);
            itemGroup.add(MavesItems.CRIMSON_BARK);
            itemGroup.add(MavesItems.WARPED_BARK);
            itemGroup.add(MavesItems.GREEN_APPLE);
            itemGroup.add(MavesItems.PUMPKIN_SLICE);
            itemGroup.add(MavesItems.PALE_PUMPKIN_SLICE);
            itemGroup.add(MavesItems.CHERRIES);
            itemGroup.add(MavesItems.WILD_BERRIES_BLUE);
            itemGroup.add(MavesItems.WILD_BERRIES_GREEN);
            itemGroup.add(MavesItems.WILD_BERRIES_YELLOW);
            itemGroup.add(MavesItems.MILK_CHOCOLATE);
            itemGroup.add(MavesItems.WHITE_CHOCOLATE);
            itemGroup.add(MavesItems.DARK_CHOCOLATE);
            itemGroup.add(MavesItems.ACORN);
            itemGroup.add(MavesItems.DARK_ACORN);
            itemGroup.add(MavesItems.PALE_ACORN);
            itemGroup.add(MavesItems.ACACIA_POD);
            itemGroup.add(MavesItems.SPRUCE_CONE);
            itemGroup.add(MavesItems.PALE_PUMPKIN_SEEDS);
            itemGroup.add(MavesItems.ACACIA_BLOSSOM);
            itemGroup.add(MavesItems.APPLE_BLOSSOM);
            itemGroup.add(MavesItems.AZALEA_BLOSSOM);
            itemGroup.add(MavesItems.BIRCH_CATKINS);
            itemGroup.add(MavesItems.APPLE_TREE_BOAT);
            itemGroup.add(MavesItems.APPLE_TREE_CHEST_BOAT);
            itemGroup.add(MavesItems.AZALEA_BOAT);
            itemGroup.add(MavesItems.AZALEA_CHEST_BOAT);
            itemGroup.add(MavesItems.CACAO_TREE_BOAT);
            itemGroup.add(MavesItems.CACAO_TREE_CHEST_BOAT);
            itemGroup.add(MavesItems.RUBBER_BOAT);
            itemGroup.add(MavesItems.RUBBER_CHEST_BOAT);
            itemGroup.add(MavesItems.WILLOW_BOAT);
            itemGroup.add(MavesItems.WILLOW_CHEST_BOAT);
        });

        ItemGroupEvents.modifyEntriesEvent(MAVES_BLOCKS_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(MavesItems.OAK_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.BIRCH_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.JUNGLE_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.ACACIA_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.ACACIA_FLOWERED_LEAVES);
            itemGroup.add(MavesItems.DARK_OAK_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.CHERRY_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.PALE_OAK_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.PALE_PUMPKIN);
            itemGroup.add(MavesItems.CARVED_PALE_PUMPKIN);
            itemGroup.add(MavesItems.PALE_JACK_O_LANTERN);
            itemGroup.add(MavesItems.APPLE_TREE_LOG);
            itemGroup.add(MavesItems.APPLE_TREE_WOOD);
            itemGroup.add(MavesItems.STRIPPED_APPLE_TREE_LOG);
            itemGroup.add(MavesItems.STRIPPED_APPLE_TREE_WOOD);
            itemGroup.add(MavesItems.APPLE_TREE_PLANKS);
            itemGroup.add(MavesItems.APPLE_TREE_STAIRS);
            itemGroup.add(MavesItems.APPLE_TREE_SLAB);
            itemGroup.add(MavesItems.APPLE_TREE_FENCE);
            itemGroup.add(MavesItems.APPLE_TREE_FENCE_GATE);
            itemGroup.add(MavesItems.APPLE_TREE_SIGN);
            itemGroup.add(MavesItems.APPLE_TREE_HANGING_SIGN);
            itemGroup.add(MavesItems.APPLE_TREE_DOOR);
            itemGroup.add(MavesItems.APPLE_TREE_TRAPDOOR);
            itemGroup.add(MavesItems.APPLE_TREE_PRESSURE_PLATE);
            itemGroup.add(MavesItems.APPLE_TREE_BUTTON);
            itemGroup.add(MavesItems.APPLE_TREE_LEAVES);
            itemGroup.add(MavesItems.APPLE_TREE_FLOWERING_LEAVES);
            itemGroup.add(MavesItems.APPLE_TREE_FLOWERED_LEAVES);
            itemGroup.add(MavesItems.APPLE_TREE_SAPLING);
            itemGroup.add(MavesItems.AZALEA_STEM);
            itemGroup.add(MavesItems.AZALEA_WOOD);
            itemGroup.add(MavesItems.STRIPPED_AZALEA_STEM);
            itemGroup.add(MavesItems.STRIPPED_AZALEA_WOOD);
            itemGroup.add(MavesItems.AZALEA_PLANKS);
            itemGroup.add(MavesItems.AZALEA_STAIRS);
            itemGroup.add(MavesItems.AZALEA_SLAB);
            itemGroup.add(MavesItems.AZALEA_FENCE);
            itemGroup.add(MavesItems.AZALEA_FENCE_GATE);
            itemGroup.add(MavesItems.AZALEA_SIGN);
            itemGroup.add(MavesItems.AZALEA_HANGING_SIGN);
            itemGroup.add(MavesItems.AZALEA_DOOR);
            itemGroup.add(MavesItems.AZALEA_TRAPDOOR);
            itemGroup.add(MavesItems.AZALEA_PRESSURE_PLATE);
            itemGroup.add(MavesItems.AZALEA_BUTTON);
            itemGroup.add(MavesItems.CACAO_TREE_LOG);
            itemGroup.add(MavesItems.CACAO_TREE_WOOD);
            itemGroup.add(MavesItems.STRIPPED_CACAO_TREE_LOG);
            itemGroup.add(MavesItems.STRIPPED_CACAO_TREE_WOOD);
            itemGroup.add(MavesItems.CACAO_TREE_PLANKS);
            itemGroup.add(MavesItems.CACAO_TREE_STAIRS);
            itemGroup.add(MavesItems.CACAO_TREE_SLAB);
            itemGroup.add(MavesItems.CACAO_TREE_FENCE);
            itemGroup.add(MavesItems.CACAO_TREE_FENCE_GATE);
            itemGroup.add(MavesItems.CACAO_TREE_SIGN);
            itemGroup.add(MavesItems.CACAO_TREE_HANGING_SIGN);
            itemGroup.add(MavesItems.CACAO_TREE_DOOR);
            itemGroup.add(MavesItems.CACAO_TREE_TRAPDOOR);
            itemGroup.add(MavesItems.CACAO_TREE_PRESSURE_PLATE);
            itemGroup.add(MavesItems.CACAO_TREE_BUTTON);
            itemGroup.add(MavesItems.CACAO_TREE_LEAVES);
            itemGroup.add(MavesItems.CACAO_TREE_SAPLING);
            itemGroup.add(MavesItems.RUBBER_LOG);
            itemGroup.add(MavesItems.RUBBER_WOOD);
            itemGroup.add(MavesItems.STRIPPED_RUBBER_LOG);
            itemGroup.add(MavesItems.STRIPPED_RUBBER_WOOD);
            itemGroup.add(MavesItems.RUBBER_PLANKS);
            itemGroup.add(MavesItems.RUBBER_STAIRS);
            itemGroup.add(MavesItems.RUBBER_SLAB);
            itemGroup.add(MavesItems.RUBBER_FENCE);
            itemGroup.add(MavesItems.RUBBER_FENCE_GATE);
            itemGroup.add(MavesItems.RUBBER_SIGN);
            itemGroup.add(MavesItems.RUBBER_HANGING_SIGN);
            itemGroup.add(MavesItems.RUBBER_DOOR);
            itemGroup.add(MavesItems.RUBBER_TRAPDOOR);
            itemGroup.add(MavesItems.RUBBER_PRESSURE_PLATE);
            itemGroup.add(MavesItems.RUBBER_BUTTON);
            itemGroup.add(MavesItems.RUBBER_LEAVES);
            itemGroup.add(MavesItems.RUBBER_SAPLING);
            itemGroup.add(MavesItems.WILLOW_LOG);
            itemGroup.add(MavesItems.WILLOW_WOOD);
            itemGroup.add(MavesItems.STRIPPED_WILLOW_LOG);
            itemGroup.add(MavesItems.STRIPPED_WILLOW_WOOD);
            itemGroup.add(MavesItems.WILLOW_PLANKS);
            itemGroup.add(MavesItems.WILLOW_STAIRS);
            itemGroup.add(MavesItems.WILLOW_SLAB);
            itemGroup.add(MavesItems.WILLOW_FENCE);
            itemGroup.add(MavesItems.WILLOW_FENCE_GATE);
            itemGroup.add(MavesItems.WILLOW_SIGN);
            itemGroup.add(MavesItems.WILLOW_HANGING_SIGN);
            itemGroup.add(MavesItems.WILLOW_DOOR);
            itemGroup.add(MavesItems.WILLOW_TRAPDOOR);
            itemGroup.add(MavesItems.WILLOW_PRESSURE_PLATE);
            itemGroup.add(MavesItems.WILLOW_BUTTON);
            itemGroup.add(MavesItems.WILLOW_LEAVES);
            itemGroup.add(MavesItems.WILLOW_SAPLING);
        });
    }
}