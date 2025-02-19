package wk05_wed;

import java.util.Scanner;

public class FlowchartAgeTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        } else{
            System.out.println("Minor");
        }

        System.out.println("Done");
    }
}
