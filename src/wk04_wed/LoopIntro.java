package wk04_wed;

import java.util.Scanner;

public class LoopIntro {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (num >= 0){
            sum += num;
            System.out.println("Sum: " + sum);
            System.out.print("Enter a number: ");
            num = in.nextInt();
        }
        System.out.println("Final Sum: " + sum);

        int i = 10;
        while(i >= 0){
            System.out.print(i + " ");
//            i -= 2; // Same as i = i - 2;
            i--; // Same as i = i - 1;
        }
        System.out.println("\nDone with the loop");

    }
}
