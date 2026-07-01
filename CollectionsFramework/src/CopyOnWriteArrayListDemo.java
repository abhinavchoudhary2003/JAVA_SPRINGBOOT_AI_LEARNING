import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

       // AraryList v/s copyOnArrayList

   /*Expample of -> fail-fast iterator
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Simulating iterating through the list
        for (String item : list) {
            System.out.println("Reading: " + item);

            // CRASH WARNING: Modifying the list structurally during iteration
            // So to wrap it all up: The exception happens because list.add() changes the size of the list
// behind the scenes, and ArrayList considers that cheating while a loop is running!

            if (item.equals("Banana")) {
                list.add("Dates");
            }
        }
        // o/p : Exception in thread "main" java.util.ConcurrentModificationException
    */

        // Example of CopyOnWriteArrayList and failsafe iterator

            List<String> list1 = new CopyOnWriteArrayList<>();

            list1.add("Apple");
            list1.add("Banana");
            list1.add("Cherry");

            for (String item : list1) {
                System.out.println("Reading: " + item);
                if (item.equals("Banana")) {
                    list1.add("Dates"); // means "Add 'Dates' as a brand-new item to the very end of the list." It doesn't mean "Swap Banana out for Dates."
                }
            }
        System.out.println(list1); // final list size changes 

    }
}
