package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Luis;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Marcos;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.PrincipalCharacter;

/**
 * Class of Spiny Character
 */
public class Spiny extends AbstractGS {
    /**
     * Creates a new SPINY
     *
     * @param ATK   attack points
     * @param DEF   defense points
     * @param HP    health points
     * @param LVL   level of SPINY
     */
    public Spiny(int ATK, int DEF, int HP, int LVL, int w) {
        super(ATK, DEF, HP, LVL, w);
    }

    /**
     * Method used to attack an opponent
     * @param player player
     */
    public void attack(PrincipalCharacter player){
        player.attackedBySpiny(this);
    }

    @Override
    public boolean canAttackEnemy() {
        return !this.isDefeated();
    }

    @Override
    public void attackedByJumpMarco(Marcos aMarcos) {
        if (this.isDefeated()) {
            this.setHP(0);
        }
        else{
            aMarcos.setFP(1);
            aMarcos.setHP((int) Math.round(0.05 * aMarcos.getHP()));
        }
    }

    @Override
    public void attackedByHammerMarco(Marcos aMarcos) {
        if (!this.isDefeated()) {
            if (aMarcos.roll() != 0) {
                aMarcos.setFP(2);
            } else {
                aMarcos.setFP(2);
                this.setHP((int) Math.round(1.5 * aMarcos.getATK() * aMarcos.getLVL() / this.getCurrentDEF()));
            }
        }
        else{
            this.setHP(0);
        }
    }

    @Override
    public void attackedByJumpLuis(Luis luis) {
        if (this.isDefeated()) {
            this.setHP(0);
        }
        else{
            luis.setFP(1);
            luis.setHP((int) Math.round(0.05 * luis.getHP()));
        }
    }

    @Override
    public void attackedByHammerLuis(Luis luis) {
        if (this.isDefeated()) {
            this.setHP(0);
        }
        else{
            if (luis.roll() != 0) {
                luis.setFP(2);
            } else {
                luis.setFP(2);
                this.setHP((int) Math.round(1.5 * luis.getATK() * luis.getLVL() / this.getCurrentDEF()));
            }
        }
    }
}
