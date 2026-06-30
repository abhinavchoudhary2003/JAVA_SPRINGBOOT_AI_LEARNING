import java.util.HashMap;

public class HashMapInternal {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("rani",10); // only contain hash(key)
        map.put("raja",10);
        map.put("amit",10);

        Integer value = map.get("raja"); // contain both hash(key) and equals()
        System.out.println(value);


    }
}































//        Integer a = 10;
//        Integer  b= 20;
//     System.out.println(a.equals(b)); // compare content
//        System.out.println(a==b); // compare content
//
//        String s = "abhi";
//        String s1 = "ggg";
//        System.out.println(s.equals(s1)); // compare content
//        System.out.println(s==s1); // compare refrence address

