package com.example.aventurasdemarcoyluis.model.Items;

import java.util.HashMap;

/**
 * Create a Chest to save items, remove items and add items
 */
public class Inventario {
    private final HashMap<Item, Integer> inv;
    private final RedMushroom redMushroom;
    private final HoneySyrup honeySyrup;

    /**
     * Constructor of Chest
     */
    public Inventario() {
        redMushroom = new RedMushroom();
        honeySyrup = new HoneySyrup();
        inv = new HashMap<>();
        inv.put(redMushroom,0);
        inv.put(honeySyrup,0);
    }

    /**
     * Method to add amount of RedMushroom
     * @param value amount
     */
    public void addAmountOfRedMushroom(int value){
        int amount = inv.get(redMushroom);
        inv.put(redMushroom,amount + value);
    }

    /**
     * Method to add amount of HoneySyrup
     * @param value amount
     */
    public void addAmountOfHoneySyrup(int value){
        int amount = inv.get(honeySyrup);
        inv.put(honeySyrup ,amount + value);
    }

    /**
     * Method that obtain amount of honeysyrup at the chest
     * @return amount of HoneySyrup
     */
    public int getAmountOfHoneySyrup(){
        return inv.get(honeySyrup);
    }

    /**
     * Method that obtain amount of redmushroom at the chest
     * @return amount of redmushroom
     */
    public int getAmountOfRedMushroom(){
        return inv.get(redMushroom);
    }

    /**
     * Method to remove amount of RedMushroom
     * @param value amount
     */
    public void removeRedMushroom(int value){
        int amount = inv.get(redMushroom);
        inv.put(redMushroom, Math.max(amount - value, 0));

    }

    /**
     * Method to remove amount of HoneySyrup
     * @param value amount
     */
    public void removeHoneySyrup(int value){
        int amount = inv.get(honeySyrup);
        inv.put(honeySyrup, Math.max(amount - value, 0));
    }
}
