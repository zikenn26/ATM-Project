package atmpackage;

public class DebitCard extends Bank {
    private int cardNumber;
    private String expiry;
    private int CVV;


    private int pin;
    public int getPin() {
        return pin;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    String expireDate;

    public String getExpireDate() {
        return expireDate;
    }
}
