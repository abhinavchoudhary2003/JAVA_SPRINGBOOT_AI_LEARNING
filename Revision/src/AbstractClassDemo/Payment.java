package AbstractClassDemo;

public abstract class Payment {
  int a;
  Payment(){
      System.out.println("Constructor....");
  }
  abstract void pay();

  public void inVoice(){
      System.out.println("Bill Generated...");
  }
}
