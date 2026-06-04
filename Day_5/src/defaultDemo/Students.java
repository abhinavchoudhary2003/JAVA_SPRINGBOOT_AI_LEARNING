package defaultDemo;
// Default modifier works within the same package only but not outside the package
public class Students {
 public static void main(String[] args) {
        CollegeOffice o=new CollegeOffice();
        System.out.println(o.internalNotice);
    }
}
