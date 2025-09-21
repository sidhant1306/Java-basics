package Exceptions;
// step 1:
    class customExc extends Exception{
        // adding the constructor method to print the message:
        // Step 2:
        public customExc(String message){
            // we have to use super keyword because the parent class Exception also has a method to print the message
            // so the parent class handles the message
            super(message);
        }
    }
public class customException {

    public static void main(String[] args) {
        // steps of custom Exception:
        // create a class named whatever you want to name your exception and extend it by the parent class Exception
        // in that if you want to print any message so create a constructor which takes some string message as an input

        int a = 10;
        int b = 2;

        try{
            int ans = a / b;    // divide by 0;


            // imagine if you don't want to print any number below 10;
            // you can use custom Exception
            // Step 3:
            if(ans < 10) throw new customExc("we do not want values below 10");
        }
        catch (customExc e){
            System.out.println("custom exception implemented " + e);        }
        catch (ArithmeticException e){
            System.out.println("divide by zero is not allowed");

        }
        catch (Exception e){
            System.out.println("Some error occured");
        }
    }

}
