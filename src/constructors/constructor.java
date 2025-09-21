package constructors;

class student{
    private int age;
    private String name;


    //default constructor:
    public student(){
        age = 18;
        name = "threads.hello";
        System.out.println(age);
        System.out.println(name);
    }


    // Parameterized constructor:
    public student(int a, String n){
        age = a;
        name = n;
        System.out.println(age);
        System.out.println(name);
    }


    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class constructor {
    public static void main(String[] args) {
        student obj = new student();        //default constructor
        student obj1 = new student(20, "sidhant");      //parameterized constructor


    }


}

