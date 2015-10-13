import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Created by DrScott on 10/9/15.
 */
public class Player extends Character{
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    public Player() {
        health = 100; //health and damage have been declared in Character.java
        damage = 20;

    }
    void chooseName() {
        System.out.println("What is your name?");
        name = Game.nextLine();
        System.out.println(String.format("Good luck, %s", name ));
    }
    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up sword");
        System.out.println("[2] Pick up mallet");
        weapon = Game.nextLine();
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
        area = Game.nextLine();
        int areaNum = Integer.valueOf(area);

        if(areaNum == 1){
            System.out.println("You enter the forest");
        } else if(areaNum == 2){
            System.out.println("you go into the tunnel");
        } else {
            throw new Exception("you can't go there, dummy");
        }
    }
    void findItem(String item){
        System.out.println("Found item! Pick it up? y/n?");
        String s = Game.nextLine();
        if (s.equals("y")){
            System.out.println(String.format("You found a %s", item));
            items.add(item);

        }
    }
}
