package enumsDemo;// we have all came across situations of getting an error from the server with the error name and error code
// so as we have to allot different code and name to different server responses like success failed etc.
// so instead of creating an object of every single one of them, we can store all of them directly in an enum class
// so all the constants in the enum class are objects.

enum Status{
    Running,Pending,Success,Failed;     // now all these defined in the enum are objects, so they can be accessed how we access objects
}

public class enums {

    public static void main(String[] args) {
        // printing the output
        Status s = Status.Success;      // status is the type as enum is a class defined with name Status in this case
        System.out.println(s);

        // printing the response number:

        Status s1 = Status.Failed;
        System.out.println(s1.ordinal());   // this will print the index number like the position number of the defined constant

        // to print all the errors in the enum :

        Status[] ss = Status.values();      // values function stores all the values in an array
        System.out.println(ss[0]);          // this will print the value at the first position
        // so to print the whole array we need to use an enhanced for loop,
        // this loop will print the response message with response number
        for(Status status : ss){
            System.out.println(status + " " + status.ordinal());
        }

        // using switch statements to print the response message in enums:

        switch (s){
            case Running -> System.out.println("Your project is running");
            case Pending -> System.out.println("Your project is pending,Please wait");
            case Success -> System.out.println("Project finished");
            case Failed -> System.out.println("Failed");
        }



    }

}
