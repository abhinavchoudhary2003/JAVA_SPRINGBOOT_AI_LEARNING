package org.cfs;

public class SpringBoot implements  Course{
   // Create Default constructor no need here because internally default constructor is present (we did not create any parametrized constructor) but for better understanding we create a default constructor
    SpringBoot(){
        System.out.println("SpringBoot default constructor....");
    }
    @Override
    public void start() {
        System.out.println("SpringBoot journey started....");
    }
}
