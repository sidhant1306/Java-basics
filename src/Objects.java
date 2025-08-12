class AnonymousObject{

    // Just a printing function
    public void print(){
        System.out.println("hello world");
    }
    // default constructor creation
    public AnonymousObject(){
        System.out.println("object created");
    }
}

public class Objects {
    public static void main(String[] args) {
        // Now anonymous objects are those objects which do not have a name

       // NOT an example of anonymous cons:  // for example : AnonymousObject obj = new AnonymousObject();
        // in the above example we are creating the object by new keyword but we are giving it a name by using AnonymousObject obj

        // so  Anonymous constructor is mentioned below :

        new AnonymousObject();
        new AnonymousObject().print();

        // now by this we can work with this object only once we can not reuse it as it has no name
    }
}
