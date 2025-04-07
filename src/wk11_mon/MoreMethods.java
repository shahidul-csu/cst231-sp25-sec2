package wk11_mon;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MoreMethods {
    public static void main(String[] args) throws IOException{
        int res = readFile("src/wk11_mon/a.txt");
        System.out.println("Sum of numbers in file: " + res);
//        Scanner s = new Scanner(System.in);
//        printIfEven(7);
//        printIfEven(s, 3);
//        printIfEven(s);
    }

    //Write a method that takes a file name as an argument
    //and print all the values in the file and return the sum
    public static int readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);
        int sum = 0;
        while(fin.hasNext()){
            if(fin.hasNextInt()) {
                int num = fin.nextInt();
                System.out.println(num);
                sum += num;
            }else {
                String dummy = fin.next();
            }
        }
        fr.close();
        return sum;
    }

    public static void printIfEven(int count){
        for(int i = 0; i < count; i++){
            System.out.println("Is " + i + " even?: " + isEven(i));
        }
    }

    public static void printIfEven(Scanner s, int count){
        int num = 1;
        for(int i = 0; i < count; i++){
            System.out.print("Enter a number: ");
            num = s.nextInt();
            System.out.println("Is " + num + " even?: " + isEven(num));
        }
    }

    public static void printIfEven(Scanner s){
        int num = 1;
        while(num != 0) {
            System.out.print("Enter a number (0 to stop): ");
            num = s.nextInt();
            System.out.println("Is " + num + " even?: " + isEven(num));
        }
    }

    public static boolean isEven(int num){
        return !isOdd(num); // !True -> False
        //        return num % 2 == 0;
    }

    public static boolean isOdd(int num){
        return num % 2 == 1;
//        if(num % 2 == 1){
//            return true;
//        }
//        return false;
    }


}
