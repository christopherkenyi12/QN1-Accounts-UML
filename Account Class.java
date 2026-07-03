package model;

public abstract class Account implements Statement {

    protected String accountNo;
    protected double balance;

    public Account(String accountNo, double opening) {
        this.accountNo = accountNo;
        this.balance = opening;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    @Override
    public String generateStatement() {
        return "Account Number: " + accountNo +
               "\nCurrent Balance: " + balance;
    }
}