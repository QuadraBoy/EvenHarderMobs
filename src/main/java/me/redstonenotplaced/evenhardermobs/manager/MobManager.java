package me.redstonenotplaced.evenhardermobs.manager;

import me.redstonenotplaced.evenhardermobs.state.MobState;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobManager {
    private MobState mobState = MobState.DISABLED;

    /**
     * Gets the current mob state
     *
     * @return The current mob state
     */
    public MobState getMobState() {
        return this.mobState;
    }

    /**
     * Sets the mob state
     *
     * @param mobState The mob state that we will set.
     */
    public void setMobState(MobState mobState) {
        if(this.mobState == mobState) return;
        this.mobState = mobState;
    }

    /**
     * Gives armor to mobs
     *
     * @param entity The entity we will give armor
     * @param helmet The type of helmet to give to the mob
     * @param chestPlate The type of chestplate that we will give to the mob
     * @param leggings The type of leggings that we will give to the mob
     * @param boots The type of boots that we will give to the mob
     */
    public void giveArmor(LivingEntity entity, Material helmet, Material chestPlate, Material leggings, Material boots) {
        entity.getEquipment().setHelmet(new ItemStack(helmet));
        entity.getEquipment().setChestplate(new ItemStack(chestPlate));
        entity.getEquipment().setLeggings(new ItemStack(leggings));
        entity.getEquipment().setBoots(new ItemStack(boots));
    }

    /**
     * Gives weapon to mobs
     *
     * @param entity The entity that we will give weapons
     * @param weapon The weapon type that we will give
     * @param enchantment The enchantment that we will give to the weapon
     * @param level The enchantment level that we will give to the enchantment
     */
    public void giveWeapon(LivingEntity entity, ItemStack weapon, Enchantment enchantment, int level) {
        weapon.addEnchantment(enchantment, level);
        entity.getEquipment().setItemInMainHand(weapon);
    }
}