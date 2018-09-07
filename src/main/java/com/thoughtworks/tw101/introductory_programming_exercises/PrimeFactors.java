package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.println(primeFactors);
    }

    private static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        if(n%2==0) {
            factors.add(2);
        }
        for(int i = 3; i<= Math.sqrt(n); i=i+2){
            if((n%i == 0) && isPrime(i)){
                factors.add(i);
            }
        }
        return factors;
    }

    private static boolean isPrime(int n){
        if (n==1) return false;
        if (n==2) return true;
        for(int i = 2; i < n; i++){
            if (n%i == 0) return false;
        }
        return true;
    }
}
