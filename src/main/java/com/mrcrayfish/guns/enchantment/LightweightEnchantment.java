package com.mrcrayfish.guns.enchantment;

import net.minecraft.world.entity.EquipmentSlot;

import net.minecraft.world.item.enchantment.Enchantment.Rarity;

/**
 * Author: MrCrayfish
 */
public class LightweightEnchantment extends GunEnchantment
{
    public LightweightEnchantment()
    {
        super(Rarity.RARE, EnchantmentTypes.GUN, new EquipmentSlot[]{EquipmentSlot.MAINHAND}, Type.WEAPON);
    }

    @Override
    public int getMinCost(int level)
    {
        return 15;
    }

    @Override
    public int getMaxCost(int level)
    {
        return this.getMinCost(level) + 20;
    }
}
