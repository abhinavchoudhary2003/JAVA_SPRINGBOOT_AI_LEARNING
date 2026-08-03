package ConstructorDemo;

public class Test {
    public static void main(String[] args) {
        Employe e1 = new Employe();
        Employe e2 = new Employe(2);
        System.out.println(e2.id);
        Employe e3 = new Employe(3,"Abhi");
        System.out.println(e3.id+ " " +e3.name);
        Employe e4 = new Employe(4,"Amit","CSE");
        System.out.println(e4.id+" "+e4.name+" "+e4.dept);
    }
}
