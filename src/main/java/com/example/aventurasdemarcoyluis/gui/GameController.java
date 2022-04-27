package com.example.aventurasdemarcoyluis.gui;

import com.example.aventurasdemarcoyluis.model.Character;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.*;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Luis;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Marcos;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.PrincipalCharacter;
import com.example.aventurasdemarcoyluis.model.Items.Inventario;
import com.example.aventurasdemarcoyluis.model.Items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Create controller which allows to control model of game, this contains a list of playerss, a chest and
 * variable turn.
 */
public class GameController {
    private final List<Character> listOfPlayers;
    private Inventario inventario;
    protected int turn;

    /**
     * Constructor of controller
     */
    public GameController() {
        listOfPlayers = new ArrayList<>();
    }

    /**
     * Method that creates principal characters. Then they are added to a list
     */
    public List<Character> createPlayers() {
        Marcos marcos = new Marcos(3,10,10,1,10,0);
        Luis luis = new Luis(3,10,10,1,10,0);
        createChest(marcos, luis);
        listOfPlayers.add(marcos);
        listOfPlayers.add(luis);
        return listOfPlayers;
    }

    /**
     * Method that creates a chest to save items
     * @param marcos marcos character
     * @param luis luis character
     */
    public void createChest(Marcos marcos, Luis luis) {
        inventario = new Inventario();
        inventario.addAmountOfRedMushroom(3);
        inventario.addAmountOfHoneySyrup(3);
        marcos.setChest(inventario);
        luis.setChest(inventario);

    }

    /**
     * Method to get the player
     * @param value valor at list
     * @return Character
     */
    public Character getPlayer(int value) {
        return this.getListOfPlayers().get(value);
    }

    /**
     * Method to get list of players
     * @return listOfPlayers a list
     */
    public List<Character> getListOfPlayers() {
        return listOfPlayers;
    }

    /**
     * Method to create a enemy randomly in order given at worksheet
     * @param random random variable
     */
    public void createEnemy(Random random) {
        int k = random.nextInt(3);
        if(k == 0){
            Goomba goomba = new Goomba(2, 10, 10,1,0);
            listOfPlayers.add(goomba);
        }
        if(k == 1){
            BOO boo = new BOO(2,10,10,1,0);
            listOfPlayers.add(boo);
        }
        if(k == 2){
            Spiny spiny = new Spiny(2,10,10,1,0);
            listOfPlayers.add(spiny);
        }
    }

    /**
     * Method that creates i random enemies
     * @param enemies amount of enemies
     * @param random  random variable
     */
    public void createEnemies(int enemies, Random random) {
        for(int i = 0; i < enemies; i++){
            createEnemy(random);
        }
    }

    /**
     * Method that allows principal characters to use items
     */
    public void playerUseItemOfChest(Item items, PrincipalCharacter player) {
        items.use(player);
    }

    /**
     * Method to get amount of items in chest
     * @return amountOfItems amount of an item
     */
    public List<Integer> getItemsOfChest() {
        List<Integer> amountOfItems = new ArrayList<>();
        int amountOfRedMushroom = inventario.getAmountOfRedMushroom();
        amountOfItems.add(amountOfRedMushroom);
        int amountOfHoneySyrup = inventario.getAmountOfHoneySyrup();
        amountOfItems.add(amountOfHoneySyrup);
        return amountOfItems;
    }

    /**
     * Method to remove a character who is died
     */
    public void removeKOCharacter() {
        for(int i = 0; i < listOfPlayers.size(); i++){
            Character diedOne = listOfPlayers.get(i);
            if (diedOne.getHP() == 0){
                listOfPlayers.remove(diedOne);
            }
        }
    }

    /**
     * Gets player by turn
     * @param  turn turn
     * @return  Character character
     */
    public Character turnCharacter(int turn){
        for (int i = 0; i < listOfPlayers.size(); i++) {
            if (i==turn){ return listOfPlayers.get(i);}}
        return null;
    }

    /**
     * Get turn of next character
     * @return turnCharacter(nextTurn) character
     */
    public Character moveToNextCharacter(){
        int nextTurn = this.getTurn() + 1;
        return turnCharacter(nextTurn);
    }

    /**
     * Get turn
     * @return turn turn
     */
    public int getTurn() {
        return turn;
    }

    /**
     * Set turn
     * @param i int i
     */
    public void setTurn(int i) {
        this.turn += i;
    }


    /**
     * Method to know if player wins or not
     * @return True or False
     */

    public Boolean thePrincipalCharacterWon() {
        return listOfPlayers.get(0).getWin() == 5 || listOfPlayers.get(1).getWin() == 5;
    }

    /**
     *When a player can't do anything else
     * finishturn() sets the value of turn
     */
    public void finishTurn() {
        setTurn(1);
    }
}
