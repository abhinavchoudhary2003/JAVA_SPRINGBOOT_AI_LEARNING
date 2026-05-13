package protectedDemoAnother; // 2nd package

import protectedDemo.College;
public class Student extends College { // extend keyword use to create a subclass of 1st package

        void access()
        {
            System.out.println(Announcement);
            rules();
        }

    public static void main(String[] args) {
        new Student().access();
    }

}
