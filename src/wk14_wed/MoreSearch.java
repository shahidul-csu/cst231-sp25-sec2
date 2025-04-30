package wk14_wed;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoreSearch {
    public static void main(String[] args){
        int[] data = new int[1000000];
        final int SIZE = 2000000;
        Random r = new Random();
        for(int i = 0; i < data.length; i++){
            data[i] = r.nextInt() % SIZE;
        }
        Arrays.sort(data);
        print(data, 0, 10);
        print(data, 500000, 10);

        Scanner in = new Scanner(System.in);
        int n;

        do{
            System.out.print("Enter a number to search: ");
            n = in.nextInt();
            System.out.println("The location of " + n + " in the list: " + bSearch(data, n));
        }while(n < SIZE);
    }

    public static int bSearch(int[] data, int value){
        int low = 0;
        int high = data.length - 1;
        int count = 0;
        while(low <= high){
            int mid = (low+high)/2;
            //Have we found the number?
            if(data[mid] == value){
                System.out.println("Steps: " + count);
                return mid;
            } else if(value < data[mid]){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
            count++;
        }
        System.out.println("Steps: " + count);
        return -1;
    }

    public static void print(int[] data, int start, int count){
        int end = start + count;
        for (int i = start; i < end; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
