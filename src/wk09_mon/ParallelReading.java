package wk09_mon;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ParallelReading {
    public static void main(String[] args) throws IOException {
        FileReader groupFR = new FileReader("src/wk09_mon/group.txt");
        FileReader memberFR = new FileReader("src/wk09_mon/members.txt");

        Scanner groupScan = new Scanner(groupFR);
        Scanner memberScan = new Scanner(memberFR);

        while (groupScan.hasNext()){
            int group = groupScan.nextInt();
            for(int i = 0; i < group; i++){
                String leader = groupScan.next();
                int memberCount = groupScan.nextInt();
                System.out.print("Leader " + leader + "'s group has members: ");
                for (int k = 0; k < memberCount; k++){
                    String member = memberScan.next();
                    System.out.print(member + " ");
                }
                System.out.println();
            }
        }

        groupFR.close();
        memberFR.close();
    }
}
