package com.example.aventurasdemarcoyluis.model;

/**
 * Represents a Character
 * @author Kevin Iturra
 * @version 3.3.0
 * @since 1.0.0
 */
public interface Character {

    /**
     * Deteated Character
     * @return boolean true or false
     */
    boolean isDefeated();

    /**
     * Returns the number of attack points of the character
     * @return int
     */
    int getATK();

    /**
     * Change attack points of a character by given value.
     * @param attackPoints int
     */
    void setATK(int attackPoints);

    /**
     *  Sets  a new defence value adding or subtracting up
     * @param up is the value to be added
     */
    void setDEF(int up);

    /**
     * Gets current defence of the character
     * @return current defence of the character
     */
    int getCurrentDEF();

    /**
     * Gets level of the character
     * @param lvl up
     */
    void setLVL(int lvl);
    /**
     *get level of the character
     * @return the level of the character
     */
    int getLVL();

    /**
     * @return the character's current HP.
     */
    int getHP();

    /**
     * @return the character's maximum Health Points.
     */
    int getMaxHealthPoints();

    /**
     * Sets the character's current HP.
     * subtracting a given parameter
     * @param ATK , the new HP after an event related with theirs HP.
     */
    void setHP(int ATK);

    /**
     * Gets the current winnings
     */
    int getWin();

    /**
     * Sets a win
     * @param v win
     */
    void setWin(int v);
}
