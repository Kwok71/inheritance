package com.kong.inheritance;

import java.lang.annotation.Retention;

public class Account {
    private int id ;
    protected double balance;
    private double annualInterestRate;

    public Account
            (int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }
    public void withdraw(double amount){
        if(this.balance>=amount){
            this.balance = this.balance-amount;
            System.out.println("取款"+amount+"元");
            System.out.println("余额" + this.balance);
        }else {
            System.out.println("余额不足");
        }

    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("存款"+amount+"元");
        System.out.println("余额" + this.balance);
    }

}
