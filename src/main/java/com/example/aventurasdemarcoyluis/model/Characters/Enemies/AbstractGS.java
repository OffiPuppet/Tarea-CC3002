package com.example.aventurasdemarcoyluis.model.Characters.Enemies;

import com.example.aventurasdemarcoyluis.model.AbstractCharacter;

/**
 * AbstractClass of Goomba and Spiny
 */
public abstract class AbstractGS extends AbstractCharacter implements AttackableByMarcos, AttackableByLuis, Enemy {
    protected int win;

    /**
     * Constructor
     * @param ATK   attack points
     * @param DEF   defense points
     * @param HP    health points
     * @param LVL   level of the enemy
     * @param w   winning
     */
    public AbstractGS(int ATK, int DEF, int HP, int LVL, int w) {
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

