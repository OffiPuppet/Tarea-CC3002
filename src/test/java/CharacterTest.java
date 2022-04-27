import com.example.aventurasdemarcoyluis.model.Characters.Enemies.BOO;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.Goomba;
import com.example.aventurasdemarcoyluis.model.Characters.Enemies.Spiny;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Marcos;
import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.Luis;
import com.example.aventurasdemarcoyluis.model.Items.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Class CharacterTest
 */
public class CharacterTest {
    private Goomba GOOMBA;
    private Marcos Marcos;
    private Spiny SPINY;
    private Luis Luis;
    private BOO BOO;
    private RedMushroom redMushroom;
    private HoneySyrup honeySyrup;

    @BeforeEach
    public void setUp() {
        Marcos = new Marcos(2,1,10,2,10, 0);
        SPINY = new Spiny(2,1,10,2,0);
        GOOMBA = new Goomba(2,3,10,1,0);
        BOO = new BOO(2,3,10,1,0);
        Luis = new Luis(2,2,10,2,10, 0);
        redMushroom = new RedMushroom();
        honeySyrup = new HoneySyrup();
    }

    @Test
    public void testSetSeedAndRollMarco(){

        Marcos.setSeed(4321);
        Assertions.assertEquals(0,Marcos.roll());

        Marcos.setSeed(1);
        Assertions.assertEquals(2,Marcos.roll());

        Marcos.setSeed(5678);
        Assertions.assertEquals(3,Marcos.roll());

        Marcos.setSeed(6559);
        Assertions.assertEquals(1,Marcos.roll());

    }
    @Test
    public void testLuis() {
        Assertions.assertTrue(Luis.canAttack());

        Assertions.assertEquals(10, Luis.getMaxHealthPoints());
        Luis.setmaxHP(1);
        Assertions.assertEquals(11, Luis.getMaxHealthPoints());

        Assertions.assertEquals(10, Luis.getHP());
        Luis.setHP(-5);
        Assertions.assertEquals(11, Luis.getHP());

        Assertions.assertEquals(2, Luis.getATK());
        Luis.setATK(2);
        Assertions.assertEquals(4, Luis.getATK());

        Assertions.assertEquals(2, Luis.getLVL());
        Luis.setLVL(1);
        Assertions.assertEquals(3, Luis.getLVL());

        Assertions.assertEquals(2, Luis.getCurrentDEF());
        Luis.setDEF(-1);
        Assertions.assertEquals(1, Luis.getCurrentDEF());

        Assertions.assertEquals(10, Luis.getmaxFP());
        Luis.setmaxFP(-1);
        Assertions.assertEquals(9, Luis.getmaxFP());

        Assertions.assertEquals(9, Luis.getFP());
        Luis.setFP(1);
        Assertions.assertEquals(8, Luis.getFP());

        Assertions.assertEquals(0, Luis.getWin());
        Luis.setWin(1);
        Assertions.assertEquals(1, Luis.getWin());

        Assertions.assertFalse(Luis.isDefeated());

        Luis.setHP(Luis.getHP());
        Assertions.assertEquals(0, Luis.getHP());
        Assertions.assertFalse(Luis.canAttack());
        Assertions.assertTrue(Luis.isDefeated());

        Luis.setHP(-11);
    }

