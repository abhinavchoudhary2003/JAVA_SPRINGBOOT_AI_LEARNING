package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ways to create an ArrayList
        // default capacoty of an arraylist is 10
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5); // Here you see the list initial capacity of list is 5 but we store 7 elements so arraylist is growable in nature
        list.add(10); // allows duplicate and follows the insertion order

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());


        ArrayList<Integer> list2 = new ArrayList<>(5);
        // here we saw that we add initial capacity 5 but when we print size it shows 0 because size() tells you the physical capacity(means number of elements) not a virtual capacity
        // so when initial = physical capacity  then size of arraylist grows
        System.out.println(list2);
        System.out.println(list2.size());

       // another way
        ArrayList<Integer> list3 = new ArrayList<>(list);
        System.out.println(list3);

        // use cloneable

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Java");
        list4.add("python");

       // usig cloneable means you can create a copy of arraylist here we create a copy of list4 and create a  new arraylist from that arraylist
        ArrayList<String> list5 = (ArrayList<String>) list4.clone();
        System.out.println(list4);
        System.out.println(list5);
        // if we add anything in list5 it will not affect list4
        list5.add("SQL");
        list5.add("springboot");
        System.out.println(list4);
        System.out.println(list5);


    }
}
