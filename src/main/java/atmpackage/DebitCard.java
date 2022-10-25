package atmpackage;

public class DebitCard extends Bank {
    int cardNumber = 123456789;

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
