package CollectionsFramework;

import java.util.LinkedHashSet;

public class LInkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        lset.add(10);
        lset.add(20);
        lset.add(30);
        lset.add(40);
        lset.add(10);
        lset.add(null);
        System.out.println(lset);

        // Duplicates are not allowed
        // Insertion orders are preserve
    }

}
