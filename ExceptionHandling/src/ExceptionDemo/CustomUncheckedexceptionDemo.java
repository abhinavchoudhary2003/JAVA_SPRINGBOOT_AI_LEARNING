package ExceptionDemo;

public class CustomUncheckedexceptionDemo {
  static int bal = 10000;

    public static void main(String[] args) {
      withDraw(50000);
    }
    public static void withDraw(int amount){
    if(amount>bal){
        throw new LowBalanceException("insufficient Balnace");
    }
        System.out.println("withdrawal successful, New bal :"+(bal-amount));
    }
}
class LowBalanceException extends RuntimeException{
 public LowBalanceException(String message){
   super(message);
  }

}
