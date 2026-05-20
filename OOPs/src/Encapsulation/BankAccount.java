package Encapsulation;

public class BankAccount {
    public static void main(String[] args) {
        Bank bn = new Bank();
        bn.setAccNo(12356);
        System.out.println(bn.getAccNo());

    }
}
