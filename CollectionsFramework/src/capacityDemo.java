import java.util.ArrayList;

public class capacityDemo {
    public static void main(String[] args) {
        // Virtual capacity v/s physical capacity

        ArrayList<Integer> list = new ArrayList<>();// default initial capcity = 10
        System.out.println(list.size()); // prints 0
        list.add(1);
        System.out.println(list.size());// print 1
        // size() tells you the number of elements inside (Size). physical capacity
        // The total number of slots allocated in memory (0 to 9) is the virtual  Capacity.
        // when physical capcity == virtual capacity the arraylist will grow




    }
}
