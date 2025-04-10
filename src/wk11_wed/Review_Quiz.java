package wk11_wed;

public class Review_Quiz {
    public static void main(String[] args){
        int num1 = 5, num2 = 10;
        addTwoNumbers(num1, num2);
        compareNumbers(5, 10);
//        System.out.println("Num1 + Num2 is " + addTwoNumbers(num1, num2));
    }

    public static void compareNumbers(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } else{
            System.out.println(num2 + " is greater than " + num1);
        }
    }

    public static void addTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Num1 + Num2 is " + sum);
    }

//    public static int addTwoNumbers(int num1, int num2){
//        return num1 + num2;
//    }
}
