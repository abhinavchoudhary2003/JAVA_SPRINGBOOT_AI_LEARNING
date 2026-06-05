public class EqualsDemo {
    public static void main(String[] args) {

     /* Difference between  == and equals()
      In primitive Data type, == use for content comparison
      In object , == use for reference(means) comparison
      in object only, .equals() use for content comparison



     */
        int a =10;
        int b =20;
        int c = 10;
        System.out.println(a==b); // false
        System.out.println(a==c); // true

        String s1 = "ashwani";
        String s2 = "java";
        String s3 = "java";
        System.out.println(s1.equals(s2));// false
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3==s2);// true

        String s4 = new String("CFS");
        String s5 = new String("CFS");
        System.out.println(s4.equals(s5)); // true
        System.out.println(s4==s5); // false
    }
}
