import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

    //SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(30);
        sortedSet.add(1);
        sortedSet.add(200);
        sortedSet.add(20);
        sortedSet.add(10); // no duplicates

        System.out.println("sorted set : "+sortedSet); // prints in asc order naturally by java
        System.out.println("first element : "+sortedSet.first());

        //headset: all element less than given element
        // tailSet: all elements greater than or equal to given element
        System.out.println(sortedSet.headSet(30)); //<
        System.out.println(sortedSet.tailSet(30)); //>=


        // Navigable Set
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);
        navigableSet.add(10); // no duplicates
        System.out.println("navigable set : "+navigableSet); // prints in asc order because it extends SortedSet
        System.out.println(navigableSet.headSet(20));
        //nevigation methods
        int key = 25;
        System.out.println("Lower then : "+key+" : "+navigableSet.lower(key));
        System.out.println("floor of : "+key+" : "+navigableSet.floor(key)); // floor(25) — "look downward / backward"  And Looking backward (≤ 25): 20 is the closest one ≤ 25 ,,if floor(30) then ans will be 30  becuase it looks smaller than or equal(≤) so,it prefers equal value here
        System.out.println("Higher then : "+key+" : "+navigableSet.higher(key));

        System.out.println("Ceiling of : "+key+" : "+navigableSet.ceiling(key)); //  // ceiling(25) — "look upward / forward"  and Looking forward (≥ 25): 30 is the closest one ≥ 25,, if ceiling(30) then ans will be 30 because it looks greater than or equal(≥) so,it prefers equal value here



    }
}
