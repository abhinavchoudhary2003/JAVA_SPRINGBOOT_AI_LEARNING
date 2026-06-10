package ExceptionDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        //    readFile(); // 1st way
        // 2nd way by using throws keyword
         try{
             readFile();
         } catch (IOException e) {
             System.out.println("file not found");
         }

    }

    // Here not any method (means no catch block is present ) is handling the exception so it is handled by Default Exception handler
    // and  exception object is created by jvm
//    public static void main(String[] args) throws IOException {
//
//    m1();
//
//    }
//    public static void m1() throws IOException{
//     m2();
//    }
//    public static void m2() throws IOException{
//     readFile();
//    }



    public static void readFile() throws IOException{
         // Second way
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line = br.readLine();
        System.out.println("file found");
        System.out.println("first line :"+ line);
        br.close();

      // 1st way to handle exception
      // Here readFile() method handle exception where the catch block is present that method is handle the exception
      // and exception object is created by jvm automatically
   /*    try {
           BufferedReader br = new BufferedReader(new FileReader("data1.txt"));
           String line = br.readLine();
           System.out.println("first line :"+ line);
           br.close();

       }
       catch (FileNotFoundException e) {
           System.out.println("file not found");
       }
       catch (IOException e) {
           System.out.println("file read exception");
       }

  */

    }
}
