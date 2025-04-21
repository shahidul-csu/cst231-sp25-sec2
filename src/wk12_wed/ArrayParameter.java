package wk12_wed;

public class ArrayParameter {
    public static void main(String[] args){
//        int x = 7;
//        System.out.println("Before method call: " + x);
//        updateX(x);
//        System.out.println("After method call: " + x);
        int[] num = {2, 3, 4, 7, 11, 13, 17};
        printArray(num);
        updateArray(num);
        printArray(num);
    }

    public static void updateArray(int[] data){
//        data = new int[5];
        data[2] = 5;
        printArray(data);
    }

    public static void printArray(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void updateX(int x){
        System.out.println("Beginning of method: " + x);
        x = 12;
        System.out.println("End of the method: " + x);
    }
}
