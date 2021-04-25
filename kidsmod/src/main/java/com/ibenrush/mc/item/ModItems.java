package com.ibenrush.mc.item;

import com.ibenrush.mc.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> INFINITY_GAUNTLET =
            Registration.ITEMS.register("infinity_gauntlet",
                    ()->new Item(new Item.Properties()
                    .tab(ItemGroup.TAB_MATERIALS)));

    public static void register(){

    }
}
