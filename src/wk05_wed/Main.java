package wk05_wed;

public class Main {
    public static void main(String[] args){
        Coffee c = new Coffee();
        System.out.println(c);
        c.addSyrup(new Syrup("Caramel"));
        System.out.println(c);
        c.addSyrup(new Syrup("Vanilla"));
        System.out.println(c);
        Syrup s1 = new Syrup("Chocolate");
        c.addSyrup(s1);
        System.out.println(c);

        Syrup s2 = new Syrup("Strawberry");
        c.addSyrup(s2);
        System.out.println(c);

        c.resize();
        c.addSyrup(s2);
        System.out.println(c);
    }
}
