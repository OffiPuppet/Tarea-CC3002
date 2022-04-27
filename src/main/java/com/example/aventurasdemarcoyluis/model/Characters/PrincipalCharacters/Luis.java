package com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters;

import com.example.aventurasdemarcoyluis.model.Characters.Enemies.*;
import com.example.aventurasdemarcoyluis.model.Items.HoneySyrup;
import com.example.aventurasdemarcoyluis.model.Items.RedMushroom;

/**
 * Class of Principal Character Luis
 */
public class Luis extends AbstractPrincipalCharacter implements AttackableByBoo, AttackOfLuis{
    /**
     * Creates Luis
     * @param ATK attack points of Luis
     * @param DEF defense points of Luis
     * @param HP health points of Luis
     * @param FP fight points of Luis
     * @param LVL level of Luis
     * @param w winning of the player
     */
    public Luis(int ATK, int DEF, int HP, int LVL, int FP, int w) {
        super(ATK, DEF, HP, LVL, FP, w);
    }

    @Override
    public void attackedByGoomba(Goomba aGoomba) {
        this.setHP((int) (0.75 * (aGoomba.getATK() * aGoomba.getLVL() / this.getCurrentDEF())));

    }
    @Override
    public void attackedByBoo(BOO aBoo){
        this.setHP((int) Math.round(0.75 * aBoo.getATK() * aBoo.getLVL() / this.getCurrentDEF()));
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
    public void attackJump(AttackableByLuis anEnemy) {
        if(this.canAttack()) {
            anEnemy.attackedByJumpLuis(this);
        }
        else{
            anEnemy.setHP(0);
        }
    }

    @Override
    public void attackHammer(AttackableByLuis anEnemy) {
        if (this.canAttack()) {
            anEnemy.attackedByHammerLuis(this);
        }
        else{
            anEnemy.setHP(0);
        }
    }
}
