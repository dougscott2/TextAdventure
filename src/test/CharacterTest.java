import junit.framework.TestCase;

/**
 * Created by DrScott on 10/19/15.
 */
public class CharacterTest extends TestCase {

    public void testBattle() throws Exception {
        Weapon playerWeapon = new Weapon();
        playerWeapon.damage= 50;

        Weapon enemyWeapon = new Weapon();
        enemyWeapon.damage = 10;

        Player player = new Player( );
        player.name = "Test Player";
        player.weapon = playerWeapon;
        Enemy enemy = new Enemy("Test Enemy", 50, 10, enemyWeapon);

        player.battle(enemy);

        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);
    }
}