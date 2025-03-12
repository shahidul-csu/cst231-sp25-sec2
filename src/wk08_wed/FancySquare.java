package wk08_wed;

public class FancySquare {
    public static void main(String[] args){
        int size = 7;
        String star = "* ";
        String dash = "- ";
        int flagL = size/2;
        int flagR = size/2;

        for(int r = 0; r < size; r++){ //Outer Loop
            for(int c = 0; c < size; c++){ // Inner Loop
                if(c == flagL || c == flagR){
                    System.out.print(star);
                } else {
                    System.out.print(dash);
                }
            }
            System.out.println();
            if(r < size / 2){
                flagL--;
                flagR++;
            } else{
                flagL++;
                flagR--;
            }
        }
    }
}
