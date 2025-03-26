package wk10_wed;

import java.util.Scanner;

public class MethodDetails {
    public static void main(String[] args){
//        foo();
        //7 is argument
        bar(7);
        int res = add(add(6, 1), add(2,3));
        System.out.println("Res: " + res);

        int a = 7;
        System.out.println("a (original):" + a);
        update(a);
        System.out.println("a (original):" + a);
        System.out.println(power(2,10));//Should print 1024
        System.out.println(power(5,2));//Should print 25
        int b = 3;
        System.out.println(power(b, b));
        int c = power(b, b);
        System.out.println(add(c, power(2,3)));
    }

    //base^exponent
    public static int power(int base, int exponent){
        int result = 1;
        for(int i = 0; i < exponent; i++){
            result = result * base;
        }
        return result;
    }

    // Scope of the parameter a is within the update method
    // Pass by value
    public static void update(int a){
        a = 12;
        System.out.println("a (updated): " + a);
    }

    public static int add(int a, int b){
        return a + b;
    }

    // int a is a parameter
    public static void bar(int a){
        int b = a + a;
        System.out.println(b);
    }

    // public static return_type method_name(parameter list){body}
    public static void foo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        int b = a + a;
        System.out.println(b);
    }
}
