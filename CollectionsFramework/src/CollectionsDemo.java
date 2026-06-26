import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

    // three ways to create an Arraylist
    //public ArrayList()                          // no-arg
    // public ArrayList(int initialCapacity)        // takes an int
    // public ArrayList(Collection<? extends E> c)  // takes a Collection
    
        // 1st way
        List<Integer>list = new ArrayList<>(); // here we cannot create an object of List because it is an interface
        //  when we create an object of new ArrayList<>() , the default capacity is 10 , but it can grow using this formula that is ,define in grow method
        // newCapacity = oldCapacity + (oldCapacity >> 1)

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10); // takes duplicate

        System.out.println(list);
        System.out.println(list.get(1)); // indexing

        // 2nd way
        List<Integer>list1 = new ArrayList<>(5); // creating arraylist with initial capacity
        // here initialcapacity is 5 so new capacity = oldCapacity + (oldCapacity >> 1) = 5 + (5 >> 1) = (5 >> 1 means 5/2, integer division, so 2.5 → 2) = 5 + 2 = 7
        // ArrayList never stops growing — there's no upper limit,  the formula doesn't run once, it runs every time the array fills up again.So there's no fixed "max capacity" baked into the formula — each resize just computes "1.5x of whatever the current capacity is right now," and this can keep happening as many times as needed
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(12);

      //  System.out.println(list1);

       // Third way
        List<Integer> list2 = new ArrayList<>(list);//creating arraylist from other collection


        // cloneable
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Java");
        list4.add("Python");

        ArrayList<String> list5 = (ArrayList<String>)list4.clone();

        System.out.println(list1);
        System.out.println(list2);




    }
}
