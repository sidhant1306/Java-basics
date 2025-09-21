package StreamApiDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream API is used when we want to perform some operation on the list,
// but do not want to make changes in the original list
// stream can only be used once (see in step 2).
// We need stream api because it has some built in useful methods like filter, reduce, etc.
public class demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,32,45,23,5,23,5,2354,23);  // you can directly add elements to the list via this

        Stream<Integer> s1 = nums.stream();

//        s1.forEach(n -> System.out.println(n));     // here n is the temporary variable taken for the reference of the integer

        // if I try to use forEach again on the same s1 stream, it will give error.

//        s1.forEach(n -> System.out.println(n)); // Runtime error

        // using methods of stream api:

        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0 );    // if the stream is used once we cannot even assign it to any other stream, like we cannot work on it at all
        Stream<Integer> s3 = s2.map(n -> n * 2);
        s3.forEach(n -> System.out.println(n));     // now it will return doubled value of the even number
                                                          // we get even numbers from the s2 stream, and after performing 
                                                         // operation on the s2 with s3 we are getting the doubled values

    // it means we can perform different operation using different functions of stream, on different streams,
        // by creating new streams and performing operation on the previous stream until we have used the stream
        // like if we want to create a s3 stream, to perform operation on s2 stream,
        // it is important that we must not have used the s2 stream, for example, we must not have used the s2 stream with forEach method
        // we can also do it in one line:

        List<Integer> students = Arrays.asList(324,23,12,454,3454,98);
        int result = students.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);



    }
}
