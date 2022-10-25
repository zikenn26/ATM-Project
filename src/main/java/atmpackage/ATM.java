package atmpackage;

import java.io.IOException;
import java.util.Scanner;

public class ATM extends Bank{
    String location;

    public static void main(String[] args) throws IOException {
        introduction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Card Number : ");
        int cardNumber = sc.nextInt();
        
    }

    public static void introduction(){
        System.out.println("Welcome to the ATM");
    }

}
