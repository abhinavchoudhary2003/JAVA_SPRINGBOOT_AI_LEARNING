package CollectionsFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(10);
        tset.add(50);
        tset.add(30);
        tset.add(10);
        tset.add(20);
        tset.add(10);
//        tset.add(null); // doesnot allow null value
        System.out.println(tset);
        // Treeset does not allow duplicates
        // treeset have some extra functionality because it implements Navigabelset
        int key = 25;
        System.out.println("Lower then : "+key+" : "+tset.lower(key));
        System.out.println("floor of : "+key+" : "+tset.floor(key));
        // And Navigable set extends sorted set so
        // TreeSet follows ascending order because of sorted set


    }
}
