import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int a = sc.nextInt();
        System.out.println(a);

        float f = sc.nextFloat(); // nextFloat() means it converts your text to float
        // text is basically that you enter inside the console because console understand everything as a text
        // suppose if we enter 44.5f in a console how console will convert this into float ,console is looking as a text
        System.out.println(f);

        float f1 = 44.5f; // but your jvm can understand this console is not a part of jvm
        System.out.println(f1);





    }
}
