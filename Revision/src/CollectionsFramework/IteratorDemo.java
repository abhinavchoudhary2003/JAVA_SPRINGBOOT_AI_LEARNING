package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("harpreet","Shivam","deepika","pratham"));

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
           String data = iterator.next();
            System.out.print(data+" ");

        }
        System.out.println();
        System.out.println(names);
    }

}
