package com.boiler.dwarf.boilersmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent shrimp_chip = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.25f)
            .snack()
            .build();

}
