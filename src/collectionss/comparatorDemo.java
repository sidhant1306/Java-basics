package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// comparator is something used to define your own logic of sorting something based on your logic,
public class comparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(392);
        list.add(29);
        list.add(123);
        list.add(48);

        // comparator is an interface, and as we know the interfaces are abstract and needs to be implemented,
        // implementation can be done by creating an implementation class or by anonymously implementing the interface,
        // when calling it in the main function
        // the interface has a compare method which takes two parameters which we need to compare
        // what if we want the numbers whose last digit is larger than the other number, come first in the list.

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i % 10 < j % 10){
                    return 1;
                }
                else{return -1;}
            }
        };

        Collections.sort(list, com);
        System.out.println(list);

        // creating a comparator to sort the list based on size of the string stored in it
        Comparator<String> size = new Comparator<String>() {

            public int compare(String s1, String s2) {
                if(s1.length() > s2.length()){
                    return 1;
                }
                return -1;
            }
        };

        List<String> str = new ArrayList<>();

        str.add("sidhant");
        str.add("bhatia");
        str.add("rohit");
        str.add("karanveer");

        Collections.sort(str, size);
        System.out.println(str);
    }
}