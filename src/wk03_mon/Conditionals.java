package wk03_mon;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num > 0){
            System.out.println(num + " is positive");
        } else if(num < 0){
            System.out.println(num + " is negative");
        } else{
            System.out.println(num + " is zero");
        }

        if(num > 100){
            System.out.println("Large positive number");
        }

        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter password: ");
        String password = in.next();
        String secret = "hello123";

        if(password.equals(secret)){
            System.out.println("Welcome " + name);
        } else{
            System.out.println("Password is incorrect");
        }

//        if(true){
            //do something if the condition is true
//            System.out.println("Always true");
//        }

//        if(false){
//            System.out.println("Never be here!");
//        }
    }
}
