package OverloadingDemo;

public class OverLoading {

    public  static int add(int a,int b)
    {
        return a + b;

    }
    public  static int add(int a,int b , int c){
        return a + b + c;

    }

    public  static void print(){
        System.out.println("hello");
    }

    public  static void print(String name){
        System.out.println(name);
    }
}
