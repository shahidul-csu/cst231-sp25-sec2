package wk05_wed;

import java.util.*;
//import java.util.Random;
//import java.util.Scanner;

public class FlowchartGuessGame {
    public static void main(String[] args){
        Random rand = new Random();
        int range = 10;
        int secret = Math.abs(rand.nextInt()) % range + 1;
        Scanner s = new Scanner(System.in);
        int guess;
        do{
            System.out.print("Enter your guess: ");
            guess = s.nextInt();
            if(guess > secret){
                System.out.println("Too High");
            } else if(guess < secret){
                System.out.println("Too Low");
            }
        }while(guess != secret);
        System.out.println("You guessed it correctly");
        System.out.println("The secret is: " + secret);
    }
}
