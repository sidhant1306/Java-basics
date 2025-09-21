package Exceptions;

public class exceptions {
    public static void main(String[] args) {
        int i = 0;   // set to 0 to cause divide by zero
        int j = 10;
        int m = 2;
        int[] nums = new int[5];
        // whenever an exception is encountered in the try block it stop the execution until we have multiple catch blocks
        try {
            // Arithmetic Exception
            int ans = j / i;
            System.out.println(ans);

            // Array Index Out of Bounds
            System.out.println(nums[8]);
            System.out.println(nums[9]);

            // Custom condition check with throw
            int sol = m / 2;
            if (sol < 10) throw new ArithmeticException("Solution is less than 10!");

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero OR invalid arithmetic operation: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Be in your limits: " + e);
        } catch (Exception e) {
            // General fallback for any other exceptions
            System.out.println("Some other error occurred: " + e);
        }

        System.out.println("bye");
    }
}
