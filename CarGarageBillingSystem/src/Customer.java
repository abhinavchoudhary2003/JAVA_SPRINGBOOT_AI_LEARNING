public class Customer {
    // Instance variables
    String name;
  String carNumber;
  String carType;

    // constructor
    public Customer(String name, String carNumber, String carType) {
        this.name = name;
        this.carNumber = carNumber;
        this.carType = carType;
    }

    // getter and setter method
//    Getter used for - reads/returns a value
//    Setter used for - writes/updates a value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
