package com.ibenrush.mc.block;

import com.ibenrush.mc.coppermod;
import com.ibenrush.mc.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.data.TexturedModel;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class CopperBlock {
    public static RegistryObject<Block> COPPER_BLOCK = register("copper_block",
            ()->new Block(AbstractBlock.Properties.of(Material.STONE)
            .strength(2f, 10f).harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.METAL)));

    public static void register(){}

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier){
        RegistryObject<T> blockItem = Registration.BLOCKS.register(name, supplier);
        Registration.ITEMS.register(name,
                ()-> new BlockItem(blockItem.get(),
                        new Item.Properties().tab(coppermod.CUSTOM_TAB)));
        return blockItem;

    }
}
