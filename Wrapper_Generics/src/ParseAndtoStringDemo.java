public class ParseAndtoStringDemo {
    public static void main(String[] args) {

         // parse converting string to corresponding primitive
        int i3=Integer.parseInt("10");
        System.out.println(i3);

        boolean b=Boolean.parseBoolean("ravi"); // bydefault it is false
        System.out.println(b);

        // toString()
//        int a = 10;  not possible we can't directly convert  into string
//        int b = a.toString();

         int a =10;
         String s = String.valueOf(a); // convert to string
        System.out.println(s);

        Integer  i = 20;
        String s1 = i.toString();
        System.out.println(s1);





    }
}
