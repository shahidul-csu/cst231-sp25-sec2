package wk06_mon;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        int max = 10;
//        System.out.println(max);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        max = s.nextInt();
//        if(max != 0) {
//            System.out.println(5 / (double) max);
//        }
        int count = 0;
        while(count < max) {
            System.out.print((count + 1) + " ");
            count++;
        }
//        System.out.println();
        System.out.println("Done");

        for(int i = 0; i < max; i++){
            System.out.print((i + 1) + " ");
        }
        System.out.println("Done");

        int a = 2;
        for(int i = 0; i < max; i++){
            a += i; // a = a + i;
            System.out.print(a + " ");
        }
    }
}
