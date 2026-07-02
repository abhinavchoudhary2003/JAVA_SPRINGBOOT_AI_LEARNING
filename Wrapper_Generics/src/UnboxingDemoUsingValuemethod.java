public class UnboxingDemoUsingValuemethod {
    public static void main(String[] args) {
    Integer a = 200;
    int b = a.intValue(); // unboxing  we can write like this int b =a; because internally java compiles like this int b = a.intValue();
        System.out.println(b);



        Character c1='a';
        char c=c1.charValue(); // char c = c1; unboxing
        System.out.println(c);
    }
}
