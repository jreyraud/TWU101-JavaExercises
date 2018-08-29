package com.thoughtworks.tw101.exercises.exercise6.middleearth;

/**
 * Created by irishblondie7 on 8/26/18.
 */
public class Troll implements Monster{
    private int damage;
    private String name;

    public Troll(){
        this.damage =  40;
        this.name = "Troll";
    }

    public void takeDamage(int dam){
        damage += (.5 * dam);
    }

    public void reportStatus(){
        System.out.println("My name is " + name);
        System.out.println("I have " + damage + " points of damage");
    }


}
