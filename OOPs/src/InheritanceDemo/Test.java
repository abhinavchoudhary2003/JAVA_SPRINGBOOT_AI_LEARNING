package InheritanceDemo;

public class Test {
    public static void main(String[] args) {
        Raju r = new Raju();

      //  Here you can see that raju child class can access all properties from parent class
        System.out.println(r.khet);
        r.gold();
        r.plot();

        Hariya h = new Hariya();
      // But when parent class access properties from child class it shows error
      // So Inheritance property works only for parent to child not child to parent
      //  h.diamond(); // shows error



        Priya p = new Priya();
        // Single level Inheritance
        // from parent class
        p.diamond();
        // Multilevel Inheritance
        // from grandparent class
        p.gold();
        p.plot();



//        Thomas t = new Thomas();
//        t.house();
    }
}
