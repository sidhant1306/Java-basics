package collectionss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    // only unique values
    // random order
    public static void main(String[] args) {
        Set<Integer> students = new HashSet<Integer>();
        students.add(18);
        students.add(28);
        students.add(283);

        for(int n : students){
            System.out.println(n);
        }
        System.out.println(students);


        Set<Integer> nums = new TreeSet<Integer>();     // ordered set
        nums.add(79);
        nums.add(88);
        nums.add(99);

        Iterator<Integer> values =  nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}
