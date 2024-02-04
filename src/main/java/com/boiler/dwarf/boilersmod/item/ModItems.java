package com.boiler.dwarf.boilersmod.item;

import com.boiler.dwarf.boilersmod.BoilersMod;

import com.boiler.dwarf.boilersmod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item plane_rear = registerItem("plane_rear", new Item(new FabricItemSettings()));
    public static final Item wood_chassis = registerItem("wood_chassis", new Item(new FabricItemSettings()));
    public static final Item plane_engine = registerItem("plane_engine", new Item(new FabricItemSettings()));
    public static final Item plane_wing = registerItem("plane_wing", new Item(new FabricItemSettings()));
    public static final Item airship_balloon = registerItem("airship_balloon", new Item(new FabricItemSettings()));
    public static final Item airship_engine = registerItem("airship_engine", new Item(new FabricItemSettings()));
    public static final Item bamboo_chassis = registerItem("bamboo_chassis", new Item(new FabricItemSettings()));
    public static final Item gyrodyne_wheel = registerItem("gyrodyne_wheel", new Item(new FabricItemSettings()));


    public static final Item copper_gear = registerItem("copper_gear", new Item(new FabricItemSettings()));


    public static final Item shrimp_chip = registerItem("shrimp_chip", new Item(new FabricItemSettings().food(ModFoodComponents.shrimp_chip)));


    public static final Item trilobite_spawn_egg = registerItem("trilobite_spawn_egg",
            new SpawnEggItem(ModEntities.TRILOBITE, 4537525, 3218814, new FabricItemSettings()));

    private static void addItemsToBoilersTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(plane_rear);
        entries.add(wood_chassis);
        entries.add(plane_engine);
        entries.add(plane_wing);
        entries.add(airship_balloon);
        entries.add(airship_engine);
        entries.add(bamboo_chassis);
        entries.add(gyrodyne_wheel);

        entries.add(copper_gear);

        entries.add(shrimp_chip);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoilersMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BoilersMod.LOGGER.info("Registering Mod Items for " + BoilersMod.MOD_ID);
    }
}
