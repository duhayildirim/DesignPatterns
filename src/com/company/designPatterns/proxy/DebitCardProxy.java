package com.company.designPatterns.proxy;

public class DebitCardProxy implements BankAccount {

    SavingAccount savingAccount = new SavingAccount();

    public DebitCardProxy() {

    }
    @Override
    public void debit() {

    }
}
