package com.ibenrush.mc.item;

import net.minecraft.client.gui.fonts.TexturedGlyph;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheeseItem extends Item {
    public CheeseItem(){
        super(new Properties().tab(ItemGroup.TAB_MATERIALS)
            .food(new Food.Builder()
                    .nutrition(5)
                    .saturationMod(1.5f)
                    .effect(new EffectInstance(Effects.GLOWING, 300, 1), .5f)
                    .build()));
    }
}
