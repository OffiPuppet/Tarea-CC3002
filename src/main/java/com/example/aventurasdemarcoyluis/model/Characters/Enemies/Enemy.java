package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.Character;
/**
 * Represents an Enemy
 */
public interface Enemy extends Character{
    /**
     * if an enemy can attack a player
     * @return true, else false
     */
    boolean canAttackEnemy();

}
