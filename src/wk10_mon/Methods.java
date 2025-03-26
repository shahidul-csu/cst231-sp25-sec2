package wk10_mon;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Random r = new Random();
        System.out.println(r.nextInt());

        printHello();
        printMessage("Hello");
        printMessage("World");
        String word = "hola";
        printNTimes(word, 3);
        System.out.println(giveMeFive());
        int res = add(5, 7);
        System.out.println(res);
    }

    //z = f(x, y) = x + y
    public static int add(int x, int y){
        int z = x + y;
        return z;
    }

    public static int giveMeFive(){
        return 5;
    }

    public static void printNTimes(String message, int n){
        if(n > 10){
            System.out.println("Too many print");
            return;
        }
        for(int i = 0; i < n; i++){
            System.out.println(message);
        }
    }

    public static void printMessage(String message){
        System.out.println(message);
    }

    //Name should be camel case
    public static void printHello(){
        System.out.println("Hello");
    }
}
