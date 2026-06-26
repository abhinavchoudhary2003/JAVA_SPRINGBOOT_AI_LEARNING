import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

       System.out.println(list);
//        System.out.println(list.get(0)); // print value using index
//        System.out.println(list.size()); // print size of ArrayList

        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("A");
//        System.out.println(names);
//        names.add(2,"E");
//        System.out.println(names);
//
//        names.remove(2);
//        System.out.println(names);


      String str[] = {"A","B","C","D"};
      List<String> list1 = new ArrayList<>(Arrays.asList(str));
        System.out.println(list1);

        // traverse the list
        // using for-each loop
        for(String s : list1){
            System.out.print(s+" ");
        }
        System.out.println();
         // using simple loop
//        for(int i=0;i<list1.size();i++){
//            System.out.println(list1.get(i));
//        }


        // sorting
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(30);
        list3.add(20);
        list3.add(2);


        Collections.sort(list3);
        System.out.println(list3);


        Collections.synchronizedList(list);
        System.out.println(list);








    }
}
