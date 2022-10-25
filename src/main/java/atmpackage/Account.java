package atmpackage;

public class Account {
    private final int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private String customerName;


    //    Constructor to enter some pre-defined account details
    public Account(int customerNumber, int pinNumber, double checkingBalance, String customerName) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.checkingBalance = checkingBalance;
        this.customerName = customerName;
    }
    public Account(int customerNumber, String customerName, int pinNumber) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.pinNumber = pinNumber;
    }

}
