package wk15_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Array_Review {
    public static void main(String[] args) throws IOException {
        int[] num = readNumber();
        print(num);
        System.out.println();
        int[][] num2D = read2DArray();
        print2D(num2D);

        System.out.println("Max in 1D Array: " + max(num));

        int[] maxArray = rowWiseMaxIn2DArray(num2D);
        System.out.println("Row-wise max in the 2D Array:");
        print(maxArray);
    }

    public static int[] rowWiseMaxIn2DArray(int[][] data){
        int[] maxArray = new int[data.length];
        for(int r = 0; r < data.length; r++){
            maxArray[r] = max(data[r]);
        }
        return maxArray;
    }

    public static int max(int[] data){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < data.length; i++){
            if(data[i] > maxValue){
                maxValue = data[i];
            }
        }
        return maxValue;
    }

    public static int[][] read2DArray() throws IOException {
        FileReader fr = new FileReader("src/wk15_wed/number2.txt");
        Scanner fin = new Scanner(fr);
        int row = fin.nextInt();
        int col = fin.nextInt();
        int[][] array = new int[row][col];
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++) {
                array[r][c] = fin.nextInt();
            }
        }

        fr.close();
        return array;
    }

    public static void print2D(int[][] array){
        for(int r = 0; r < array.length; r++){
            for(int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] readNumber() throws IOException {
        FileReader fr = new FileReader("src/wk15_wed/number.txt");
        Scanner fin = new Scanner(fr);
        int count = fin.nextInt();
        int[] array = new int[count];
        for(int i = 0; i < count; i++){
            if(fin.hasNext()) {
                array[i] = fin.nextInt();
            } else{
                break;
            }
        }

        fr.close();
        return array;
    }

    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
