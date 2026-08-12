package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(101,"Amit");
        map.put(102,"Rahul");
        map.put(103,"Ashwani");
        map.put(null,"null"); // always print ata index 0 because it always prints 0 hashcode
        System.out.println(map.get(101));
        map.put(101,"Raja"); // Override the key 101 so it does not allow duplicates
        map.put(104,"Rahul"); // BUt Values can be duplicated
        System.out.println(map);

//        map.clear(); // clear all elements
//        System.out.println(map);

         // boolean isEmpty()
         if(map.isEmpty()){ // returns true if map has zero elements
             System.out.println("true");
         }
         else{
             System.out.println("false");
         }

        // boolean containsKey(Object key) Returns true if map contains specified key
         if(map.containsKey(101)){
             System.out.println("true");
         }
         else{
             System.out.println("false");
         }

         // .remove(objectkey,object value)
//        System.out.println(map.remove(101,"Raja"));
//        System.out.println(map);

        // values() -> fetch all values
        System.out.println(map.values());

        //replace(K key,	V value) Replace the value of specified key with given value.
        System.out.println(map.replace(101,"Raja","Abhi"));
        System.out.println(map);

       // int size() Returns the number of key-values	in map.
        System.out.println(map.size());

     // keySet() Returns a Set of keys contained in this map.
        System.out.println(map.keySet());

      // Print elements of map
        System.out.println(map);

        // Another way
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey() +" --> "+entry.getValue());
        }
        // HashMap
        // Duplicate keys are not allowed, but duplicate values are allowed \
        // Insertion order not preserved (output order is unpredictable)
        // Internal Data Structure is HashTable
    }
}
