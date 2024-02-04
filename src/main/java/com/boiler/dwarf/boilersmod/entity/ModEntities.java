package com.boiler.dwarf.boilersmod.entity;

import com.boiler.dwarf.boilersmod.BoilersMod;
import com.boiler.dwarf.boilersmod.entity.custom.Trilobite;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<Trilobite> TRILOBITE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BoilersMod.MOD_ID, "trilobite"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, Trilobite::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static void registerModEntities() {
        BoilersMod.LOGGER.info("Registering Entities for " + BoilersMod.MOD_ID);
    }
}
