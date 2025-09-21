package Exceptions;
class ducking{
    public void show() throws ClassNotFoundException{
        // now using the throws keyword what we did here is that now this class/ method is not handeling the,
        // implementation of the catch block, and the function calling this method(main in this case),
        // has to handle this exception using the try and catch block;

        Class.forName("sidhant");   // class with this name is not found
    }
}
public class throwsDuckingExc {

    public static void main(String[] args) {
        ducking obj = new ducking();
//        obj.show();       // this gives error because we used throws keyword in the show() method but we are not handeling it in the main class
        // so we need to surround this with try and catch blocks

        try{
            obj.show();
        }catch (ClassNotFoundException e){
            System.out.println("class is not present" + e);
        }
    }

}
