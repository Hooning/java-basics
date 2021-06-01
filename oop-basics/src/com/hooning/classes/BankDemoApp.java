package com.hooning.classes;

import java.math.BigDecimal;

public class BankDemoApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234-124124-124124");
        account.setCustomerName("David Cho");
        account.setEmail("david.hoontime@gmail.com");
        account.setBalance(BigDecimal.valueOf(1495200.00));

        System.out.println("== This back account is for " + account.getCustomerName() + " ==");
        account.depositFunds(BigDecimal.valueOf(1200.00));
        account.withdrawFunds(BigDecimal.valueOf(230000.00));
    }

}
