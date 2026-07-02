package Generic;

import java.util.ArrayList;

public class ProblemsWithoutGenericDemo {
    public static void main(String[] args) {

        // collection can store both heterogeneous and homogeneous object data

        // Heterogeneous
        ArrayList list1=new ArrayList();

        list1.add(10000); // Integer
        list1.add("ravi"); // string
        list1.add(true); // Boolean
        System.out.println(list1);

        // problem with heterogeneous
        // 1.runtime errors
//        for(Object obj : list1){
//            Integer i = (Integer) obj;  // here we cannot convert ravi(String) to Integer
//            System.out.println(i);
//        }
        //Exception in thread "main" java.lang.ClassCastException

        // 2. Manual casting earlier we do like this  it is a very long process
        for(Object obj:list1)
        {
            if(obj instanceof Integer)  // instanceof means just checking the object data tyoe
            {
                Integer i=(Integer) obj;
                System.out.println(i);
            }
            if(obj instanceof String)
            {
                String  i=(String) obj;
                System.out.println(i);
            }
            if(obj instanceof Boolean)
            {
                Boolean  i=(Boolean) obj;
                System.out.println(i);
            }

        }

        // TO overcome this problem java 1.5 introduced generics



    }
}
