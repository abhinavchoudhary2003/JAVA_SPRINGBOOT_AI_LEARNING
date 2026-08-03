public class MethodOverloadingDemo {
  public   int add(int a, int b){
  return a+b;
  }
  public int add(int a, int b,int c){
  return a+b+c;
  }
  public long add(int a,int b,int c, int d){
  return a+b+c+d;
  }

    public static void main(String[] args) {
        MethodOverloadingDemo m1 = new MethodOverloadingDemo();
        System.out.println(m1.add(2,4));
        System.out.println(m1.add(2,4,5));
        System.out.println(m1.add(2,4,5,6)); // here you can see that return type is different but when we are calling the method and passing the arguments return type does not matter

    }

}
