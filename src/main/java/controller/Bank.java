package controller;

import entity.User;

import java.util.Scanner;

public class Bank {

    // here User is a data type (can be int etc) and user is a variable
    private User user;

    //alt enter to import User if error shows
    public String setActiveUser(User user) {
        this.user = user;
        return "user update successful";
    }

    public double getUserBalance() {
        return user.getBalance();

    }

    double amount2;

    public String creditUser(double amount) {
        double newBalance = user.getBalance() + amount;
        this.user.setBalance(newBalance);
        return amount + " euros added to your balance";
    }

    // added

    public String debitUser(double amount) {
        double newBalance = user.getBalance() - amount;
        this.user.setBalance(newBalance);
        return amount + " euros withdrawn from your balance";




    }
}
