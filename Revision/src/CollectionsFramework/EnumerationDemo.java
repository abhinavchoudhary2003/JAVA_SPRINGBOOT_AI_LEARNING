package CollectionsFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            Integer data = enumeration.nextElement();
            System.out.println(data+ " ");
        }

    }
}
