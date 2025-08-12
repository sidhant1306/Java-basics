
class Human{
    private String name;
    private int age;
    private int id = 108;
    private String LastName = "taneja";

    public int getId(){            // This does not require any parameter it is just a public function returning the id
        return id;          // we made the variable private, but made this function to return the id if anyone wants to know the id because this way the value of this variable cannot be changed publicly, but it can be printed or accessed publicly
    }
    public String getLastName(){
        return LastName;
    }
    public void setAge(int a){              // here we are asking the user to set the age to the age variable so we need to pass a variable in the function call to get the user value
        age = a;                        // here 'a' in the argument user wants to set to the age variable
        System.out.println(age);
    }
    public void setName(String n){
        name = n;
        System.out.println(name);
    }



}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setAge(20);
        obj1.setName("sidhant");
        System.out.println(obj1.getId());
    }
}
