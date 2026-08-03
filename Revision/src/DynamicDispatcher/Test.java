package DynamicDispatcher;

public class Test {
    public static void main(String[] args) {
//        MyChild c = new MyChild();
//        c.m1("Abhi");

//     MyParent p = new MyParent();
//     p.m1("soni");

    MyParent p = new MyChild();
    p.m1();

    }
}

// Note : p.display() shows error because
//MyParent p = new MyChild();
//     ↑              ↑
//reference      actual object
//type            created
//(compile-time)  (runtime)

//p.display();  The compiler checks: "Does the class MyParent have a method called display()?"

// Why p.m1() works fine
//m1() presumably is declared in MyParent (and MyChild overrides it with @Override). Since MyParent has m1(), the compiler is satisfied
