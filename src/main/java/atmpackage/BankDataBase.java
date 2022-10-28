package atmpackage;


import java.util.HashMap;
import java.util.Map;

public class BankDataBase extends Account {
    static BankDataBase obj = new BankDataBase();

    private BankDataBase() {
    }

    public static BankDataBase getInstance() {
        return obj;
    }

    Map<Integer, Account> data = new HashMap<>();


}
