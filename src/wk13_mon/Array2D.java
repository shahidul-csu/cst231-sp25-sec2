package wk13_mon;

import java.util.Random;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args){
//        Random r = new Random();
//        System.out.println(r);
//        double[] d = new double[10];
//        System.out.println(d);
        int x = 5;
        System.out.println(x);
        int[] y = new int[7];
        System.out.println(y);
        y[2] = 5;
        print1DArray(y);
        int[][] a = new int[3][4];
        System.out.println(a);

        System.out.println(y.length);
        System.out.println(a.length);
        System.out.println(a[0].length);

        print2DArray(a);
        fill(a);
        print2DArray(a);

//        dummyPrint(a);
    }

    public static void fill(int[][] data){
        for(int r = 0; r < data.length; r++){
            for(int c = 0; c < data[r].length; c++){
                data[r][c] = r * data[0].length + c;
            }
        }
    }

    public static void dummyPrint(int[][] data){
        data = new int[4][5];
        print2DArray(data);
    }

    public static void print2DArray(int[][] data){
//        System.out.println(data);
        for(int row = 0; row < data.length; row++){
//            System.out.print(data[row] + " ");
            for(int col = 0; col < data[row].length; col++){
                if(data[row][col] < 10){
                    System.out.print(" ");
                }
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print1DArray(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
