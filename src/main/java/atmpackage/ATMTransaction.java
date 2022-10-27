package atmpackage;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMTransaction {
    String transactionDate;
    int transactionType;


    public static void getLogin() throws IOException {
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        while (!end) {
            try {
                DebitCard db = new DebitCard();
                System.out.println("Enter your Credit Card number : ");
                int cardNumber = sc.nextInt();
                if (cardNumber == db.getCardNumber()) {
                    System.out.println("Enter you PIN : ");
                    int cardPIN = sc.nextInt();
                    if (cardPIN == db.getPin()) {
                        Customer customer = new Customer();
                        System.out.println("Welcome " + customer.getCustomerName());
                        end = true;
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
}
