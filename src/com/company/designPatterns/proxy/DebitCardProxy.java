package com.company.designPatterns.proxy;

public class DebitCardProxy implements BankAccount {

    private SavingAccount savingAccount;

    public DebitCardProxy(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    @Override
    public void debit() {
        if (savingAccount.validate()) {
            savingAccount.debit();
        } else {
            System.out.println("Debit card cannot be used for the transaction.");
        }
    }
}
