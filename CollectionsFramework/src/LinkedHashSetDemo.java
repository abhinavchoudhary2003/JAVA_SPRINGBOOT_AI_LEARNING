import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
       // orders preserve because it is a combination of linked list and set , but no duplication .

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);



    }
}
