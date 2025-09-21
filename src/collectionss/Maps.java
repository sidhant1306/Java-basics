package collectionss;

import java.util.HashMap;
import java.util.Map;

public class Maps  {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();    // key is of type string, and value is of type integer
        // Hash table is just the same as hashMap, but its just synchronized, so use it if you have multiple threads running at the same time
        students.put("Navin", 49);
        students.put("sidhant", 50);
        students.put("Siddhant", 90);
        students.put("Bhatia", 70);

        System.out.println(students.get("Bhatia"));       // entered the key and it returned the value
        System.out.println(students);

        System.out.println(students.keySet());      // prints all the keys for the students Map

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));    // students.get(key) is used to retrieve values from a map from each key using forEach loop
        }
    }
}
