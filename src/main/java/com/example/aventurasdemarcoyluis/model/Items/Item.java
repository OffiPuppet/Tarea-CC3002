package com.example.aventurasdemarcoyluis.model.Items;

import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.PrincipalCharacter;

/**
 * Represents the item to be use
 */
public interface Item {
    /**
     * To call a method to use different items
     * @param character that use an item
     */
    void use(PrincipalCharacter character);
}
