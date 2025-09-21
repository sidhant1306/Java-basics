package inheritance;

// Inherited class:
class Adv_calc extends basic_calc {
    public int multi(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }
}
// Main class:
public class inheritance {
    public static void main(String[] args) {
        Adv_calc obj = new Adv_calc();      // creating object instance of the class that inherits the features from the other class
        int addition = obj.add(5, 4);   // adv_calc class does not have the addition function declared inside it still it can implement it because it is inheriting it from the basic_calc class
        int multiply = obj.multi(10,30);
        int divide = obj.divide(40, 20);
        int sub = obj.subtract(40, 10);

        System.out.println(addition + " " + multiply + " " + divide + " " + sub);
    }
}
