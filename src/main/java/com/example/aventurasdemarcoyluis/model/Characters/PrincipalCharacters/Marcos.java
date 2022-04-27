package com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters;

import com.example.aventurasdemarcoyluis.model.Characters.Enemies.*;
import com.example.aventurasdemarcoyluis.model.Items.HoneySyrup;
import com.example.aventurasdemarcoyluis.model.Items.RedMushroom;

/**
 * Class of Principal Character Marcos
 */
public class Marcos extends AbstractPrincipalCharacter implements AttackOfMarcos {
    /**
     * Creates Marcos
     * @param ATK attack points of Luis
     * @param DEF defense points of Luis
     * @param HP maximum health points of Luis
     * @param FP fight points of Luis
     * @param LVL level of Luis
     * @param w winning of the player
     *
     */
    public Marcos(int ATK, int DEF, int HP, int LVL, int FP, int w) {
        super(ATK, DEF, HP, LVL, FP, w);
    }

    @Override
    public void attackedByGoomba(Goomba aGoomba) {
        this.setHP((int) Math.round(0.75 * aGoomba.getATK() * aGoomba.getLVL() / this.getCurrentDEF()));
    }

    @Override
    public void attackedBySpiny(Spiny aSpiny) {
        this.setHP((int) Math.round(0.75 * aSpiny.getATK() * aSpiny.getLVL() / this.getCurrentDEF()));
    }

    @Override
    public void useRedMushroom(RedMushroom rm) {
        this.addRedMushroomToChest(-1);
        this.setHP((int) Math.round(-0.1 * this.getMaxHealthPoints()));
    }

    @Override
    public void useHoneySyrup(HoneySyrup hs) {
        this.addHoneySyrupToChest(-1);
        this.setFP(-3);
    }

    @Override
    public void attackJump(AttackableByMarcos aEnemy) {
        if(this.canAttack()) {
            aEnemy.attackedByJumpMarco(this);
        }
        else{
            aEnemy.setHP(0);
        }
    }

    @Override
    public void attackHammer(AttackableByMarcos anEnemy) {
        if (this.canAttack()) {
            anEnemy.attackedByHammerMarco(this);
        }
        else{
            anEnemy.setHP(0);
        }
    }
}
