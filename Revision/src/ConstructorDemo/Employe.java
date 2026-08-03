package ConstructorDemo;

public class Employe {
  int id;
  String name;
  String dept ;

  Employe(){
      System.out.println("Developer Default constructor");
  }
  Employe(int id){
      this.id = id;

  }
  Employe(int id, String name){
  this.id = id;
  this.name = name;
  }
  Employe(int id, String name, String dept){
   this.id = id;
   this.name = name;
   this.dept = dept ;
  }
}
