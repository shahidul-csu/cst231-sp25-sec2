package wk07_mon;

public class NestedLoops {
    public static void main(String[] args){
        int row = 4;
        int col = 5;
        /*
        $$$$$
        $$$$$
        $$$$$
        $$$$$
        */
        for(int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
        /*
        +$$$$
        +$$$$
        +$$$$
        +$$$$
         */
        for(int r = 0; r < row; r++) {
            System.out.print("+");
            for (int c = 1; c < col; c++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
        /*
        +$$$
        $+$$
        $$+$
        $$$+
         */
        col = 4;
        for(int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if(r == c){ //r - c == 0
                    System.out.print("+");
                } else{
                    System.out.print("$");
                }
            }
            System.out.println();
        }
        System.out.println();

        /*
        $$$+ [0, 3]
        $$+$ [1, 2]
        $+$$ [2, 1]
        +$$$ [3, 0]
         */

        for(int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if(r + c == col - 1){
                    System.out.print("+");
                } else{
                    System.out.print("$");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
