package CursorDemo;
// java provides 3 functionalities to fetch data from collection  known as Cursors

import java.util.Iterator;
import java.util.Vector;
import java.util.*;

// Enumeration works only for legacy classes
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println(vector);

        Enumeration<Integer> enumeratoion = vector.elements();
        while(enumeratoion.hasMoreElements()){
            Integer data = enumeratoion.nextElement();
            System.out.print(data +" ");
        }
        System.out.println();
        System.out.println("-------------------------");
        Iterator<Integer> iterator = vector.iterator();
        while(iterator.hasNext()){ // hasNext() method use to check that  data is present in collection
            Integer data1 = iterator.next(); // // if data found , then next() is used to fetch the data
            System.out.println(data1);
        }
    }
}
