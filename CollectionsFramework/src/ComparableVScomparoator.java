

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee implements Comparable<Employee> { // comparable
//class Employee { // comparator
    int id;
    String name;
    int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

   // comparable
    @Override
    public int compareTo(Employee o) {
       return o.id - this.id; //descending
        //  return this.id - o.id;//  ascending

    }
}

 // comparator
class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
      //  return o2.id-o1.id; // decreasing
        return o1.id - o2.id ;// ascending
    }
}
public class ComparableVScomparoator {
    public static void main(String[] args) {

     //Map<Employee,String> map = new TreeMap<>(new MyComparator()); // comparator

       Map<Employee,String> map = new TreeMap<>();  // comparable
        map.put(new Employee(1,"Raj",10001),"RAJ");
        map.put(new Employee(4,"Amit",34344),"Amit");
        map.put(new Employee(2,"Ajay",232323),"Ajay");
        map.put(new Employee(6,"Hari",390090),"Hari");
        System.out.println(map);

    }
}

// In this code w e can see that both comparable and comparator can do the same work
// we can sort ascending and descending with the help of comparable there is no fixed that comparable do only sorting in ascending , by default it is ascending but we can do descending as well
// Then what is the difference between comparable and comparator read the notes .



/* Doubt why we can't write like this
Class Employee implements Comparator<Employee>
1. The Design Problem: Why Employee shouldn't be the Comparator
If you make Employee implements Comparator<Employee>, you force an individual Employee object to act as the "outside judge" comparing two other employees.

To use it in your TreeMap, you would have to write weird code like this:

// This looks very strange because you need a "dummy" employee just to act as the sorting tool
Map<Employee, String> map = new TreeMap<>(new Employee(0, "", 0));
It mixes up the responsibilities of your code. An Employee should just hold employee data, not handle sorting logic.

2. The Solution: Comparable vs. Comparator
Java gives you two distinct tools for sorting, and they have very different purposes.

Approach A: Use Comparable for Default Sorting
If an Employee should always be sorted by their id by default, make the Employee class implement Comparable (with an a). This means "I know how to compare myself to another employee."

Java
class Employee implements Comparable<Employee> {
    int id;
    String name;
    int sal;

    // ... constructor ...

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id; // Ascending order
    }
}
How to use it: If you do this, you don't need MyComparator at all. You can just declare your map normally, and TreeMap will automatically use that compareTo method:

Java
Map<Employee, String> map = new TreeMap<>(); // No arguments needed!
Approach B: Use Comparator for Custom/Multiple Sorting Rules
Your separate MyComparator class is perfect when you want flexibility. What if tomorrow your boss says, "Hey, I need a map sorted by Salary instead of ID"?

If you used Comparable, you are stuck. But with Comparator, you can just spin up a second judge:


class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.sal - o2.sal; // Sorts by salary instead!
    }
}

 */
