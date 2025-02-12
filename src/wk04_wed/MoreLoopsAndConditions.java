package wk04_wed;

import java.util.Scanner;

public class MoreLoopsAndConditions {
    public static void main(String[] args){
        boolean b1 = true, b2 = false;
        int num = 5;
        b2 = !(num == 5);
        b2 = (b1 != false);
        System.out.println("b2: " +  b2);
        if(b1 && b2){
            System.out.println("Both are true");
        } else if(b1 || b2){
            System.out.println("One of them are true");
        } else {
            System.out.println("None of them are true");
        }
        System.out.println("End of conditionals");
        System.out.println();

        Scanner in = new Scanner(System.in);
        String name = "";
        String password = "";

        while(!(name.equalsIgnoreCase("john") &&
                password.equals("hello123"))){
            System.out.print("Enter username: ");
            name = in.next();
            System.out.print("Enter password: ");
            password = in.next();
            if(!name.equalsIgnoreCase("john") ||
                    !password.equals("hello123")){
                System.out.println("Username or password incorrect! Try again.");
            }
        }

        System.out.println("Welcome " + name);
    }
}
