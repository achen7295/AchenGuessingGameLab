package com.company;
import java.util.Scanner;

public class AchenLib {

    public static void linearSearch(){

        int num = (int)(Math.random() * 100);
        System.out.println("Guess a number from 1 - 100");
        Scanner guess = new Scanner(System.in);
        String guessString  = guess.next();
        int guessed  = Integer.parseInt(guessString);
        while ((guessed != num)){
            System.out.print("This is not the correct number");
        }
       System.out.println("This is the correct number!");
    }
}
