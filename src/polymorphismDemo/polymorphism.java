package polymorphismDemo;

class One{
    public void show(){
        System.out.println("in One show");
    }
}
class Two extends One{
    public void show(){
        System.out.println("in Two show");
    }
}
class Three extends One{
    public void show(){
        System.out.println("in Three show");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        One obj = new One();  //j object instance is of one of type One
        obj.show();

        One obj2 = new Two(); // object instance of two of type two
        obj2.show();  // prints the show method present in the two class because the object instance is of type B irrespective of the type of the object

        obj2 = new Three();// object instance with the reference of the 2nd obj is now assigned a new value
        obj2.show();    // prints in show three
    }

}
