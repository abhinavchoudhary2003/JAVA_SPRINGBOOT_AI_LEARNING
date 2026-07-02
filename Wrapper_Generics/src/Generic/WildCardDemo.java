package Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args) {
        //List<Number> list=new ArrayList<Integer>(); // shows error because wrapper classes does not follow Inheritance

        display(List.of(1,2,3,4));
        display(List.of(1.4,2.5,3.4,4.6));

        List<Number> nums=new ArrayList<>();
        print(nums);
    }
    // upperbound rule  means Number -> extend by its child like Integer, Double, float
    static void display(List<? extends Number> list)
    {
        System.out.println(list);
    }
     // lower bound rule means Integer-> super-> Number and object data type
    static void print(List<? super Integer> list)
    {
        list.add(100);
        list.add(20);
        System.out.println(list);
    }
}
