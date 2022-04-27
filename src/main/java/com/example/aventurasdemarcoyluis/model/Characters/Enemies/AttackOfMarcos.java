package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

/**
 * Attack type by Marcos
 */
public interface AttackOfMarcos {
    /**
     * Hammer attack, costs 2 FP and is successful 75% of the time. Its damage constant is 1.5
     * @param enemy the enemy that is attacked
     */
    void attackHammer(AttackableByMarcos enemy);

    /**
     * Jump attack, costs 1 FP and its damage constant is 1
     * @param enemy the enemy that is attacked
     */
    void attackJump(AttackableByMarcos enemy);
}
