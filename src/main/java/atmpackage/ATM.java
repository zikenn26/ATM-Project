package atmpackage;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class ATM extends Bank {
//    String location;

    public static void main(String[] args) throws IOException {
        introduction();
        Scanner sc = new Scanner(System.in);


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
                        ATMTransaction.getLogin();
                        end = true;
                    }
                    case 2 -> {
//                        createAccount();
                        end = true;
                    }
                    default -> System.out.println("\nInvalid Choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice.");
                sc.next();
            }
        }
        System.out.println("\nThank You for using this ATM.\n");
        sc.close();
        exit(0);
    }

    public static void introduction(){
        System.out.println("Welcome to the ATM");
    }

}
