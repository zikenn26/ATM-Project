package atmpackage;

public class Account {
    private final int customerNumber;
    private String account_type;
    private String IFSC;
    private double checkingBalance = 0;


    //    Constructor to enter some pre-defined account details
    public Account(int customerNumber, double checkingBalance, String customerName) {
        this.customerNumber = customerNumber;
        this.checkingBalance = checkingBalance;
    }
    public Account(int customerNumber, int pinNumber) {
        this.customerNumber = customerNumber;
    }

}
