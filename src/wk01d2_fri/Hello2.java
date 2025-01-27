package wk01d2_fri;

import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args){
        int a = 8;
        int b = 3;
        int c = a + b;
        System.out.println(c);
        System.out.println(a + " + " + b + " = " + c);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(n * 2);
        a = n % 4;
        b = n / 4;
        System.out.println(a);
        System.out.println(b);
        double d = Math.sqrt(n);
        System.out.println(d);
        boolean b1 = (n == 13);
        boolean b2 = (n == 15);
        System.out.println(b1);
        System.out.println(b2);
    }
}
