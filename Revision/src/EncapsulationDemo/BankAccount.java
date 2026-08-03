package EncapsulationDemo;

public class BankAccount {
    public static void main(String[] args) {
        Bank bn = new Bank();
        bn.setAccNo(123456);
        bn.setBalance(234567);
        bn.setIfscCode("PNB24567");
        System.out.println("Bank details: "+bn.getAccNo()+" " +bn.getBalance()+" " +bn.getIfscCode());
    }
}
