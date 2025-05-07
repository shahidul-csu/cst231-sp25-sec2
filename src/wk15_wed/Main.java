package wk15_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] names = new String[42];
        int count = readData(names);
        print(names, count);
    }

    public static int readData(String[] data) throws IOException {
        String fileName = "src/wk15_wed/data";
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);
        int count = 0;

        //Is there any string to read
        while(fin.hasNext()){
            if(count == data.length){
                System.out.println("Warning!!! More data in the file than expected!");
                break;
            }
            data[count] = fin.next();
            count++;
        }

        fr.close();
        return count;
    }

    public static void print(String[] data, int count){
        for(int i = 0; i < count; i++){
            System.out.println(data[i]);
        }
    }
}
