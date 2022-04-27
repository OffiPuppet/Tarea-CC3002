package com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters;

import com.example.aventurasdemarcoyluis.model.AbstractCharacter;
import com.example.aventurasdemarcoyluis.model.Character;
import com.example.aventurasdemarcoyluis.model.Items.Inventario;
import java.util.Random;

/**
 * Abstract Class of Principal Characters
 */
public abstract class AbstractPrincipalCharacter extends AbstractCharacter implements PrincipalCharacter, Character {
    protected int maxFP;
    protected int win;
    protected int currentFP;
    private Inventario Inventario;
    private final Random random;

    /**
     * Constructor
     *
     * @param ATK attack points
     * @param DEF defense points
     * @param HP  heal points
     * @param LVL level of the Unit
     * @param FP  fight points
     * @param w winning of the player
     *
     */
    public AbstractPrincipalCharacter(int ATK, int DEF, int HP, int LVL, int FP, int w) {
        super(ATK, DEF, HP, LVL);
        this.maxFP = FP;
        this.currentFP = FP;
        this.win = w;
        random = new Random();
        Inventario = new Inventario();
    }

    /**
     * Se creó un método que agrega
     * una cantidad de RedMushroom al Baul
     * @param value cantidad de RedMushroom
     */
    public void addRedMushroomToChest(int value){
        this.getChest().addAmountOfRedMushroom(value);
    }

    /**
     * Se creó un método que agrega una cantidad
     * de HoneySyrup al Baul del personaje
     * @param value cantidad de HoneySyrup
     */


    public void addHoneySyrupToChest(int value){
        this.getChest().addAmountOfHoneySyrup(value);
    }

    /**
     * Se creó el método que permite obtener la cantidad
     * de HoneySyrup que posee el personaje
     * @return HoneySyrup
     */
    public int getAmountOfHoneySyrup() {
        return this.getChest().getAmountOfHoneySyrup();
    }

    /**
     * Se creó el método que permite obtener la cantidad
     * de RedMushroom que posee el personje
     * @return RedMushroom
     */

    public int getAmountOfRedMushroom() {return this.getChest().getAmountOfRedMushroom();}

    /**
     * Se creó una método que aplicara una semilla
     * a la instancia random
     * @param seed semilla
     */
    public void setSeed(int seed){
        random.setSeed(seed);
    }

    /**
     *Se devolvera el siguente valor int
     * pseudoaleatorio en un rango de [0-2]
     * @return valor aletorio
     */

    public int roll() {
        return random.nextInt(4);
    }

    @Override
    public int getmaxFP() {
        return maxFP;
    }

    @Override
    public int getFP() {
        return currentFP;
    }

    @Override
    public void setmaxHP(int h) {
        this.maxHP += h;
        if(this.currentHP>this.maxHP){
            this.currentHP = this.maxHP;
        }
    }

    @Override
    public void setmaxFP(int f) {
        this.maxFP += f;
        if(this.currentFP>this.maxFP){
            this.currentFP = this.maxFP;
        }
    }

    @Override
    public void setFP(int cost) {
        if (!this.isDefeated()) {
            this.currentFP -= cost;
        }
        if (this.currentFP <= 0) {
            this.currentFP = 0;
        }
        if (this.currentFP >= getmaxFP()) {
            this.currentFP = getmaxFP();
        }
    }

    @Override
    public void setLVL(int l) {
        this.LVL += l;
    }

    @Override
    public void setWin(int v) {
        this.win += v;
    }

    @Override
    public int getWin() {
        return this.win;
    }

    @Override
    public Inventario getChest() { return Inventario;}

    @Override
    public void setChest(Inventario inventario) { this.Inventario = inventario;}

    @Override
    public boolean winBattle() {
        return this.getWin() >= 5;
    }

    /**
     * Se creo un metodo que realiza cambios en los atributos de los personajes
     * cuando este sube de nivel
     */
    public void levelUp(){
        this.setmaxHP((int) Math.round(this.getMaxHealthPoints()*0.15));
        this.setHP((int) Math.round(this.getMaxHealthPoints()*-0.15));
        this.setmaxFP((int) Math.round(this.getmaxFP()*0.15));
        this.setFP((int) (-1.0 * Math.round(this.getmaxFP()*0.15 + this.getFP())));
        this.setATK((int) Math.round(this.getATK()*0.15));
        this.setDEF((int) Math.round(this.getCurrentDEF()*0.15));
        this.setLVL(1);
        this.setWin(1);
        this.Inventario.addAmountOfRedMushroom(1);
        this.Inventario.addAmountOfHoneySyrup(1);
        this.setChest(this.Inventario);}

    @Override
    public boolean canAttack() {
        if(this.currentFP == 0){
            return false;
        }
        else if (this.isDefeated()){
            this.setATK((int) (-1.0*this.getATK()));
            return false;
        }
        else{
            return true;
        }
    }
}
