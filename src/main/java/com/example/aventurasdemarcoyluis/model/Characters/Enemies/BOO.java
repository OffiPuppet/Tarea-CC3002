package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.AttackableByBoo;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Marcos;

/**
 * Class of Boo Character
 */
public class BOO extends AbstractBoo {
    /**
     * Creates a new Boo
     *
     * @param ATK attack points
     * @param DEF defense points
     * @param HP  heal points
     * @param LVL level of the Unit
     * @param w wins
     */
    public BOO(int ATK, int DEF, int HP, int LVL, int w) {
        super(ATK, DEF, HP, LVL, w);
    }

    /**
     * Method used to attack an opponent
     *
     * @param player character attackablebyboo
     */
    public void attack(AttackableByBoo player) {
        player.attackedByBoo(this);
    }

    @Override
    public void attackedByJumpMarco(Marcos aMarcos) {
        if (this.isDefeated()) {
            this.setHP(0);
        }
        else{
            aMarcos.setFP(1);
            this.setHP((int) Math.round(1.0 * aMarcos.getATK() * aMarcos.getLVL() / this.getCurrentDEF()));
        }
    }

    @Override
    public void attackedByHammerMarco(Marcos aMarcos) {
        if (!this.isDefeated()) {
            if (aMarcos.roll() != 0) {
                aMarcos.setFP(2);
                this.setHP(0);
            } else {
                aMarcos.setFP(2);
            }
        } else {
            this.setHP(0);
        }
    }

    @Override
    public boolean canAttackEnemy() {
        return !this.isDefeated();
    }
}
