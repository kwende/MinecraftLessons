package com.ibenrush.mc.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CarolinesCheese extends Item {
    public CarolinesCheese() {
        super(new Properties().tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .nutrition(10)
                        .saturationMod(1.5f)
                        .effect(new EffectInstance(Effects.HEAL, 300, 1), 1f)
                        .build()));
    }
}
