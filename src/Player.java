import java.util.Scanner;

/**
 * Created by DrScott on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;

    void chooseName() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Good luck, " + name );
    }
    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up sword");
        System.out.println("[2] Pick up mallet");
        Scanner scanner = new Scanner(System.in) ;
        weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if(weaponNum == 1) {
            System.out.println("that's a fine sword");
        } else if(weaponNum == 2){
            System.out.println("That's a heavy mallet!");
        } else {
            throw new Exception("Invalid weapon, dummy");
        }
    }
    void chooseArea() throws Exception {System.out.println("[1] Enter the forest?");
        System.out.println("[2] enter the tunnel?");
        Scanner scanner = new Scanner(System.in);
        area = scanner.nextLine();
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
