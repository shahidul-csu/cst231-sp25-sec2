package wk15_mon;

public class SetTest {
    public static void main(String[] args){
        Set s = new Set(20);
        s.add("Apple");
        s.add("Orange");
        s.displaySet();
        s.add("Apple");
        s.displaySet();
        s.add("Mango");
        s.displaySet();
    }
}
