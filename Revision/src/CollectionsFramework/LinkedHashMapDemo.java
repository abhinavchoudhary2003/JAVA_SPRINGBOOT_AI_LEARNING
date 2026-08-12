package CollectionsFramework;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(101,"Amit");
        map.put(102,"Rahul");
        map.put(103,"Ashwani");
        map.put(null,"null");
        System.out.println(map); // Insertion order preserved

    }
}
