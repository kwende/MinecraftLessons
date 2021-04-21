package com.ibenrush.mc.item;

import com.ibenrush.mc.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModItems
{
    // notice how we're using our Registration helper to attach to the items registry
    // via the DeferredRegister object and creating a new item of name "copper_ingot"
    // whose item properties attach it to my mod class.
    //public static final RegistryObject<Item> COPPER_INGOT =
    //        Registration.ITEMS.register("copper_ingot",
    //                ()-> new Item(new Item.Properties().group(judemod.MOD_ID)));

    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
                    () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    // probably called just to invoke the static initializers.
    public static void Register()
    {}
}
