// print no from 1 to 10 using thread

class Mythread1 extends Thread{
    @Override
    public void run(){
    for(int i=1;i<=10;i++){
        System.out.println(i);
    }
    }
}
public class HomeworkQuestion {
    public static void main(String[] args) {
    Mythread1 t0 = new Mythread1();
    t0.start();

    }
}
