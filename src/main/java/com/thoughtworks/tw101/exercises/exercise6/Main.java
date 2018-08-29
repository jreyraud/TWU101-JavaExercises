package com.thoughtworks.tw101.exercises.exercise6;
import com.thoughtworks.tw101.exercises.exercise6.middleearth.*;
import java.util.ArrayList;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage


public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> myMonsters = new ArrayList<Monster>();
        Troll troll1 = new Troll();
        myMonsters.add(troll1);

        Orc orc1 = new Orc();
        myMonsters.add(orc1);

        Troll troll2 = new Troll();
        myMonsters.add(troll2);

        Orc orc2 = new Orc();
        myMonsters.add(orc2);

        for (int i = 0; i < myMonsters.size(); i++){
            myMonsters.get(i).takeDamage(10);
        }
        for (int i = 0; i < myMonsters.size(); i++) {
            myMonsters.get(i).reportStatus();
        }

    }
}
