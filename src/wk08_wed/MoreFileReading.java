package wk08_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MoreFileReading {
    public static void main(String[] args) throws IOException {
        //Absolute Path
        //String filename = "/Users/sislam/IdeaProjects/cst231-sp25-sec2/src/wk08_wed/a.txt";
        //Relative Path
        String filename = "src/wk08_wed/a.txt";
//        String filename = "test.txt";
        FileReader fr = new FileReader(filename);
        Scanner fin = new Scanner(fr);
        System.out.println(fin.next());
        fr.close();
    }
}
