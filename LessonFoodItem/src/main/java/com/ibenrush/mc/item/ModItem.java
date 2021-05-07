package com.ibenrush.mc.item;

import com.ibenrush.mc.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItem {
    public static final RegistryObject<Item> CHEESE_ITEM =
            Registration.ITEMS.register("cheese_item",
                    ()->new CheeseItem());

    public static void register(){}
}
