package com.boiler.dwarf.boilersmod.block;

import com.boiler.dwarf.boilersmod.BoilersMod;

import com.boiler.dwarf.boilersmod.block.custom.BeegMikuBlock;
import com.boiler.dwarf.boilersmod.block.custom.MikuBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block miku_block = registerBlock("miku_block",
            new MikuBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).nonOpaque()));
    public static final Block beeg_miku_block = registerBlock("beeg_miku_block",
            new BeegMikuBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BoilersMod.MOD_ID, name), block);
    }

    public static Item registerBlockItems(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BoilersMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        BoilersMod.LOGGER.info("Registering ModBlocks for " + BoilersMod.MOD_ID);
    }
}
