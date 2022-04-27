package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.Character;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Luis;

/**
 * Represents who is attackable by Luis
 */
public interface AttackableByLuis extends Enemy, Character {

    /**
     * Method when an enemy is attacked by Luis with a jump
     * @param aPlayer the player that attacked, only called by Luis
     */

    void attackedByJumpLuis(Luis aPlayer);

    /**
     * Method when an enemy is attacked by Luis with a Hammer
     * @param aPlayer the player that attacked, can only be called by Luis
     */

    void attackedByHammerLuis(Luis aPlayer);
}
