package Generic;

public class Main {
    public static void main(String[] args) {
    // one more benefit reusability of code
  Gift<Integer> intGift = new Gift<>();
        intGift.setValue(1000);
        System.out.println(intGift.getValue());

   Gift<String> stringGift = new Gift<>();
   stringGift.setValue("GoldChain");
        System.out.println(stringGift.getValue());



    }
}
