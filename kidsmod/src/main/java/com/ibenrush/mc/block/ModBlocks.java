package com.ibenrush.mc.block;

import com.ibenrush.mc.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> CHEESE_BLOCK = register("cheese_block",
            ()->new Block(AbstractBlock.Properties.of(Material.CAKE)
            .strength(2f, 10f)
            .sound(SoundType.HONEY_BLOCK)));

    public static void register(){}

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier){
        RegistryObject<T> theBlock = Registration.BLOCKS.register(name, supplier);
        Registration.ITEMS.register(
                name, ()->new BlockItem(theBlock.get(),
                        new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return theBlock;
    }
}
