package ExceptionDemo;

public class inputException {
    public static void main(String[] args) {

     String s1 = "1234s";
       String s2 = "1234"; // without exception
     try {
        // int value = Integer.parseInt(s1); // exception
        int value1 = Integer.parseInt(s2); // no exception
//         System.out.println("parsed value: "+ value);
         System.out.println("parsed value: "+ value1);
     } catch (NumberFormatException e) {
//         System.out.println("Invalid num: "+s1);
         System.out.println("Invalid num: "+s2);

     }

    }
}
