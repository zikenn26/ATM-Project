package atmpackage;


import java.util.HashMap;
import java.util.Map;

public class BankDataBase implements ATMInterface{
    static BankDataBase obj = new BankDataBase();
    private BankDataBase() {
    }
    public static BankDataBase getInstance() {
        return obj;
    }
    public Map<Integer, Account> getDataBase(){
        Map<Integer, Account> data = new HashMap<>();
        data.put(234567, new Account(234567,1234, 654321, 2000,"Kumar"));
        data.put(123456, new Account(123456,2345, 654321, 2000,"Gulshan"));
        data.put(345678, new Account(345678,3456, 654321, 2000,"Nayak"));
        return data;
    }
}
