package com.ibenrush.mc.item;

import com.ibenrush.mc.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class RoseQuartzBlockItem
{
    public static final RegistryObject<Item> ROSE_QUARTZ_ITEM =
            Registration.ITEMS.register("rose_quartz_item",
                    ()->new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static void register(){}

}
