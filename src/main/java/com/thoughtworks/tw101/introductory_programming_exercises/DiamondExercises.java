package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int spaceCounter = n - 1;
        int starCounter = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < spaceCounter; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < starCounter; j++){
                System.out.print("*");
            }
            System.out.println();
            spaceCounter--;
            starCounter += 2;
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawReverseTriangle(n);

    }

    private static void drawReverseTriangle(int n){
        int spaceCounter = 1;
        int starCounter = 1 + (n-2)*2;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < spaceCounter; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < starCounter; j++){
                System.out.print("*");
            }
            System.out.println();
            spaceCounter++;
            starCounter -= 2;
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawAnIsoscelesTriangle(n);
        System.out.println("Juliet");
        for (int i = 0; i < (1 + (n-1)*2); i++){
            //copy last line of triangle because it's not included in reverseTriangle method for diamond
            System.out.print("*");
        }
        System.out.println();
        drawReverseTriangle(n);
    }
}
