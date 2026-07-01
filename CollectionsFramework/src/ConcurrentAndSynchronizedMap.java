import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentAndSynchronizedMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new  HashMap<>();
        map.put(null,10);
        map.put("raja",null); // null is allowed for both key and value
       System.out.println(map);

       // synchronizedMap() nulls are allowed here as well
       // why because It is just a "Wrapper" (No internal logic of its own)
       // When you call put(null, null) on a synchronized map, all it does is:
        //Lock the wrapper object.
        //Forward the null directly to the underlying HashMap (which naturally accepts null).
        //Unlock.
        Map<String, Integer> stringIntegerMap = Collections.synchronizedMap(map);
        System.out.println(stringIntegerMap);


        // ConcurrentMap() -> null is not allowed in concurrenHashMap
      //  because of this , It is defined in ConcurrentMap() internal when wer expand put()-> goes to ConcurrentMap() class -> here putval() method defined
      //  final V putVal(K key, V value, boolean onlyIfAbsent) {
       //     if (key == null || value == null) throw new NullPointerException();
        ConcurrentMap<String,Integer> concurrentMap=new ConcurrentHashMap<>();
        concurrentMap.put(null,10);
        System.out.println(concurrentMap);



    }
}
