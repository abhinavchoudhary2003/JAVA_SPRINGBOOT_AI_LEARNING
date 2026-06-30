import java.util.TreeSet;
class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("aa gaya...");
        System.out.println(this.id - o.id);
      return this.id - o.id;  //ascending order
        // return o.id -this.id; // descending order

        //0 == equals
        //1 == this.id > o.id  this.id wala object bad me aa jayega
        //-1 == this.id < o.id this.id wala object pahle aa jayega
    }
}
public class TreeSetBasicDemo {
    public static void main(String[] args) {


        TreeSet<Student> studentsSet=new TreeSet<>();
        Student s1=new Student(3,"rani");
        Student s2=new Student(2,"raja");
       Student s3=new Student(1,"baccha");


         studentsSet.add(s1);
        studentsSet.add(s2);
        studentsSet.add(s3);
        System.out.println(studentsSet);
    }
}


/*
  TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(4440);
        set.add(0);
        set.add(40);
        set.add(440);
         set.add(null); // prints  NullPointerException because TreeSet rejects null specifically because ordering depends on comparison, and you can't compare against (or call a method on) something that doesn't exist.

     //   System.out.println(set);
 */

 /*
  this is the method that compares value and sort in ascending order
  .add()-> Treeset(.put())-> implementations of put()->TreeMap.java


private V put(K key, V value, boolean replaceOld) {
    Entry<K,V> t = root;
    if (t == null) {
        addEntryToEmptyMap(key, value);
        return null;
    }
    int cmp;
    Entry<K,V> parent;
    Comparator<? super K> cpr = comparator;

    if (cpr != null) {
        // Path A: a custom Comparator was provided
        do {
            parent = t;
            cmp = cpr.compare(key, t.key);
            ...
        } while (t != null);
    } else {
        // Path B: no Comparator → use the element's own compareTo()
        Objects.requireNonNull(key);
        Comparable<? super K> k = (Comparable<? super K>) key;
        do {
            parent = t;
            cmp = k.compareTo(t.key);   // ←←← THE LINE YOU WERE LOOKING FOR
            if (cmp < 0) t = t.left;
            else if (cmp > 0) t = t.right;
            else { ... } // duplicate key, update value
        } while (t != null);
    }

    addEntry(key, value, parent, cmp < 0); // insert new node + rebalance tree
    return null;
}
  */

