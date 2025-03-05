package wk07_wed;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = s.nextInt();
        boolean isPrime = true;
        //Determine if the number is prime or not
        for(int i = 2; i < num; i++){
            //Check if num is divisible by i
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(num > 1 && isPrime){
            System.out.println(num + " is prime");
        } else{
            System.out.println(num + " is not prime");
        }

//        int m = 3;
//        for(int a = 0; a < 8; a++){
//            if(a % m == 0){
//                System.out.println("Divisible by 3");
//            } else{
//                System.out.println("Not divisible by 3");
//            }
//        }
    }
}
