package wk13_wed;

public class StringAndChar {
    public static void main(String[] args){
        String s1 = new String("Foo");
        String s2 = new String("Foo");

        //Do not use this
        System.out.println(s1 == s2);
        //Use this
        System.out.println(s1.equals(s2));

        System.out.println("Foo" == "Foo");
        System.out.println("Foo".equals("Foo"));

        //String is immutable
        String s3 = "Hello";
        System.out.println(s3);
        for(int i = 0; i < s3.length(); i++){
            System.out.println(s3.charAt(i));
        }
        System.out.println();

        char c1 = 'A';
        System.out.println(c1);
        int n = 'A';
        System.out.println(n);
        char c2 = 66;
        System.out.println(c2);
        char c3 = (char) (c2 + 2);
        System.out.println(c3);

        for(int i = 65; i < 91; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (char c = 65; c < 91; c++){
            System.out.print(" " + c + " ");
        }
        System.out.println();

        for(char c = 48; c <= 57; c++){
            System.out.print(c + " ");
        }
        System.out.println();

        char a = '1';
        char b = '2';
        System.out.println(a + b);

        char[][] data = new char[3][3];
        char value = 48; // '0'
        for(int r = 0; r < data.length; r++){
            for(int c = 0; c < data[r].length; c++){
                data[r][c] = value++;
            }
        }
        print(data);
        System.out.println();
        data[1][1] = '*';
        print(data);
    }

    public static void print(char[][] data){
        for(int r = 0; r < data.length; r++){
            for(int c = 0; c < data[r].length; c++){
                System.out.print(data[r][c] + " ");
            }
            System.out.println();
        }
    }
}
