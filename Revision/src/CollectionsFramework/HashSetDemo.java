package CollectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        set.add(null);
        System.out.println(set);
// Insertion order not preserve
// Doesnot allow duplicate
// Growable in nature when hashset 75% full then new Hashset will be created(2x), Default capacity is 16.

    }
}
