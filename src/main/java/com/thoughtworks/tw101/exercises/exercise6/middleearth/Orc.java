package com.thoughtworks.tw101.exercises.exercise6.middleearth;

/**
 * Created by irishblondie7 on 8/26/18.
 */
public class Orc implements Monster{
    private int damage;
    private String name;

    public Orc(){
        this.damage =  20;
        this.name = "Orc";
    }
    @Override
    public void takeDamage(int dam){
        damage += dam;
    }
    @Override
    public void reportStatus(){
        System.out.println("My name is " + name);
        System.out.println("I have " + damage + " points of damage");
    }

}
