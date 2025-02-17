package wk05_mon;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 100: "); //sout
//        int num = in.nextInt();

//        while(num < 1 || num > 100){
//        while(!(num >= 1 && num <= 100)){
        //De Mogran's Law
//        while(!(num >= 1) || !(num <= 100)){
//            System.out.print("Enter a number between 1 and 100: ");
//            num = in.nextInt();
//        }
//        System.out.println("Your number is: " + num);

        String input = "";
        while(!input.equals("stop")){
            System.out.print("Enter a word: ");
            input = in.next();

            if(input.equals("c")){
                System.out.println("About to continue");
                continue;
            } else if(input.equals("b")){
                System.out.println("About to break");
                break;
            } else if(input.equals("r")){
                System.out.println("About to return");
                return;
            }
            System.out.println("End of conditional");
        }
        System.out.println("End of loop");
    }
}