    @Test
    public void TestMarcos() {
        Assertions.assertTrue(Marcos.canAttack());

        Assertions.assertEquals(10, Marcos.getMaxHealthPoints());
        Marcos.setmaxHP(1);
        Assertions.assertEquals(11, Marcos.getMaxHealthPoints());

        Assertions.assertEquals(10, Marcos.getHP());
        Marcos.setHP(1);
        Assertions.assertEquals(9, Marcos.getHP());

        Assertions.assertEquals(2, Marcos.getATK());
        Marcos.setATK(2);
        Assertions.assertEquals(4, Marcos.getATK());

        Assertions.assertEquals(2, Marcos.getLVL());
        Marcos.setLVL(1);
        Assertions.assertEquals(3, Marcos.getLVL());

        Assertions.assertEquals(1, Marcos.getCurrentDEF());
        Marcos.setDEF(1);
        Assertions.assertEquals(2, Marcos.getCurrentDEF());

        Assertions.assertEquals(10, Marcos.getmaxFP());
        Marcos.setmaxFP(1);
        Assertions.assertEquals(11, Marcos.getmaxFP());

        Assertions.assertEquals(10, Marcos.getFP());
        Marcos.setFP(1);
        Assertions.assertEquals(9, Marcos.getFP());

        Assertions.assertEquals(0, Marcos.getWin());
        Marcos.setWin(1);
        Assertions.assertEquals(1, Marcos.getWin());

        Assertions.assertFalse(Marcos.isDefeated());

        Marcos.setmaxHP(-3);
        Marcos.setHP(Marcos.getHP());
        Assertions.assertEquals(0, Marcos.getHP());
        Assertions.assertFalse(Marcos.canAttack());
        Assertions.assertTrue(Marcos.isDefeated());
    }

    @Test
    public void TestBoo() {
        Assertions.assertTrue(BOO.canAttackEnemy());

        Assertions.assertEquals(10, BOO.getHP());
        BOO.setHP(1);
        Assertions.assertEquals(9, BOO.getHP());

        Assertions.assertEquals(2, BOO.getATK());
        BOO.setATK(2);
        Assertions.assertEquals(4, BOO.getATK());

        Assertions.assertEquals(1, BOO.getLVL());
        BOO.setLVL(1);
        Assertions.assertEquals(2, BOO.getLVL());

        Assertions.assertEquals(3, BOO.getCurrentDEF());
        BOO.setDEF(1);
        Assertions.assertEquals(4, BOO.getCurrentDEF());

        Assertions.assertEquals(0, BOO.getWin());
        BOO.setWin(1);
        Assertions.assertEquals(1, BOO.getWin());

        Assertions.assertFalse(BOO.isDefeated());

        BOO.setHP(BOO.getHP());
        Assertions.assertEquals(0, BOO.getHP());
        Assertions.assertFalse(BOO.canAttackEnemy());
        Assertions.assertTrue(BOO.isDefeated());
    }

    @Test
    public void TestSpiny() {
        Assertions.assertTrue(SPINY.canAttackEnemy());

        Assertions.assertEquals(10, SPINY.getHP());
        SPINY.setHP(1);
        Assertions.assertEquals(9, SPINY.getHP());

        Assertions.assertEquals(2, SPINY.getATK());
        SPINY.setATK(2);
        Assertions.assertEquals(4, SPINY.getATK());

        Assertions.assertEquals(2, SPINY.getLVL());
        SPINY.setLVL(1);
        Assertions.assertEquals(3, SPINY.getLVL());

        Assertions.assertEquals(1, SPINY.getCurrentDEF());
        SPINY.setDEF(1);
        Assertions.assertEquals(2, SPINY.getCurrentDEF());

        Assertions.assertEquals(0, SPINY.getWin());
        SPINY.setWin(1);
        Assertions.assertEquals(1, SPINY.getWin());

        Assertions.assertFalse(SPINY.isDefeated());

        SPINY.setHP(SPINY.getHP());
        Assertions.assertEquals(0, SPINY.getHP());
        Assertions.assertFalse(SPINY.canAttackEnemy());
        Assertions.assertTrue(SPINY.isDefeated());
    }

    @Test
    public void TestGoomba() {
        Assertions.assertTrue(GOOMBA.canAttackEnemy());

        Assertions.assertEquals(10, GOOMBA.getHP());
        GOOMBA.setHP(1);
        Assertions.assertEquals(9, GOOMBA.getHP());

        Assertions.assertEquals(2, GOOMBA.getATK());
        GOOMBA.setATK(2);
        Assertions.assertEquals(4, GOOMBA.getATK());

        Assertions.assertEquals(1, GOOMBA.getLVL());
        GOOMBA.setLVL(1);
        Assertions.assertEquals(2, GOOMBA.getLVL());

        Assertions.assertEquals(3, GOOMBA.getCurrentDEF());
        GOOMBA.setDEF(1);
        Assertions.assertEquals(4, GOOMBA.getCurrentDEF());

        Assertions.assertEquals(0, GOOMBA.getWin());
        GOOMBA.setWin(1);
        Assertions.assertEquals(1, GOOMBA.getWin());

        Assertions.assertFalse(GOOMBA.isDefeated());

        GOOMBA.setHP(GOOMBA.getHP());
        Assertions.assertEquals(0, GOOMBA.getHP());
        Assertions.assertFalse(GOOMBA.canAttackEnemy());
        Assertions.assertTrue(GOOMBA.isDefeated());

        GOOMBA.setHP(-10);
    }

