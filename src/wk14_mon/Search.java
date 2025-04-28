package wk14_mon;

public class Search {
    public static void main(String[] args){
        int[] data = {6, 3, 12, 9, 6, 6, -7, 0, 23};
        System.out.println(search(data, 50));
        System.out.println(searchLocation(data, 50));
        System.out.println(search(data, 6));
        System.out.println(searchLocation(data, 6));
        System.out.println(searchLocationBackward(data, 6));

        String[] words = {"Dog", "Cat", "Bird", "Fish"};
        System.out.println(search(words, "bird"));
        System.out.println(search(words, "Bird"));
    }

    public static int search(String[] data, String key){
        for (int i = 0; i < data.length; i++){
//            if(key.equalsIgnoreCase(data[i])){
            if(key.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public static int searchLocation(int[] data, int key){
        for (int i = 0; i < data.length; i++){
            if(data[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int searchLocationBackward(int[] data, int key){
        for (int i = data.length - 1; i >= 0; i--){
            if(data[i] == key){
                return i;
            }
        }
        return -1;
    }

    //Return true is key is in the array, return false otherwise
    public static boolean search(int[] data, int key){
        //Iterate over the whole array
        for(int i = 0; i < data.length; i++){
            //If the data at location i is same as the key
            if(data[i] == key){
                return true;
            }
        }
        return false;
    }

    public static boolean searchSlow(int[] data, int key){
        boolean found = false;
        for(int i = 0; i < data.length; i++){
            if(data[i] == key){
                found = true;
            }
        }
        return found;
    }
}
