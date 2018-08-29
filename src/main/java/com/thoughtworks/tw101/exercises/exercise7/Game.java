package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by irishblondie7 on 8/27/18.
 */
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;
    Scanner scan = new Scanner(System.in);
    private boolean guessedCorrect = false;

    public Game(){
        Random randomNum = new Random();
        number = randomNum.nextInt(100) + 1;
        System.out.println(number);
    }

    public void play(){
        while (!guessedCorrect) {
            guess();
        }
        System.out.println("Congrats! You won!");
    }

    public void guess(){
        System.out.println("Guess what number I'm thinking of! Hint: It's between 1 and 100 (inclusive):");
        int guess = Integer.parseInt(scan.next());

        if (guess == number){
            guessedCorrect = true;

        }
        if (guess < number){
            System.out.println("Try something higher!");
        }
        if (guess > number){
            System.out.println("Guess something lower.");
        }
    }

}