    @Test
    public void testUseItemRedMushroom() {
        redMushroom.use(Marcos);
        Assertions.assertEquals(10, Marcos.getHP());
        redMushroom.use(Luis);
        Assertions.assertEquals( 10, Luis.getHP());
    }

    @Test
    public void testUseItemHoneySyrup(){
        honeySyrup.use(Luis);
        Assertions.assertEquals(10, Luis.getFP());
        honeySyrup.use(Marcos);
        Assertions.assertEquals( 10, Marcos.getFP());
    }

    @Test
    public void testAttackByBoo() {
        BOO.attack(Luis);
        Assertions.assertFalse(Luis.isDefeated());
        Assertions.assertEquals(9, Luis.getHP());
    }

    @Test
    public void testAttackBySpiny() {
        SPINY.attack(Luis);
        Assertions.assertFalse(Luis.isDefeated());
        Assertions.assertEquals(8, Luis.getHP());

        SPINY.attack(Marcos);
        Assertions.assertFalse(Marcos.isDefeated());
        Assertions.assertEquals(7, Marcos.getHP());
    }

    @Test
    public void testAttackByGoomba() {
        Assertions.assertEquals(10, Luis.getHP());
        GOOMBA.attack(Luis);
        Assertions.assertFalse(Luis.isDefeated());
        Assertions.assertEquals(10, Luis.getHP());

        GOOMBA.attack(Marcos);
        Assertions.assertFalse(Marcos.isDefeated());
        Assertions.assertEquals(8, Marcos.getHP());
    }

    @Test
    public void testJumpAttackByLuis() {
        Luis.setSeed(1);
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(9, GOOMBA.getHP());
        Assertions.assertEquals(9, Luis.getFP());

        Luis.setSeed(3);
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(8, GOOMBA.getHP());
        Assertions.assertEquals(8, Luis.getFP());

        Luis.setSeed(3);
        GOOMBA.setDEF(-3);
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals( 9, GOOMBA.getHP());
        Assertions.assertEquals(7, Luis.getFP());

        Luis.setSeed(2);
        GOOMBA.setDEF(3);
        GOOMBA.setHP(-15);
        Luis.attackJump(SPINY);
        Assertions.assertEquals( 10, SPINY.getHP());
        Assertions.assertEquals(6, Luis.getFP());

        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(5, Luis.getFP());
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(4, Luis.getFP());
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(3, Luis.getFP());
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(2, Luis.getFP());
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(1, Luis.getFP());
        Luis.attackJump(GOOMBA);
        Marcos.setHP(Marcos.getHP());
        Luis.attackJump(SPINY);
    }

    @Test
    public void testJumpAttackByMarcos() {
        Marcos.setSeed(4321);
        BOO.attackedByJumpMarco(Marcos);
        Assertions.assertEquals(9, BOO.getHP());
        Assertions.assertEquals(9, Marcos.getFP());

        Marcos.setSeed(4321);
        Marcos.attackJump(GOOMBA);
        Assertions.assertEquals(9, GOOMBA.getHP());
        Assertions.assertEquals(8, Marcos.getFP());

        Marcos.setSeed(4321);
        Marcos.attackJump(GOOMBA);
        Assertions.assertEquals( 8, GOOMBA.getHP());
        Assertions.assertEquals(7, Marcos.getFP());

        Marcos.setSeed(4321);
        Marcos.attackJump(BOO);
        Assertions.assertEquals( 8, BOO.getHP());
        Assertions.assertEquals(6, Marcos.getFP());

        Marcos.setSeed(4321);
        Marcos.attackJump(SPINY);
        Assertions.assertEquals(10, SPINY.getHP());
        Assertions.assertEquals(5,Marcos.getFP());

        Marcos.setSeed(4321);
        Marcos.attackJump(BOO);
        Marcos.attackJump(BOO);
        Marcos.attackJump(BOO);
        Marcos.attackJump(BOO);
        Marcos.attackJump(BOO);
        Marcos.attackJump(BOO);
        Assertions.assertEquals(3, BOO.getHP());
        Assertions.assertEquals(0,Marcos.getFP());
        Assertions.assertFalse(BOO.isDefeated());
        Marcos.setHP(Marcos.getHP());
        Marcos.attackJump(BOO);
    }

