package Encapsulation;

public class Bank {
    // Data means variables and controlling access
    private int accNo;
    private double bal;
    private  double ifscCode;

    // getter methods
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBal() {
        return bal;
    }
   // Setter methods
    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(double ifscCode) {
        this.ifscCode = ifscCode;
    }

    // advance
    // Validation
//    Bank(int accNo , double bal){
//           /* if(accountNumber<=0) {
//            throw new IllegalAccessException("Invalid account number");
//        }
//        if(bal<0)
//        {
//            throw new IllegalAccessException("Negative balance");
//        }*/
//
//
//        this.accNo=accNo;
//        this.bal=bal;
//    }
}
