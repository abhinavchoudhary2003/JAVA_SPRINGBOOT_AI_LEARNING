import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // order is not preseverd means it is not coming in preserve  order
        // no duplicate value
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(null);
        set.add(null);
        System.out.println(set);


        HashSet<Integer> set1 = new HashSet<>();
        //Default  initial capacity = 16, load factor = 0.75
        // When set 75% full (size == capacity × load factor)
        // Load factor(fill ratio)
        //Fill ratio 0.75 after filling 75% of HashSet a new Hashset will be created


        System.out.println("--------------------------------------------------------------");


      //  int a = null; shows error
        // here it is not showing error because Integer is a wrapper class so when we add null here it treats null as an object so it allows here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(null);
        System.out.println(list);
    }
}
