package wk11_wed;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Review_Exam2Practice {
    public static void main(String[] args) throws IOException{
        copyFile("src/wk11_wed/in.txt", "src/wk11_wed/out.txt");
    }

    public static void copyFile(String fileIn, String fileOut) throws IOException {
        FileReader fr = new FileReader(fileIn);
        Scanner fin = new Scanner(fr);
        FileWriter fw = new FileWriter(fileOut);
        PrintWriter pw = new PrintWriter(fw);
        int count = 1;
        while(fin.hasNext()){
            String word = fin.next();
            if(count % 2 == 1) {
                pw.println(word);
            }
            count++;
        }
        fr.close();
        fw.close();
    }
}
