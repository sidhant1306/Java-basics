package interfacesDemo;

interface face1{
    int age = 20;   // the variables defined in the interface are all final and static
    void show();
    void config();      // methods are abstract and public by default
}


class faceImp implements face1{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}


public class interfaces {
    public static void main(String[] args) {
        face1 obj = new faceImp();      // creating obj of implements class using the interface
        // face1.age = 20 // not possible you  cannot change its value as its final by default
        System.out.println(face1.age);  // you can directly access it using the interface name without the need of implement class
        obj.show();
        obj.config();
    }


}
