package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(101,"Amit");
        map.put(102,"Rahul");
        map.put(103,"Ashwani"); //complexity O(1)

        //why insertion complexity O(1)

        String value = map.get(101); // get value using key
        System.out.println(value);
        map.put(null,"null"); // allows null
        map.put(101,"Raja"); // override the 101 key's value so no duplicates key allowed
        map.put(104,"Rahul"); // but values can be duplicated

        System.out.println(map);
        if(map.containsKey(101))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }

        String orDefault = map.getOrDefault(101, "NO");
        String orDefault1 = map.getOrDefault(105, "NO");

        System.out.println(orDefault); // return Raja  because 101 key exist  in map so its value return if 101 doesn't exist then its no
        System.out.println(orDefault1); // return No becuase 105 key is not exist in map


        // another way to print value of map
        for(Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " --> "+entry.getValue());
        }
    }
}
