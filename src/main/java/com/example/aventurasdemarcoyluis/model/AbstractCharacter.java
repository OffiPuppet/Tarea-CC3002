package com.example.aventurasdemarcoyluis.model;

import java.util.Random;

/**
 * Abstract Class of All Characters
 */
public abstract class AbstractCharacter implements Character {
    protected Random random;
    protected int DEF;
    protected int LVL;
    protected int ATK;
    protected int currentHP;
    protected int currentDEF;
    protected int currentFP;
    protected int maxHP;

    /**
     *
     * @param ATK Attack points
     * @param DEF defense points
     * @param HP health points
     * @param LVL current level
     */
    public AbstractCharacter(int ATK, int DEF, int HP, int LVL){
        this.ATK = ATK;
        this.DEF = DEF;
        this.maxHP = HP;
        this.currentHP = HP;
        this.currentDEF = DEF;
        this.LVL = LVL;
        random = new Random();
    }

    @Override
    public int getHP() {
        return this.currentHP;}

    @Override
    public int getMaxHealthPoints() {
        return this.maxHP;
    }

    @Override
    public void setHP(int value) {
        if (!this.isDefeated()) {
            this.currentHP -= value;}
        if (this.currentHP <= 0) {
            this.currentHP = 0;}
        if (this.currentHP >= getMaxHealthPoints()) {
            this.currentHP = getMaxHealthPoints();}
    }

    @Override
    public void setDEF(int up){
        this.currentDEF += up;
    }

    @Override
    public int getLVL(){
        return this.LVL;
    }

    @Override
    public void setLVL(int lvl) {this.LVL +=1; }

    @Override
    public void setATK(int attackPoints) {
        this.ATK += attackPoints;
    }

    @Override
    public int getATK(){
        return this.ATK;
    }

    @Override
    public int getCurrentDEF(){
        return this.currentDEF;
    }

    @Override
    public boolean isDefeated() {
        return getHP() <= 0;
    }
}
