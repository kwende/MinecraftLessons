package com.ibenrush.mc.item;

import com.ibenrush.mc.coppermod;
import com.ibenrush.mc.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class CopperWire {
    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire",
                ()->new Item(new Item.Properties().tab(coppermod.CUSTOM_TAB)));

    public static void register(){}
}
