//import java.util.Scanner;

/**
 * Created by DrScott on 10/8/15.
 */
public class Game {

    public static void run() throws Exception {
        System.out.println("welcome to the jungle");

        Player player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();

    }
}
