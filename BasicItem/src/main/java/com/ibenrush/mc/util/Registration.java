package com.ibenrush.mc.util;

import com.ibenrush.mc.judemod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration
{
    // notice how we're tying together the registry type (BLOCKS)
    // with the class that'll be implementing that type.
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, judemod.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, judemod.MOD_ID);

    public static void Register()
    {
        // grab the event bus. notice how we're tying the implementation
        // class now to the event bus. so, we're stitching together
        // the registry with the event bus with the type that implements
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
