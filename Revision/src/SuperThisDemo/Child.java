package SuperThisDemo;
class parent{
 String name;
 public void details(){
     System.out.println(name.toUpperCase());
 }
 parent(){
     System.out.println("parent class Default constructor");
 }
}
public class Child extends parent {
String name;


    public void details() {
        super.name = "parent"; // here we initialise parent class instance var(name)
        this.name = "child"; // here we initialise current class instance var
        System.out.println(super.name+"and"+name);
        super.details();
    }
    Child(){
   // this();// shows error because this() and super() cannot be first statement in a constructor internally child constructor calls first super()
       // this(name); //name here is an instance variable of Child. And the rule says: the arguments inside this(...)/super(...) cannot reference instance variables or instance methods, because the object isn't initialized yet at that point
      this("Abhinav"); // this("Abhinav") passes a literal
        System.out.println("child class constructor");
    }
    Child(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.details();
    }
}
