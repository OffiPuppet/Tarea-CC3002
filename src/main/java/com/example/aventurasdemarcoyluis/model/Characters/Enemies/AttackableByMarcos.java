package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.Character;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Marcos;

/**
 * Represents who is attackable by Marcos
 */
public interface AttackableByMarcos extends Enemy, Character {

    /**
     * Method when an enemy is attacked by Marco with a jump
     * @param aMarcos the player that attacked, is only called by Marci
     */
    void attackedByJumpMarco(Marcos aMarcos);

    /**
     * Method when an enemy is attacked by Marco with a Hammer
     * @param aMarcos the player that attacked, only called by Marco
     */
    void attackedByHammerMarco(Marcos aMarcos);
}
