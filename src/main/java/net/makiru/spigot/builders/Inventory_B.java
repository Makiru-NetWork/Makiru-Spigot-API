package net.makiru.spigot.builders;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Copyright © LEVASSEUR Wesley
 *
 * @author LEVASSEUR Wesley
 */
public class Inventory_B {

    private Inventory inventory;
    private Player player;

    public Inventory_B(Inventory inventory) {
        this(inventory, null);
    }

    public Inventory_B(Inventory inventory, Player player) {
        this.inventory = inventory;
        this.player = player;
    }

    public Inventory_B(Player owner, @NotNull InventoryType type) {
        this((InventoryHolder) owner, type);
        this.player = owner;
    }

    public Inventory_B(Player owner, int size) {
        this((InventoryHolder) owner, size);
        this.player = owner;
    }

    public Inventory_B(Player owner, @NotNull InventoryType type, @NotNull String title) {
        this((InventoryHolder) owner, type, title);
        this.player = owner;
    }

    public Inventory_B(Player owner, int size, @NotNull String title) {
        this((InventoryHolder) owner, size, title);
        this.player = owner;
    }

    public Inventory_B(@Nullable InventoryHolder owner, @NotNull InventoryType type) {
        this.inventory = Bukkit.createInventory(owner, type);
    }

    public Inventory_B(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title) {
        this.inventory = Bukkit.createInventory(owner, type, title);
    }

    public Inventory_B(@Nullable InventoryHolder owner, int size) {
        this.inventory = Bukkit.createInventory(owner, size);
    }

    public Inventory_B(@Nullable InventoryHolder owner, int size, @NotNull String title) {
        this.inventory = Bukkit.createInventory(owner, size);
    }

    public Inventory_B setItem(int pos, ItemStack itemStack) {
        this.inventory.setItem(pos, itemStack);
        return this;
    }

    public Inventory_B addItem(ItemStack... itemStacks) {
        this.inventory.addItem(itemStacks);
        return this;
    }

    public Inventory_B removeItem(ItemStack... itemStacks) {
        this.inventory.removeItem(itemStacks);
        return this;
    }

    public Inventory_B setContents(ItemStack[] itemStacks) {
        this.inventory.setContents(itemStacks);
        return this;
    }

    public Inventory_B setStorageContents(ItemStack[] itemStacks) {
        this.inventory.setStorageContents(itemStacks);
        return this;
    }

    public Inventory_B remove(ItemStack itemStack) {
        this.inventory.remove(itemStack);
        return this;
    }

    public Inventory_B remove(Material material) {
        this.inventory.remove(material);
        return this;
    }

    public Inventory_B clear() {
        this.inventory.clear();
        return this;
    }

    public Inventory_B clear(int i) {
        this.inventory.clear(i);
        return this;
    }

    public Inventory_B fill(ItemStack itemStack, int start, int stop) {
        this.fill(itemStack, start, stop, false);
        return this;
    }

    public Inventory_B fill(ItemStack itemStack, int start, int stop, boolean includeStop) {
        for (int i = start; includeStop ? i <= stop : i < stop; i++) {
            this.inventory.setItem(i, itemStack);
        }
        return this;
    }

    public Inventory_B fillNull(ItemStack itemStack, int start, int stop) {
        this.fillNull(itemStack, start, stop, false);
        return this;
    }

    public Inventory_B fillNull(ItemStack itemStack, int start, int stop, boolean includeStop) {
        for (int i = start; includeStop ? i <= stop : i < stop; i++) {
            if (this.inventory.getItem(i) == null)
                this.inventory.setItem(i, itemStack);
        }
        return this;
    }

    public Inventory_B clone() throws CloneNotSupportedException {
        return (Inventory_B) super.clone();
    }

    public Inventory toInventory() {
        return this.inventory;
    }

    public Player getPlayer() {
        return this.player;
    }
}
