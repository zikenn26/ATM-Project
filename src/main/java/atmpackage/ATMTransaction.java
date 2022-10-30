package atmpackage;

import java.util.Random;
import java.io.IOException;
import java.util.*;

public class ATMTransaction implements ATMInterface{
    Scanner sc = new Scanner(System.in);

    public void getLogin(Map<Integer, DebitCard> debitCard) throws IOException {
//        Map<Integer, Account> data = new HashMap<>();
//        data.put(123456, new Account(123456,1234,"Savings", 654321, 2000,"Gulshan"));
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        while (!end) {
            try {
//                DebitCard db = new DebitCard();
                System.out.println("Enter your Credit Card number : ");
                int cardNumber = sc.nextInt();
                System.out.println("Enter your Pin Number : ");
                int pinNumber = sc.nextInt();
                for (Map.Entry<Integer, DebitCard> dbEntry : debitCard.entrySet()) {
                    DebitCard db = dbEntry.getValue();
                    if (debitCard.containsKey(cardNumber) && (pinNumber == db.getPin())) {
                        System.out.println("Details Found!!");
//                        System.out.println("Welcome "+ acc.getCustomerName());
                        end = true;
                        break;
                    }
                }
                if (!end) {
                    System.out.println("\nWrong Customer AccountNumber or Pin");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Character(s). Only Numbers.");
            }
        }
    }
    public void createAccount(Map<Integer, Account> data) throws IOException {
        int accountNumber = 0;
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nEnter your customer number ");
                accountNumber = sc.nextInt();
                Iterator it = data.entrySet().iterator();

                while (it.hasNext()) {
                    if (!data.containsKey(accountNumber)) {
                        end = true;
                        break;
                    }
                }
                if (!end) {
                    System.out.println("\nThis customer number is already registered");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice.");
                sc.next();
            }
        }
        sc.nextLine();
        Random random = new Random();
        int cardNumber = random.nextInt(999999);
        int ifsc = random.nextInt(999999);
        int balance = 0;
        System.out.println("\nEnter your name");
        String customerName = sc.nextLine();
        System.out.println("\nEnter PIN to be registered");
        int pin = sc.nextInt();
        data.put(cardNumber, new Account(cardNumber, pin , ifsc , balance , customerName));
        System.out.println("\nYour new account has been successfully registered!");
        System.out.println("Dear " + customerName + ", your account details are as follows :\nCardNumber : "+ cardNumber + "\nIFSC : " + ifsc + "\nBalance : 0");
        System.out.println("\nRedirecting to login.............");
        getLogin();
    }
}
