package com.teamaurora.frostburn_expansion.core.other;

import com.teamabnormals.abnormals_core.core.utils.DataUtils;
import com.teamaurora.frostburn_expansion.common.data.FrozenSporeDispenseBehavior;
import com.teamaurora.frostburn_expansion.core.registry.FrostburnExpansionBlocks;
import com.teamaurora.frostburn_expansion.core.registry.FrostburnExpansionItems;
import net.minecraft.block.DispenserBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

@SuppressWarnings("deprecated")
public class FrostburnExpansionData {
    public static void registerDispenserBehaviors() {
        DispenserBlock.registerDispenseBehavior(FrostburnExpansionItems.FROZEN_SPORES.get(), new FrozenSporeDispenseBehavior());
    }

    public static void registerCompostables() {
        DataUtils.registerCompostable(0.3f, FrostburnExpansionBlocks.AURORAL_LEAVES.get());
        DataUtils.registerCompostable(0.3f, FrostburnExpansionBlocks.AURORAL_SAPLING.get());
        DataUtils.registerCompostable(0.3f, FrostburnExpansionBlocks.AURORAL_LEAF_CARPET.get());

        DataUtils.registerCompostable(0.3f, FrostburnExpansionBlocks.OLNEYA_LEAVES.get());
        DataUtils.registerCompostable(0.3f, FrostburnExpansionBlocks.OLNEYA_SAPLING.get());
        DataUtils.registerCompostable(0.3f, FrostburnExpansionBlocks.OLNEYA_LEAF_CARPET.get());
    }

    public static void registerFlammables() {
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_LEAVES.get(), 30, 60);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_LOG.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_WOOD.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.STRIPPED_AURORAL_LOG.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.STRIPPED_AURORAL_WOOD.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_PLANKS.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_SLAB.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_STAIRS.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_FENCE.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_FENCE_GATE.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.VERTICAL_AURORAL_PLANKS.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_LEAF_CARPET.get(), 30, 60);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.AURORAL_VERTICAL_SLAB.get(), 5, 20);

        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_LEAVES.get(), 30, 60);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_LOG.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_WOOD.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.STRIPPED_OLNEYA_LOG.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.STRIPPED_OLNEYA_WOOD.get(), 5, 5);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_PLANKS.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_SLAB.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_STAIRS.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_FENCE.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_FENCE_GATE.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.VERTICAL_OLNEYA_PLANKS.get(), 5, 20);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_LEAF_CARPET.get(), 30, 60);
        DataUtils.registerFlammable(FrostburnExpansionBlocks.OLNEYA_VERTICAL_SLAB.get(), 5, 20);
    }
}
