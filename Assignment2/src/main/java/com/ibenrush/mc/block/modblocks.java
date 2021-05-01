package com.ibenrush.mc.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import com.ibenrush.mc.util.Registration;

import java.util.function.Supplier;

public class modblocks {
    public static final RegistryObject<Block> COPPER_BLOCK =
            register("copper_block",
                    ()-> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3.0f, 10.0f)
                    .sound(SoundType.STONE)));

    public static void register(){}

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier){
        RegistryObject<T> blockItem = Registration.BLOCKS.register(name, supplier);
        Registration.ITEMS.register(name,
                ()-> new BlockItem(blockItem.get(),
                        new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return blockItem;
    }
}
