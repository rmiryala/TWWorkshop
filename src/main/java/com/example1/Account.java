package com.example1;

/**
 * Created by j1012810 on 4/1/2016.
 */
public class Account {


    private String name;
    private Double balance;

    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double amount)throws Exception {
        validateAmt(amount);
        if (this.balance < amount) {
            throw new Exception("Insufficient balanmce");
        }
        this.balance -= amount;
    }

    public void deposit(double amount) {
        validateAmt(amount);
        this.balance += amount;
    }

    public void validateAmt(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }
}
