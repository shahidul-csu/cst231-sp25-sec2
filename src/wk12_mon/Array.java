package wk12_mon;

public class Array {
    public static void main(String[] args){
        int n = 5;
        System.out.println(n);
        //Declaring an array and allocating memory for a list of items
        int[] a = new int[5];
        System.out.println(a);

        //Access a single item by proving an index
        a[0] = 7;
        System.out.println(a[0]);
        a[1] = a[0] + n;
        a[2] = 7 + n;
        a[0] = 11;
        System.out.println(a[0]);
        //Invalid access attempt
        //a[a.length] = 4;

        System.out.println(a.length);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
