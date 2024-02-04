package com.boiler.dwarf.boilersmod;

import com.boiler.dwarf.boilersmod.block.ModBlocks;
import com.boiler.dwarf.boilersmod.datagen.ModLootTableProvider;
import com.boiler.dwarf.boilersmod.entity.ModEntities;
import com.boiler.dwarf.boilersmod.entity.custom.Trilobite;
import com.boiler.dwarf.boilersmod.item.ModItemGroups;
import com.boiler.dwarf.boilersmod.item.ModItems;
import com.boiler.dwarf.boilersmod.soundregistries.ModSounds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BoilersMod
        implements ModInitializer {

    public static final String MOD_ID = "boilersmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();

        ModBlocks.registerModBlocks();


        FabricDefaultAttributeRegistry.register(ModEntities.TRILOBITE, Trilobite.createTrilobiteAttributes());
        LOGGER.info("Sup");

        ModEntities.registerModEntities();
        ModSounds.registerSounds();
    }
}
