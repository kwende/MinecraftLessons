package com.ibenrush.mc.block;

import com.ibenrush.mc.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.world.gen.feature.structure.EndCityPieces;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class LithiumBlock {
    public static final RegistryObject<Block> LITHIUM_BLOCK = register("lithium_block",
            ()->new Block(AbstractBlock.Properties.of(Material.METAL)
            .strength(3f, 10f)
            .sound(SoundType.STONE)));

    public static void register(){}

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier) {
        RegistryObject<T> blockItem = Registration.BLOCKS.register(name, supplier);
        Registration.ITEMS.register(name,
                ()-> new BlockItem(blockItem.get(),
                        new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return blockItem;
    }
}
