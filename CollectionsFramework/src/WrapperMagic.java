import java.util.ArrayList;

public class WrapperMagic {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(10);
        list.add(20.0);
        System.out.println(list);

        Integer a = 10;
         a = 20;  // wrapper classes immutable
        System.out.println(a);
//        Before:  a ──► [Integer object: 10] (#101)
//
//        After:   a ──► [Integer object: 20] (#202)
//              [Integer object: 10] (#101)  ← orphaned, unchanged, will be GC

    }
}