    @Test
    public void testHammerAttackByMarcos() {
        Marcos.setSeed(4321);
        Marcos.attackHammer(SPINY);
        Assertions.assertEquals(8, Marcos.getFP());
        Assertions.assertEquals(4, SPINY.getHP());

        Marcos.setSeed(1);
        Marcos.attackHammer(SPINY);
        Assertions.assertEquals(6, Marcos.getFP());
        Assertions.assertEquals(4, SPINY.getHP());

        Marcos.setSeed(4321);
        Marcos.attackHammer(BOO);
        Assertions.assertEquals(4, Marcos.getFP());
        Assertions.assertEquals(10, BOO.getHP());

        Marcos.setSeed(5678);
        Marcos.attackHammer(SPINY);
        Assertions.assertEquals(2, Marcos.getFP());
        Assertions.assertEquals(4, SPINY.getHP());
        Marcos.setFP(-2);

        Marcos.setSeed(6559);
        Marcos.attackHammer(SPINY);
        Assertions.assertEquals(2, Marcos.getFP());
        Assertions.assertEquals(4, SPINY.getHP());
        Marcos.setFP(-4);

        Marcos.setSeed(6559);
        Marcos.attackHammer(BOO);
        Assertions.assertEquals(4, Marcos.getFP());
        Assertions.assertEquals(10, BOO.getHP());

        Marcos.setSeed(4321);
        Marcos.attackHammer(GOOMBA);
        Assertions.assertTrue(Marcos.canAttack());
        Assertions.assertEquals(2, Marcos.getFP());
        Assertions.assertEquals(8, GOOMBA.getHP());

        Marcos.setSeed(5678);
        Marcos.setFP(-2);
        Marcos.attackHammer(GOOMBA);
        Assertions.assertTrue(Marcos.canAttack());
        Assertions.assertEquals(2, Marcos.getFP());
        Assertions.assertEquals(8, GOOMBA.getHP());

        Marcos.setSeed(5678);
        Marcos.setHP(Marcos.getHP());
        Assertions.assertTrue(Marcos.isDefeated());
        Marcos.attackHammer(GOOMBA);
        Marcos.attackHammer(BOO);
        Marcos.attackHammer(SPINY);
        Assertions.assertEquals(2, Marcos.getFP());
        Assertions.assertEquals(8, GOOMBA.getHP());

        Assertions.assertEquals(4, SPINY.getHP());
    }

    @Test
    public void testHammerAttackByLuis() {
        Luis.setSeed(4321);
        Luis.attackHammer(SPINY);
        Assertions.assertEquals(8, Luis.getFP());
        Assertions.assertEquals(4, SPINY.getHP());

        Luis.setSeed(4321);
        Luis.attackHammer(GOOMBA);
        Assertions.assertEquals(6, Luis.getFP());
        Assertions.assertEquals(8, GOOMBA.getHP());

        Luis.setSeed(5678);
        Luis.attackHammer(SPINY);
        Assertions.assertEquals(4, Luis.getFP());
        Assertions.assertEquals(4, SPINY.getHP());

        Luis.setSeed(5678);
        Luis.attackHammer(GOOMBA);
        Assertions.assertEquals(2, Luis.getFP());
        Assertions.assertEquals(8, GOOMBA.getHP());

        Luis.setSeed(6559);
        Luis.setHP(Luis.getHP());
        Assertions.assertTrue(Luis.isDefeated());
        Luis.attackHammer(GOOMBA);
        Luis.attackHammer(SPINY);
        Assertions.assertEquals(2, Luis.getFP());
        Assertions.assertEquals(8, GOOMBA.getHP());
        Assertions.assertEquals(4, SPINY.getHP());

    }

