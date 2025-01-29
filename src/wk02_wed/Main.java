package wk02_wed;

public class Main {
    public static void main(String[] args){
        int num = 8;
        int num2 = 2;
        num2 = (num2 + 1) * 3;
        System.out.println("Result: " + (num + num2));
        System.out.println("Numbers: " + num  + "," + num2);
        double pi = 3.14159;
        boolean status1 = true;
        boolean status2 = false;
        String name = "John Doe";
        name = name + ": " + pi;
        System.out.println(name);
        int div = 3;
        System.out.println(num + " = " + div + "*" + (num/div) + " + " + (num%div));
        System.out.println(num / div);
//        double res = 1.0 * num / div;
        double res = (double) num / div;
        System.out.println(res);
        System.out.println(num);
    }
}
