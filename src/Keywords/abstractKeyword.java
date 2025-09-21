package Keywords;// there might be cases when we currently do not know the implementation process or the code of the current function
// so we keep its body empty inside the class because we know that we need it just don't know how to get it to use right now
// so we create abstract classes for this
// because if we just add it to a class as a normal function and empty body it will return an error

// so we can leave it just declared, but this way the user can create the object instance for this function and the class which we do not want because it has no features at this moment

abstract class Car{
    public abstract void drive();       // only declaring with the abstract keyword
    public void playMusic(){
        System.out.println("music playing");
    }
}

class wagonR extends Car{
    public void drive(){
        System.out.println("car can drive");
    }
}

public class abstractKeyword {
    public static void main(String[] args) {
        // Car obj = new Car(); // not allowed because car is an abstract class

        Car obj = new wagonR();     // every child class implements the abstract method for their class as each company is going to have different driving functions like engine etc
        obj.drive();
        obj. playMusic();
    }
}
