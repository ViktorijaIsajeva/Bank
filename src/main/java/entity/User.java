package entity;

import java.util.Scanner;

public class User {

    public String accountNumber;
    private double balance;
    public String name;
    public String gender;

    // code - generate - constructor
    public User(String accountNumber, double balance, String name, String gender) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.gender = gender;
    }

    // helper method, because balance is private
    public double getBalance() {
        return balance;
    }

    // helper method, because balance is private
    public void setBalance (double balance) {
        this.balance = balance;




}

}
