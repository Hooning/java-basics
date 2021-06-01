package com.hooning.classes;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor is created!");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        System.out.print("[depositFunds]");
        System.out.println(amount + " is added to the balance.");
        System.out.println("Current account balance is " + this.balance);
    }

    public void withdrawFunds(BigDecimal amount) {
        System.out.print("[withdrawFunds]");
        if (this.balance.compareTo(amount) > 0) {
            this.balance = this.balance.subtract(amount);
            System.out.println(amount + " is withdrawn. Remaining balance is " + this.balance);
        } else {
            System.out.println("Requested amount for withdraw is bigger than existing account balance");
        }
    }

}
