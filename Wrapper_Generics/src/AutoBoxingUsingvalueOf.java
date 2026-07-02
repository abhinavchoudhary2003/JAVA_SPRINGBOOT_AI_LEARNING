
public class AutoBoxingUsingvalueOf {

    public static void main(String[] args) {
       // brfore java 9 we can write like this Integer i1 = 10;
       // Integer i1=new Integer(10); now it is deprecated
        Integer i1 = 10; // Internally , java compiler actually compiles it to: Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        int a=100; // primitive
        Integer b=a; //autoboxing internally it uses this , Integer.valueOf(a) for converting to wrapper object
        System.out.println(b);






        // All wrapper classes contain two constructor one take normal value  is normal and another one is string
        // but character class having 1 constructor only


  // NOte : Starting from Java 9, all of these primitive wrapper constructors (like new Integer() and new Character())
  // have been deprecated (marked for future removal).
//        Integer i=new Integer(10);
//        Integer i2=new Integer("12");

//        Character cc=new Character('1');
//
//        Float f1=new Float(10.5f);
//        Float f2=new Float("12.5f");
//        Float f3=new Float(19.2);
//        //String float, double
//
//        //Boolean is having 2 consturtor
//        Boolean b1=new Boolean(true);
//        Boolean b2=new Boolean("TRue");
//        Boolean b3=new Boolean("TRUe");
//        Boolean b4=new Boolean("TRUr");
//        Boolean b5=new Boolean("ravi"); // false because default value is false
//        Boolean b6=new Boolean("yes");
//        Boolean b7=new Boolean("no");
//
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//        System.out.println(b5);
//        System.out.println(b6);
//        System.out.println(b7);
    }
}
