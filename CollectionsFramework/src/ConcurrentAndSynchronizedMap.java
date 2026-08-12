import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentAndSynchronizedMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new  HashMap<>();
        map.put(null,10);
        map.put("raja",null); // null is allowed for both key and value in Hahmap
       System.out.println(map); // "Not thread-safe" means: multiple threads working on the same shared data at the same time can produce incorrect results.

       // synchronizedMap() nulls are allowed for both key and value here as well
       // why because It is just a "Wrapper" (No internal logic of its own)
       // When you call put(null, null) on a synchronized map, all it does is:
        //Lock the wrapper object.
        //Forward the null directly to the underlying HashMap (which naturally accepts null).
        //Unlock.
        Map<String, Integer> stringIntegerMap = Collections.synchronizedMap(map);
        System.out.println(stringIntegerMap);


        // ConcurrentMap() -> null is not allowed for both keys and values in concurrenHashMap
      //  because of this , It is defined in ConcurrentMap() internal when wer expand put()-> goes to ConcurrentMap() class -> here putval() method defined
      //  final V putVal(K key, V value, boolean onlyIfAbsent) {
       //     if (key == null || value == null) throw new NullPointerException();]
       // ConcurrentHashMap is a thread safe .
        ConcurrentMap<String,Integer> concurrentMap=new ConcurrentHashMap<>();
        concurrentMap.put(null,10);
//          concurrentMap.put("Abhi",null);
        System.out.println(concurrentMap);



    }
}
