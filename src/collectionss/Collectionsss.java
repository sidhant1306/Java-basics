package collectionss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collectionsss {
    public static void main(String[] args) {
        // we do not have indexing for Collection api
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(28);
        nums.add(293);
        for(int n : nums){
            System.out.println(n);
        }

        // we can also use list if we want to work with indexing:
        System.out.println("List:");
        List<Integer> arr = new ArrayList<>();

        arr.add(82);
        arr.add(29);
        arr.add(127);
        arr.add(23);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
