package inputsDemo;

import java.io.IOException;
import java.util.Scanner;

public class takingInputs {
    public static void main(String[] args) throws IOException {

        // Historical way:
//        System.out.println("Enter your number");
//
//        InputStreamReader in = new InputStreamReader(System.in);    // step 2: this is the in input stream for the bufferReader, it needs an inputStream which we have passed System.in, which only takes one character as an argument
//        BufferedReader bf = new BufferedReader(in);     // step 1 : we need a bufferReader, and it needs an inputStream reader as an argument which we have passed with the name in
//
//        int num =  Integer.parseInt(bf.readLine()); // Step 3: bufferReader returns the input in the format of string so we convert it to integer via using parseINt
//        System.out.println(num);
//        bf.close(); // we should close our resources

        // Modern way, better way:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(num);
    }
}
