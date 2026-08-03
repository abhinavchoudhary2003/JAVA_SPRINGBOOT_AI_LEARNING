public class ObjectCreationDemo {
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        sd.id = 12;
        sd.name = "Abhinav";
        sd.displayInfo();
    }
}

class StudentDetails{
    int id;
    String name;
    void displayInfo(){
        System.out.println("Student Information: "+id +" -> "+ name );

    }
}