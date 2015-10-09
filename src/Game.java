import java.util.Scanner;

/**
 * Created by DrScott on 10/8/15.
 */
public class Game {

    public static void run() throws Exception {
        System.out.println("welcome to the jungle");

        while (true) {
            Player player = new Player();
            player.chooseName();
            player.chooseWeapon();
            player.chooseArea();
        }
    }
    static String nextLine() {  //creating a static method to run to save the game
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.startsWith("/")){
            if(s.equals("/help")){
                System.out.println("These are the available commands");
                System.out.println("/help    => List available commands");
            } else if (s.equals("/exit")){
                System.exit(0);
            }
            return nextLine();
        } else {
            return s;
        }

    }
}
