package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.AbstractCharacter;

/**
 * AbstractClass of Boo
 */
public abstract class AbstractBoo extends AbstractCharacter implements AttackableByMarcos, Enemy {
    protected int win;

    /**
     * Constructor
     * @param ATK   attack points
     * @param DEF   defense points
     * @param HP    heal points
     * @param LVL   level of the enemy
     * @param w   a win
     */
    public AbstractBoo(int ATK, int DEF, int HP, int LVL, int w) {
        super(ATK, DEF, HP, LVL);
        this.win = w;
    }

    @Override
    public void setWin(int v) {
        this.win += v;
    }

    @Override
    public int getWin() {
        return this.win;
    }
}
