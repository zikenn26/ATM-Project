package atmpackage;

import java.util.HashMap;
import java.util.Map;

public class DebitCard  {
    private int card_number;
    private String expiry_date;
    private int CVV;
    private int pin;
    public int getPin() {
        return pin;
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

    public DebitCard(int card_number, int pin) {
        this.card_number = card_number;
        this.pin = pin;
    }
}
