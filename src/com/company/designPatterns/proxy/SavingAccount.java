package com.company.designPatterns.proxy;

public class SavingAccount implements BankAccount {
    private double balance;
    public SavingAccount(Double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean validate() {
        // Validating the account
        return true;
    }

    @Override
    public void debit() {
        // Debiting the account
        balance -= 10;
        System.out.println("Debited 10 TL from the account. New balance is " + balance + " TL");
    }
}
