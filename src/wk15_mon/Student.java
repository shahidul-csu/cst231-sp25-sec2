package wk15_mon;

public class Student {
    private String id;
    private String name;
    private int credit;

    //Constructor
    public Student(String i, String n){
        id = i;
        name = n;
        credit = 0;
    }

    public Student(String i, String n, int c){
        id = i;
        name = n;
        credit = c;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void addCredit(int c){
        credit += c;
    }

    public String getStudentLevel(){
        if(credit < 30){
            return "Freshman";
        } else if(credit < 60){
            return "Sophomore";
        } else if(credit < 90){
            return "Junior";
        } else{
            return "Senior";
        }
    }

    public String toString(){
        return "Id: " + id + ", Name: " + name + ", Credit: " + credit;
    }
}
