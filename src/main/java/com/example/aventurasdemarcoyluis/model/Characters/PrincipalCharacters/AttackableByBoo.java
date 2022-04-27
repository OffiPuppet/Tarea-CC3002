package com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters;

import com.example.aventurasdemarcoyluis.model.Character;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.BOO;

/**
 * Represents who is attackable by Boo
 */
public interface AttackableByBoo extends Character {

    /**
     * Used by method attack
     * @param aBoo a character
     */
    default void attackedByBoo(BOO aBoo){

    }
}
