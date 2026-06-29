package CursorDemo;


import java.util.ArrayList;
import java.util.Arrays;
// Iterator works for all classes as well as legacy class
public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("harpreet","Shivam","deepika","pratham"));
        System.out.println(names);

        java.util.Iterator<String> it = names.iterator();
        while (it.hasNext()){ //  hasNext() method use to check that  data is present in collection
            String data = it.next(); // if data found , then next() is used to fetch the data
            if (data.equals("Shivam")){
                it.remove();
            }
            else{
                System.out.print(data + " ");
            }
        }
        System.out.println();
        System.out.println(names);


    }
}
