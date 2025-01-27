/*
Integer Range: -2^31 tp 2^31 - 1
* */
package wk02_mon;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand1 = new Random();
        Scanner in = new Scanner(System.in);

        // % 10 will give 0, 1, 2, ..., 9
        // + 20 will make 20, 21, 22, ..., 29
        int secret = Math.abs(rand1.nextInt()) % 10 + 20;
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Guess a number: ");
        int guess = in.nextInt();
        System.out.println(name + ", your guess: " + guess);
        System.out.println("Secret: " + secret);
        System.out.println("Guess greater? " + (guess > secret));
        System.out.println("Guess smaller? " + (guess < secret));
        System.out.println("Guess equal? " + (guess == secret));

        System.out.println(23/4);
        System.out.println(23.0/4);
        System.out.println(23%4);

//        int a = 5;
//        double d = 6.7;
//        System.out.println(a + ", " + d);
//        System.out.println(rand1.nextInt());
//        System.out.println(rand1.nextInt());
    }
}
