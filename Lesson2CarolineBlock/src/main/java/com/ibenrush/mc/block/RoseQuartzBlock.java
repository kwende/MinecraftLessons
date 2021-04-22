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


public class RoseQuartzBlock {

    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = register("rose_quartz_block",
            ()->new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f)
                    .sound(SoundType.BONE_BLOCK)));

    public static void register(){}

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier){
        RegistryObject<T> block = Registration.BLOCKS.register(name, supplier);
        Registration.ITEMS.register(name,
                ()->new BlockItem(block.get(),
                new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return block;
    }
}
