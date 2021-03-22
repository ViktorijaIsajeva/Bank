import controller.Bank;
import entity.User;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user = new User("039403929", 12.00, "James Bond", "MALE");

        Bank bank = new Bank();
        bank.setActiveUser(user);

        System.out.println("Welcome to bank X");

        // new

      Scanner scanner = new Scanner(System.in);
        System.out.println("User ID");
        int userID = scanner.nextInt();
        System.out.println("Password");
        int password = scanner.nextInt();

        if (userID != 123 || password != 123) {
           System.out.println("Sign in failed");}
        else {
            System.out.println("Welcome, " + user.name );
            System.out.println("Current balance is " + bank.getUserBalance() + " euros\n");

        //
            // System.out.println("Current balance " + bank.getUserBalance() + " euros");

        String response = bank.creditUser(1);
        System.out.println(response);
        System.out.println("Current balance is " + bank.getUserBalance() + " euros");

        String response2 = bank.debitUser(13);
        if (bank.getUserBalance() < 0) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println(response2);
            System.out.println("Current balance is " + bank.getUserBalance() + " euros");}
        }
    }
}

