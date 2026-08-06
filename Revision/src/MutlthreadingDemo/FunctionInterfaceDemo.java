package MutlthreadingDemo;

@FunctionalInterface
interface Calculator{
  int operation(int a,int b);

}
public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Calculator c =(a,b)->{
        return a+b;
        };
        int result = c.operation(10,20);
        System.out.println(result);
    }
}
