package wk15_mon;

public class Set {
    String[] data;
    int size;

    public Set(int capacity){
        data = new String[capacity];
        size = 0;
    }

    public boolean contains(String value){
        for(int i = 0; i < size; i++){
            if(data[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    public void add(String value){
        if(size == data.length - 1){
            System.out.println("Set is full");
            return;
        }
        if(!contains(value)){
            data[size++] = value;
        }
    }

    public void displaySet(){
        for(int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
