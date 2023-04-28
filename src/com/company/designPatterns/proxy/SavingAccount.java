package com.company.designPatterns.proxy;

public class SavingAccount implements BankAccount {

    public SavingAccount() {

    }

    public boolean validate() {
        return true;
    }

    @Override
    public void debit() {

    }
}
