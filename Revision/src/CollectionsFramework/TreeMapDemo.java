package CollectionsFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(10,"C");
        map.put(5,"B");
        map.put(1,"K");
        map.put(4,"L"); // print value in ascending order because of sorted map
//        map.put(null,"null"); // does not allow null keys but we can add null keys by supplying null in customized sorting(Comparator)

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey() +"-->"+entry.getValue());

        }
    }
}
