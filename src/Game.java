import java.util.Scanner;

/**
 * Created by DrScott on 10/8/15.
 */
public class Game {

    public static void run() throws Exception {
        System.out.println("welcome to the jungle");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
        System.out.println("Good luck, " + name );

        System.out.println("[1] Pick up sword");
        System.out.println("[2] Pick up mallet");
        String weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if(weaponNum == 1) {
            System.out.println("that's a fine sword");
        } else if(weaponNum == 2){
            System.out.println("That's a heavy mallet!");
        } else {
            throw new Exception("Invalid weapon, dummy");
        }

        System.out.println("[1] Enter the forest?");
        System.out.println("[2] enter the tunnel?");
        String area = scanner.nextLine();
        int areaNum = Integer.valueOf(area);

        if(areaNum == 1){
            System.out.println("You enter the forest");
        } else if(areaNum == 2){
            System.out.println("you go into the tunnel");
        } else {
            throw new Exception("you can't go there, dummy");
        }



    }
}
