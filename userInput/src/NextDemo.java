import java.util.Scanner;

public class NextDemo {
    public static void main(String[] args) {


        // Difference between next() and nextLIne()

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.next(); // /n internally
        System.out.println(name);

        System.out.println("enter full name");
        String fullName = sc.nextLine();
        System.out.println(fullName);
    }
}