    @Test
    public void enemyDefeatedAlready(){
        Marcos.setSeed(1234);
        Luis.setSeed(1234);
        SPINY.setHP(SPINY.getHP());
        BOO.setHP(BOO.getHP());
        GOOMBA.setHP(GOOMBA.getHP());
        Marcos.attackHammer(SPINY);
        Marcos.attackJump(SPINY);
        Marcos.attackJump(BOO);
        Marcos.attackHammer(BOO);
        Marcos.attackJump(GOOMBA);
        Marcos.attackHammer(GOOMBA);
        Luis.attackJump(SPINY);
        Luis.attackHammer(SPINY);
        Luis.attackHammer(GOOMBA);
        Luis.attackJump(GOOMBA);
        Assertions.assertEquals(10, Luis.getFP());
        Assertions.assertEquals(0, GOOMBA.getHP());

    }

    @Test
    public void testChest() {
        Inventario sharedOne = new Inventario();
        Luis.setChest(sharedOne);
        Marcos.setChest(sharedOne);

        Luis.addHoneySyrupToChest(1);
        Assertions.assertEquals(1, Luis.getAmountOfHoneySyrup());
        Marcos.addHoneySyrupToChest(5);
        Assertions.assertEquals(6, Marcos.getAmountOfHoneySyrup());

        Luis.getChest().removeHoneySyrup(1);
        Assertions.assertEquals(5, Luis.getAmountOfHoneySyrup());
        Marcos.getChest().removeHoneySyrup(1);
        Assertions.assertEquals(4, Marcos.getAmountOfHoneySyrup());

        Luis.addRedMushroomToChest(1);
        Assertions.assertEquals(1, Luis.getAmountOfRedMushroom());
        Marcos.addRedMushroomToChest(10);
        Assertions.assertEquals(11, Marcos.getAmountOfRedMushroom());

        Marcos.getChest().removeRedMushroom(1);
        Assertions.assertEquals(10, Marcos.getAmountOfRedMushroom());

        Marcos.levelUp();
        Assertions.assertEquals(11, Luis.getAmountOfRedMushroom());
        Assertions.assertEquals(11, Marcos.getAmountOfRedMushroom());
        Assertions.assertEquals(5, Marcos.getAmountOfHoneySyrup());
        Assertions.assertEquals(5, Luis.getAmountOfHoneySyrup());
    }

    @Test
    public void testLevelUp(){
        Marcos.levelUp();
        Assertions.assertEquals(3,Marcos.getLVL());
        Assertions.assertEquals(2,Marcos.getATK());
        Assertions.assertEquals(1,Marcos.getCurrentDEF());
        Assertions.assertEquals(12,Marcos.getmaxFP());
        Assertions.assertEquals(12,Marcos.getFP());
        Assertions.assertEquals(12,Marcos.getMaxHealthPoints());
        Assertions.assertEquals(12,Marcos.getHP());
        Assertions.assertEquals(1, Marcos.getWin());

        Luis.levelUp();

        Assertions.assertEquals(3,Luis.getLVL());
        Assertions.assertEquals(2,Luis.getATK());
        Assertions.assertEquals(2,Luis.getCurrentDEF());
        Assertions.assertEquals(12,Luis.getmaxFP());
        Assertions.assertEquals(12,Luis.getFP());
        Assertions.assertEquals(12,Luis.getMaxHealthPoints());
        Assertions.assertEquals(12,Luis.getHP());
        Assertions.assertEquals(1, Luis.getWin());
    }

    @Test
    public void testBattle(){
        Marcos.levelUp();
        Marcos.levelUp();
        Marcos.levelUp();
        Marcos.levelUp();
        Marcos.levelUp();
        Assertions.assertTrue(Marcos.winBattle());
    }

}
