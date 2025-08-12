
class mobile{
    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println("Brand " + brand + " " + "Price " + price + " " + "type " + type);
    }
    //Function to print all the objects of this class individually on their own

}

public class StaticKeyword {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        mobile.type = "phone";

        mobile obj2 = new mobile();
        obj2.brand = "Nothing";
        obj2.price = 2389;
        mobile.type = "Smartphone";

        obj1.show();
        obj2.show();


    }
}
