package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Luis;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Marcos;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.PrincipalCharacter;

/**
 * Class of Goomba Character
 */
public class Goomba extends AbstractGS {
    /**
     * Creates a new GOOMBA
     *
     * @param ATK   attack points
     * @param DEF   defense points
     * @param HP    heal points
     * @param LVL   level of the Unit
     * @param w   a win
     */
    public Goomba(int ATK, int DEF, int HP, int LVL, int w) {
        super(ATK, DEF, HP, LVL, w);
    }

    /**
     * Method used to attack an opponent
     * @param player player
     */
    public void attack(PrincipalCharacter player){
        player.attackedByGoomba(this);
    }

    @Override
    public boolean canAttackEnemy() {
        return this.currentHP != 0;
    }

    @Override
    public void attackedByJumpMarco(Marcos aMarcos) {
        if (this.isDefeated()) {
            this.setHP(0);
        } else {
            aMarcos.setFP(1);
            this.setHP((int) Math.round(1.0 * aMarcos.getATK() * aMarcos.getLVL() / this.getCurrentDEF()));
        }
    }

    @Override
    public void attackedByHammerMarco(Marcos aMarcos) {
        if (this.isDefeated()) {
            this.setHP(0);
        } else {
            if (aMarcos.roll() == 0) {
                aMarcos.setFP(2);
                this.setHP((int) Math.round(1.5 * aMarcos.getATK() * aMarcos.getLVL() / this.getCurrentDEF()));
            } else {
                this.setHP(0);
                aMarcos.setFP(2);
            }
        }
    }

    @Override
    public void attackedByJumpLuis(Luis luis) {
        if (this.isDefeated()) {
            this.setHP(0);
        } else {
            luis.setFP(1);
            this.setHP((int) Math.round(1.0 * luis.getATK() * luis.getLVL() / this.getCurrentDEF()));
        }
    }

    @Override
    public void attackedByHammerLuis(Luis luis) {
        if (!this.isDefeated()) {
            if (luis.roll() != 0) {
                luis.setFP(2);
                this.setHP(0);
            } else {
                this.setHP((int) Math.round(1.5 * luis.getATK() * luis.getLVL() / this.getCurrentDEF()));
                luis.setFP(2);
            }
        }
        else{
            this.setHP(0);
        }
    }
}
