import com.example.aventurasdemarcoyluis.gui.GameController;
import com.example.aventurasdemarcoyluis.model.Character;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.BOO;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.Goomba;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.Spiny;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Marcos;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Luis;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.PrincipalCharacter;
import com.example.aventurasdemarcoyluis.model.Items.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.Random;

/**
 * Controller Test class
 */
public class GameControllerTest {
    private GameController controller;
    private Marcos Marcos;
    private Luis Luis;
    private Goomba GOOMBA;
    private Spiny SPINY;
    private com.example.aventurasdemarcoyluis.model.Characters.Enemies.BOO BOO;
    private Random firstrandom;
    private Random secondrandom;
    private Random thirdrandom;
    private RedMushroom redMushroom;
    private HoneySyrup honeySyrup;

    @BeforeEach
    public void setUp() {
        controller = new GameController();
        Marcos = new Marcos(20, 15, 50, 2, 30, 0);
        Luis = new Luis(15, 10, 50, 1, 30, 0);
        GOOMBA = new Goomba(5, 30, 50, 5, 0);
        SPINY = new Spiny(10, 15, 50, 8, 0);
        BOO = new BOO(4, 70, 50, 1, 0);
        redMushroom = new RedMushroom();
        honeySyrup = new HoneySyrup();
    }

    @Test
    public void testCreatePlayers() {
        controller.createPlayers();
        Assertions.assertEquals(controller.getPlayer(0).getClass(), Marcos.getClass());
        Assertions.assertEquals(controller.getPlayer(0).getLVL(), 1);
        Assertions.assertEquals(controller.getPlayer(0).getHP(), 10);

        Assertions.assertEquals(controller.getPlayer(1).getClass(), Luis.getClass());
        Assertions.assertEquals(controller.getPlayer(1).getLVL(), 1);
        Assertions.assertEquals(controller.getPlayer(1).getHP(), 10);
    }

    @Test
    public void testCreateEnemies() {
        firstrandom = new Random(1445);
        controller.createPlayers();
        controller.createEnemy(firstrandom);
        Assertions.assertEquals(controller.getPlayer(2).getClass(), GOOMBA.getClass());
    }

    @Test
    public void secondtestCreateEnemies() {
        secondrandom = new Random(565);
        controller.createPlayers();
        controller.createEnemy(secondrandom);
        Assertions.assertEquals(controller.getPlayer(2).getClass(), SPINY.getClass());

    }

    @Test
    public void thirdtestCreateEnemies() {
        thirdrandom = new Random(143);
        controller.createPlayers();
        controller.createEnemy(thirdrandom);
        Assertions.assertEquals(controller.getPlayer(2).getClass(), BOO.getClass());
    }

    @Test
    public void testRemoveKOCharacter() {
        firstrandom = new Random();
        controller.createPlayers();
        controller.createEnemies(3, firstrandom);
        controller.getListOfPlayers().get(0).setHP(controller.getListOfPlayers().get(0).getHP());
        Assertions.assertEquals(controller.getPlayer(0).getClass(), Marcos.getClass());
        controller.removeKOCharacter();
        Assertions.assertNotEquals(controller.getPlayer(0).getClass(), Marcos.getClass());
    }

    @Test
    public void testUseItemOfChest() {
        firstrandom = new Random();
        controller.createPlayers();
        controller.createEnemies(3, firstrandom);
        controller.playerUseItemOfChest(redMushroom, (PrincipalCharacter) controller.getPlayer(0));
        controller.playerUseItemOfChest(honeySyrup, (PrincipalCharacter) controller.getPlayer(0));
        Assertions.assertEquals(2, controller.getItemsOfChest().get(1));


    }

    @Test
    public void testTurn() {
        controller.createPlayers();
        firstrandom = new Random(1);
        controller.createEnemy(firstrandom);
        secondrandom = new Random(556);
        controller.createEnemy(secondrandom);
        thirdrandom = new Random(435);
        controller.createEnemy(thirdrandom);
        controller.setTurn(0);
        Assertions.assertEquals(controller.turnCharacter(controller.getTurn()).getClass(), Marcos.getClass());
        controller.setTurn(1);
        Assertions.assertEquals(controller.turnCharacter(controller.getTurn()).getClass(), Luis.getClass());
        controller.setTurn(1);
        Assertions.assertEquals(controller.turnCharacter(controller.getTurn()).getClass(), GOOMBA.getClass());
        controller.setTurn(1);
        Assertions.assertEquals(controller.turnCharacter(controller.getTurn()).getClass(), SPINY.getClass());
        controller.setTurn(1);
        Assertions.assertEquals(controller.turnCharacter(controller.getTurn()).getClass(), BOO.getClass());

    }

    @Test
    public void testShiftNextCharacter() {
        controller.createPlayers();
        firstrandom = new Random(1);
        controller.createEnemy(firstrandom);
        secondrandom = new Random(556);
        controller.createEnemy(secondrandom);
        thirdrandom = new Random(435);
        controller.createEnemy(thirdrandom);
        controller.setTurn(0);
        Assertions.assertEquals(controller.moveToNextCharacter().getClass(), Luis.getClass());
    }

    @Test
    public void TestEndTurn() {
        controller.createPlayers();
        firstrandom = new Random(1);
        controller.createEnemy(firstrandom);
        secondrandom = new Random(556);
        controller.createEnemy(secondrandom);
        thirdrandom = new Random(435);
        controller.createEnemy(thirdrandom);
        controller.setTurn(2);
        Assertions.assertEquals(controller.turnCharacter(controller.getTurn()).getClass(), GOOMBA.getClass());
        Assertions.assertEquals(controller.moveToNextCharacter().getClass(), SPINY.getClass());
        controller.finishTurn();
        Assertions.assertEquals(controller.turnCharacter(controller.getTurn()).getClass(), SPINY.getClass());
    }

    @Test
    public void TestThePrincipalCharactersWon() {
        List<Character> t = controller.createPlayers();
        Assertions.assertEquals(false, controller.thePrincipalCharacterWon());
        t.get(0).setWin(5);
        Assertions.assertEquals(true, controller.thePrincipalCharacterWon());
    }
}
