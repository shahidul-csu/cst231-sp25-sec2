package wk12_mon;

public class ArrayFun {
    public static void main(String[] args){
        int[] a = new int[7];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
        }
        int[] b = {4, 1, 6, 8};
        print(a);
        print(b);
        System.out.println("Sum (a): " + sum(a));
        System.out.println("Sum (b): " + sum(b));

        String[] pets = {"Dog", "Cat", "Bird", "Snake"};
        System.out.println(pets.length);
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i] + "," + (pets[i].length()));
        }
    }

    public static int sum(int[] data){
        int res = 0;
        for(int i = 0; i < data.length; i++){
            res = res + data[i];
        }
        return res;
    }

    public static void print(int[] data){
        System.out.println("Array Length: " + data.length);
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
