package model;

public class CurrentAccount extends Account {

    private double overdraft;

    public CurrentAccount(String accountNo, double opening, double overdraft) {
        super(accountNo, opening);
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount) {

        if (balance + overdraft >= amount) {
            balance -= amount;
            return true;
        }

        return false;
    }
}