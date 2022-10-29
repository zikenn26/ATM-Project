package atmpackage;


import java.util.HashMap;
import java.util.Map;

public class BankDataBase extends DebitCard implements ATMInterface{
    static BankDataBase obj = new BankDataBase();

    private BankDataBase() {
    }

    public static BankDataBase getInstance() {
        return obj;
    }
//    DebitCard db = new DebitCard();
//    db.getCardNumber();
    public void getDataBase(){
        Map<Integer, Account> data = new HashMap<>();
        data.put(123456, new Account(123456,1234, 654321, 2000,"Gulshan"));
    }

}
