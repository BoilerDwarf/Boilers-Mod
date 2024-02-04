package com.boiler.dwarf.boilersmod.entity.client;

import com.boiler.dwarf.boilersmod.BoilersMod;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;


public class ModModelLayers {
    public static final EntityModelLayer TRILOBITE =
            new EntityModelLayer(new Identifier(BoilersMod.MOD_ID, "trilobite"), "main");
}
