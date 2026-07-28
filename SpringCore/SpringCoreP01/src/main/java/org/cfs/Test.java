package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       // Here start the  IOC container
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

          // Getting Student object
      Student std=context.getBean(Student.class);
//        std.learning();

        Student std1=context.getBean(Student.class);
  //    System.out.println(std);  // prints org.cfs.Student@15b204a1 when spring bean scope is singleton(by default)
  //    System.out.println(std1); // prints org.cfs.Student@15b204a1 when spring bean scope is  singleton(by default)

   // when bean scope is prototype
        System.out.println(std); // prints rg.cfs.Student@4c1d9d4b (diff address)
        System.out.println(std1);// prints org.cfs.Student@7b227d8d(diff address)
    }
}
