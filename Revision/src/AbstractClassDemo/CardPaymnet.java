package AbstractClassDemo;

public class CardPaymnet extends Payment{
    @Override
    void pay() {
        System.out.println("Payment Using card");
    }
}
