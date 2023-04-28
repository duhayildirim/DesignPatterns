package com.company.designPatterns.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        // Creating a saving account
        SavingAccount savingAccount = new SavingAccount(1000);

        // Creating a debit card proxy for the saving account
        DebitCardProxy debitCardProxy = new DebitCardProxy(savingAccount);

        // Debiting 10 TL from the account using the debit card proxy
        debitCardProxy.debit();
    }
}
