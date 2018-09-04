package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by irishblondie7 on 8/28/18.
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    private int number;
    Scanner scan = new Scanner(System.in);
    private boolean guessedCorrect = false;
    private ArrayList<Integer> guesses = new ArrayList<>();

    public Game(){
        Random randomNum = new Random();
        number = randomNum.nextInt(100) + 1;
        System.out.println(number);
    }

    public void play(){
        while (!guessedCorrect) {
            guess();
        }
        System.out.println("Congrats! You won! Here's your guess history:");
        for (int g: guesses){
            System.out.print(g + " ");
        }
    }

    public void guess(){
        System.out.println("Guess what number I'm thinking of! Hint: It's between 1 and 100 (inclusive):");
        try {
            int guess = Integer.parseInt(scan.next());
            guesses.add(guess);

            if (guess == number) guessedCorrect = true;

            if (guess < number) System.out.println("Try something higher!");

            if (guess > number) System.out.println("Guess something lower.");
        }
        catch (NumberFormatException e){
            System.out.println("Please enter a valid number. No words just numerals.");
        }
    }

}

