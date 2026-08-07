package CollectionsFramework;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector =  new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(10);
        System.out.println(vector);
        System.out.println(vector.get(0));

        // Vector is also works like Arraylist it follows insertion order , it allows duplicate , it allows random access means we can access element using index fastly
        // but there are some difference between vector and Arraylist are:
        // 1. Arraylist size grows by 1.5x and vector size grows by 2x.
        //2. Inside ArrayList all methods are non synchronized so multiple threads can work parallely but In vector all methods are synchronized so one threads works at once.
        //3. Vector is a legacy class

    }
}
