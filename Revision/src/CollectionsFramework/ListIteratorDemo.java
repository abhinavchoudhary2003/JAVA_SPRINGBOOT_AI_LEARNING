package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> listiterator = list.listIterator();
        while(listiterator.hasNext()){
            Integer data = listiterator.next();

            System.out.print(data+" ");
        }
    }
}
