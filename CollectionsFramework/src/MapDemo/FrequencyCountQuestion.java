package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountQuestion {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,4};
        Map<Integer,Integer> map=new HashMap<>();
        for(int n : arr)
        {
            map.put(n,map.getOrDefault(n, 0) +1);
        }
        System.out.println(map);
    }
}
/*
n map.getOrDefault(n, 0) +1  map.put(n, ...)   Map state after this step
1 0(not in map yet)       1  put(1, 1)         {1=1}
2 0(not in map yet)       1  put(2, 1)         {1=1, 2=1}
3 0(not in map yet)       1  put(3, 1)         {1=1, 2=1, 3=1}
1 1(already in map)       2  put(1, 2          {1=2, 2=1, 3=1}
2 1(already in map)       2  put(2, 2)         {1=2, 2=2, 3=1}
3 1(already in map)       2  put(3, 2)         {1=2, 2=2, 3=2}
4 0(not in map yet)       1  put(4, 1)         {1=2, 2=2, 3=2, 4=1}



 */
