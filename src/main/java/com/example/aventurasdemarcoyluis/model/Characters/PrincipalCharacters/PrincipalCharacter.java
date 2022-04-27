package com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters;
import com.example.aventurasdemarcoyluis.model.Character;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.*;
import com.example.aventurasdemarcoyluis.model.Items.Inventario;
import com.example.aventurasdemarcoyluis.model.Items.HoneySyrup;
import com.example.aventurasdemarcoyluis.model.Items.RedMushroom;

/**
 * Represents a Principal Character
 */
public interface PrincipalCharacter extends Character {

    /**
     * if a character can attack
     * @return true, else false
     */
    boolean canAttack();

    /**
     * Sets the fight points
     * @param value is the amount to be set to the current FP.
     */
    void setFP(int value);

    /**
     *Set max fight points
     *@param f amount added to the actual maxFP
     */
    void setmaxFP(int f);

    /**
     *  Gets the current Fight points
     * @return FP
     */
    int getFP();

    /**
     * Gets level of the character
     * @param lvl up
     */
    void setLVL(int lvl);

    /**
     * Sets the character's max HP.
     * adding a value
     * @param h , value to be added
     */
    void setmaxHP(int h);

    /**
     * Gets the maximum Fight points
     * @return the maximun fight points of the character
     */
    int getmaxFP();

    /**
     * Used by method attack
     * @param aGoomba a character
     */
    void attackedByGoomba(Goomba aGoomba);

    /**
     * Used by method attack
     * @param aSpiny a character
     */
    void attackedBySpiny(Spiny aSpiny);

    /**
     * Triggers the effect of a RedMushroom over a character.
     * @param rm the RedMushroom to be used.
     */
    void useRedMushroom(RedMushroom rm);

    /**
     * Triggers the effect of a HoneySyrup over a character.
     * @param hs the HoneySyrup to be used.
     */
    void useHoneySyrup(HoneySyrup hs);

    /**
     * @return the items carried by this character
     */
    Inventario getChest();

    /**
     * Sets the same Chest to Marcos and Luis
     * @param Inventario chest
     */
    void setChest(Inventario Inventario);

    /**
     * If players won the match
     * @return true or false
     */
    boolean winBattle();
}
