package com.ibenrush.mc.item;

import com.ibenrush.mc.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class LithiumOreItem {

    public static final RegistryObject<Item> LITHIUM_ORE =
            Registration.ITEMS.register("lithium_ore",
                    ()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register(){}
}
