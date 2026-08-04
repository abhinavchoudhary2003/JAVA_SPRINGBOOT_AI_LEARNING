package AbstractClassDemo;

public class InternetBanking extends Payment{
    @Override
    void pay() {
        System.out.println("Payment Using Internet");
    }
    void anything(){
        System.out.println("anything");
    }
}
