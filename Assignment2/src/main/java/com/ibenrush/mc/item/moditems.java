package com.ibenrush.mc.item;

import com.ibenrush.mc.util.Registration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class moditems {
    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire",
                    ()->new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
                    ()->new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register(){}
}
