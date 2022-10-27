package atmpackage;

public class DebitCard extends Bank {
    private int card_number;
    private String expiry_date;
    private int CVV;


    private int pin;
    public int getPin() {
        return pin;
    }

    public DebitCard() {
    }

    public int getCardNumber() {
        return card_number;
    }

    public void setCardNumber(int cardNumber) {
        this.card_number = cardNumber;
    }


    public String getExpireDate() {
        return expiry_date;
    }
}
