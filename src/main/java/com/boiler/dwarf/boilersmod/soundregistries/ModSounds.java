package com.boiler.dwarf.boilersmod.soundregistries;

import com.boiler.dwarf.boilersmod.BoilersMod;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent TRILOBITE_HURT = registerSoundEvent("entity_trilobite_hurt");
    public static final SoundEvent TRILOBITE_DEATH = registerSoundEvent("entity_trilobite_death");


    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(BoilersMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        BoilersMod.LOGGER.info("Registering Sounds for " + BoilersMod.MOD_ID);
    }
}
