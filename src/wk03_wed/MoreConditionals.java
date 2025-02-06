package wk03_wed;

import java.util.Scanner;

public class MoreConditionals {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
//        int res = num * 3;
//        System.out.println(res);
//        double value = 5.2 + num / 3;
//        System.out.println(value);
//        String test = "Hello " + (num + 2.0);
//        System.out.println(test);

        // Check if the number is a two-digit number or not
        if(num >= 10){
            if(num < 100) {
                System.out.println(num + " is a two digit positive number");
            } else{
                System.out.println(num + " is more than two digit positive number");
            }
        } else if (num >= 0){
            System.out.println(num + " is an one digit positive number");
        } else{
            System.out.println(num + " is a negative number");
        }

        if(num > 9 && num < 100 && num % 2 == 0){
            System.out.println(num + " is a two digit even number");
        }

        if(num <= -10 || num >= 10){
            System.out.println(num + " is more than 1 digit");
        }
    }
}
