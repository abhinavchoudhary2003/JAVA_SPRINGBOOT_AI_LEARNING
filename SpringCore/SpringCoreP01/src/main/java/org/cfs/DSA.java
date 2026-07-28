package org.cfs;

public class DSA implements Course {
    // Create Default constructor no need here because internally default constructor is already present (because we did not create any parametrized constructor) but for better understanding we create a default constructor
   DSA()
   {
       System.out.println("DSA default constructor....");
   }

    @Override
    public void start() {
        System.out.println("DSA journey started...");
    }
}
