package com.atguigu.banking;

public class Account {
    private double balance;
    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        this.balance = this.balance +amt;
    }

    public void withdraw(double amt){//amt：要取的额度
        if(balance >= amt){
            balance -= amt;
        }else{
            System.out.println("余额不足！");
        }
    }
}
