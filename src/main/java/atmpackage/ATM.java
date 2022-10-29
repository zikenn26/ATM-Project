package atmpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class ATM extends Bank {
//    String location;

    public static void main(String[] args) throws IOException {
        Map<Integer, Account> data = new HashMap<>();
        data.put(123456, new Account(123456,1234,654321, 2000, "Gulshan"));


        introduction();
        dashBoard(data);
//        menu();
    }

    public static void introduction(){
        System.out.println("Welcome to the ATM");
    }
    public static void dashBoard(Map<Integer, Account> data){
        Scanner sc = new Scanner(System.in);
//        BankDataBase db = BankDataBase.getInstance();
        ATMTransaction at = new ATMTransaction();

        boolean end = false;
        while (!end) {
            try {
                System.out.println("\n0 - Exit");
                System.out.println("1 - Login");
                System.out.println("2 - Create Account");
                System.out.print("\nChoice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 0 -> exit(0);
                    case 1 -> {
//                        ATMTransaction.getLogin(data);
                        at.getLogin(data);
                        menu();
                        end = true;

                    }
                    case 2 -> {
//                        ATMTransaction.createAccount();
                        at.createAccount(data);
                        at.getLogin(data);
                        end = true;
                    }
                    default -> System.out.println("\nInvalid Choice.");
                }
            } catch (InputMismatchException | IOException e) {
                System.out.println("\nInvalid Choice.");
                sc.next();
            }
        }
        System.out.println("\nThank You for using this ATM.\n");
        sc.close();
        exit(0);
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            try {
                System.out.println(" Type 0 - Exit");
                System.out.println(" Type 1 - View Balance");
                System.out.println(" Type 2 - Withdraw Funds");
                System.out.println(" Type 3 - Deposit Funds");
                System.out.println(" Type 4 - Transfer Funds");
                System.out.println(" Type 5 - PIN Change");
                System.out.print("\nChoice: ");

                int selection = sc.nextInt();

                switch (selection) {
                    case 0 -> end = true;
//                    case 1 -> viewBalance(acc);
//                    case 2 -> withdrawal(acc);
//                    case 3 -> deposit(acc);
                    case 4 -> System.out.println("Transfer section not yet developed");
//                        Transfer Funds
//                    case 5 -> pinChange(acc);
                    default -> System.out.println("\nInvalid Choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice.");
                sc.next();
            }
        }
    }

}
