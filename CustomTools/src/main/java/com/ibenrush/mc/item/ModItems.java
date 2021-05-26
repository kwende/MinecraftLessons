package com.ibenrush.mc.item;

import com.ibenrush.mc.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> KITTY_SHOVEL =
            Registration.ITEMS.register("kitty_shovel",
                    ()-> new ShovelItem(ModItemTier.KITTY, 0, 0,
                            new Item.Properties()
                            .addToolType(ToolType.SHOVEL, 2)
                            .tab(ItemGroup.TAB_MATERIALS)));

    public static void register(){

    }

    public enum ModItemTier implements IItemTier {

        KITTY(2,  150, 2.5f, 1f, 15,
                Ingredient.of(Items.CHARCOAL.getItem()));

        private final int _harvestLevel;
        private final int _maxUses;
        private final float _efficiency;
        private final float _attackDamage;
        private final int _enchantability;
        private final Ingredient _repairItem;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage,
                    int enchantability, Ingredient repairItem) {
            _harvestLevel = harvestLevel;
            _maxUses = maxUses;
            _efficiency = efficiency;
            _attackDamage = attackDamage;
            _enchantability = enchantability;
            _repairItem = repairItem;
        }

        @Override
        public int getUses() {
            return _maxUses;
        }

        @Override
        public float getSpeed() {
            return _efficiency;
        }

        @Override
        public float getAttackDamageBonus() {
            return _attackDamage;
        }

        @Override
        public int getLevel() {
            return _harvestLevel;
        }

        @Override
        public int getEnchantmentValue() {
            return _enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return _repairItem;
        }
    }
}