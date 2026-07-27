package TightCoupking;

public class Student {
 // Here Student class needs DsaCourse class it means Student class depends on DsaCourse class , so DsaCourse class is Dependency
 DsaCourse Dsa = new DsaCourse(); // tight coupling  Here DsaCourse is tightly coupled with Student class means DsaCourse is directly associated with student
  void start(){
   Dsa.learn();
  }
}


// Tight Coupling : when two or more classes completely dependent on each other. If one class failed then other classes will also failed


