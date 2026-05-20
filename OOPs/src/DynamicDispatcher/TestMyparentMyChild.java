package DynamicDispatcher;

public class TestMyparentMyChild {
    public static void main(String[] args) {
//        MyChild c = new MyChild();
//        c.m1();

//        MyParent p = new MyParent(); // L.H.S = R.H.S
//        p.m1();
//       //p.display(); // show error

        MyParent c1 = new MyChild(); // L.H.S != R.H.S Humesha Rhs vale ka object bnta hai and uske method check hote hai
        c1.m1();


//        MyChild c2 = new MyParent(); not possible
    }
}
