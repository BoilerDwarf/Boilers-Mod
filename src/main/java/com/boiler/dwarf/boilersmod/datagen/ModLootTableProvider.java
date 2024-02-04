package com.boiler.dwarf.boilersmod.datagen;

import com.boiler.dwarf.boilersmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootTable;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public  ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.miku_block);
    }


}
