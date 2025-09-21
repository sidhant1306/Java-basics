package Keywords;

class X{

    public X(){     //Constructor created
        System.out.println("Constructor X created");
    }

    public X(int a){
        System.out.println("Constructor X with parameter created");
        System.out.println(a);
    }
}

class Y extends X{

    public Y(){
        System.out.println("Constructor Y created");
    }

    public Y(int a){
        /*
        Refer to this after reading Main class notes :

        we can also call super() on our own in each constructor :
        super(5);   // to call the constructor present in X with parameters

        */


        System.out.println("Constructor Y with parameters created");
        System.out.println(a);


    }
        }

public class SuperKeyword {
    public static void main(String[] args) {
        Y obj = new Y();        // calling the y constructor object without the arguments

        System.out.println();
        Y obj1 = new Y(5);  // it calls the constructor with parameters present inside the Y class

        // Now in this example, as we can see that whenever we call the Y class that extends the class X the constructors present in the Y class is called and also the constructor(without parameters) present in the X class is also called
        // NOTE : but as we can see that when we call the object of class Y with parameters passed in its object, it calls the constructor present in the Y class with parameters only
        // The point to be noted here is that it does not call the constructor with parameters present in the X class

        // This is due to the abstract presence of the Super() method in each constructor
        // Super() keyword is present and called in every constructor irrespective of if it has any parent class or not
        //Super() keyword means it calls the constructor present in the parent class
        // as Super() keyword is called abstractedly in each constructor it does not have any parameters passed inside it on default so any constructor in the parent class without the parameters is called but not the constructors present in the parent class with any parameters

    }



}
