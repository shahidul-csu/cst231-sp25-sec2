package wk09_mon;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParallelFileWriting {
    public static void main(String[] args) throws IOException {
        String groupFileName = "src/wk09_mon/group.txt";
        String memberFileName = "src/wk09_mon/members.txt";

        FileWriter groupFW = new FileWriter(groupFileName);
        FileWriter memberFW = new FileWriter(memberFileName);

        PrintWriter groupPW= new PrintWriter(groupFW);
        PrintWriter memberPW = new PrintWriter(memberFW);

        Scanner cin = new Scanner(System.in);
        System.out.print("How many groups: ");
        int group = cin.nextInt();
        groupPW.println(group);
        for(int i = 0; i < group; i++){
            System.out.print("Enter group leader name: ");
            groupPW.println(cin.next());
            System.out.print("How many members in the group: ");
            int memberCount = cin.nextInt();
            groupPW.println(memberCount);
            for(int k = 0; k < memberCount; k++){
                System.out.print("Enter Member Name: ");
                memberPW.println(cin.next());
            }
        }

        groupFW.close();
        memberFW.close();
    }
}
