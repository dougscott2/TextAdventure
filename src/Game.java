import java.util.Scanner;

/**
 * Created by DrScott on 10/8/15.
 */
public class Game {
static Player player;
    public static void main(String[] args) throws Exception {
        System.out.println("welcome to the jungle");
        player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
        player.findItem("shield");

        Enemy ogre = new Enemy("Ogre", 50, 5);
        player.battle(ogre);
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
            } else if (s.equals("/inv")){
                if (player.items.size()==0){
                    System.out.println("You have no items. You're a bum. Go find some stuff");
                }
                for (Object item : player.items){
                    System.out.println(item);
                }
            }
            return nextLine();
        } else {
            return s;
        }

    }
}
