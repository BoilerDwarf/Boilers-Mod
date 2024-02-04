package com.boiler.dwarf.boilersmod.item;

import com.boiler.dwarf.boilersmod.BoilersMod;

import com.boiler.dwarf.boilersmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup BoilersStuff = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BoilersMod.MOD_ID, "boilers"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.boilers"))
                    .icon(() -> new ItemStack(ModBlocks.beeg_miku_block)).entries((displayContext, entries) -> {
                        entries.add(ModItems.plane_rear);
                        entries.add(ModItems.wood_chassis);
                        entries.add(ModItems.plane_engine);
                        entries.add(ModItems.plane_wing);
                        entries.add(ModItems.airship_balloon);
                        entries.add(ModItems.airship_engine);
                        entries.add(ModItems.bamboo_chassis);
                        entries.add(ModItems.gyrodyne_wheel);

                        entries.add(ModItems.copper_gear);

                        entries.add(ModItems.shrimp_chip);

                        entries.add(ModItems.trilobite_spawn_egg);

                        entries.add(ModBlocks.miku_block);
                        entries.add(ModBlocks.beeg_miku_block);

                    }).build());

    public static void registerItemGroups() {
        BoilersMod.LOGGER.info("Registering Item Groups for " + BoilersMod.MOD_ID);
    }
}
