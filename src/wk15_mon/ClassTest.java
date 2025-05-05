package wk15_mon;

import java.util.Random;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args){
//        int a = 5;
//        Random r = new Random();
//        Scanner in = new Scanner(System.in);
//        Student s = new Student();
        Student s1 = new Student("jd1234", "John Doe");
        System.out.println(s1);
        System.out.println(s1.getStudentLevel());
        s1.addCredit(18);
        s1.addCredit(15);
        System.out.println(s1);
        System.out.println(s1.getStudentLevel());

        Student s2 = new Student("jk3245", "Jane Doe", 10);
        s2.addCredit(15);
        s2.addCredit(12);
        System.out.println(s2);
        System.out.println(s2.getStudentLevel());

        System.out.println(s1.getName());
        System.out.println(s1);
        s1.setName("Bob Doe");
        System.out.println(s1);
    }
}
