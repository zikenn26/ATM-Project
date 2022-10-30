package atmpackage;

public class Account{
//    private final int customerNumber;
    private final int pinNumber;
    private final int IFSC;
    private double checkingBalance = 0;
//    private String customerName;
    Customer customer = new Customer();

    public Account(int customerNumber, int pinNumber, int IFSC, double checkingBalance, String customerName) {
//        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.IFSC = IFSC;
        this.checkingBalance = checkingBalance;
        customer.setCustomerName(customerName);
    }
    public Account(DebitCard db, int pinNumber, int IFSC, double checkingBalance, String customerName) {
//        this.customerNumber = customerNumber;
//        this.customerNumber = db.getCardNumber();
        this.pinNumber = pinNumber;
        this.IFSC = IFSC;
        this.checkingBalance = checkingBalance;
        customer.setCustomerName(customerName);
    }

//    public int getCustomerNumber() {
//        return customerNumber;
//    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int getIFSC() {
        return IFSC;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

//    public String getCustomerName() {
//        return customerName;
//    }
}
