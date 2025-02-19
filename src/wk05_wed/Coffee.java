package wk05_wed;

public class Coffee {
    private int size;
    private Syrup[] syrups;
    private int syrupCount;
    public static final int DEFAULT_MAX_SYRUP = 3;

    public Coffee(){
        size = 16;
        syrups = new Syrup[DEFAULT_MAX_SYRUP];
        syrupCount = 0;
    }

    public void resize(){
        //Create a larger array
        Syrup[] moreSyrup = new Syrup[syrups.length * 2];

        //Copy the data to the new array
        for(int i = 0; i < syrups.length; i++){
            moreSyrup[i] = syrups[i];
        }

        //Update the attribute reference
        syrups = moreSyrup;
    }

    public void addSyrup(Syrup s){
        if(syrupCount >= syrups.length) {
            System.out.println("Too many syrups!");
            return;
        }
        syrups[syrupCount++] = s;

//        if(syrupCount < syrups.length){
//            syrups[syrupCount++] = s;
//        } else{
//            System.out.println("Too many syrups!");
//        }
    }

    public int getSize(){
        return size;
    }

    public void setSize(int sz){
        size = sz;
    }
    //Coffee with Caramel syrup, Vanilla syrup, and Chocolate syrup
    public String toString(){
        StringBuilder sb = new StringBuilder("Coffee with ");
        for(int i = 0; i < syrupCount - 1; i++){
            sb.append(syrups[i]).append(", ");
        }
        if(syrupCount > 1){
            sb.append("and ");
        }
        if(syrupCount > 0) {
            sb.append(syrups[syrupCount - 1]);
        } else {
            sb.append("no syrup");
        }
        return sb.toString();
    }
}
