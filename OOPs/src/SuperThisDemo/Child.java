package SuperThisDemo;

class Parent{
    String name;

    public void details(){
        System.out.println(name.toUpperCase());
    }

    Parent(){
        System.out.println("parent constructor");
    }
}
public class Child extends Parent {
   String name;

   // override the parent class
    public void details() {
        super.name = "parent"; //
        this.name = "child";
        System.out.println(super.name +" and "+name);
        super.details();
    }
    // Default child class constuctor
    Child()
   {
       // super(); // Internally jvm call this because when a child class inherits from a parent class, the child class constructor automatically refers to the parent class constructor.
       // because the parent part of the object must be initialized before the child part.
       this("Abhinav");
       System.out.println("child constructor");
    }

    Child(String name)
    {
      //   super(); here jvm internally calls super() as well

        System.out.println(name);
    }


    public static void main(String[] args) {
      // Here you can see that we do not create a parent class object but still it calls parent class default constructor.
        // because child class constructor always refers parent class constructor first // jvm internally call super() first in child class constructor
      Child c = new Child();
      c.details();


    }
}
