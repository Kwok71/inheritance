package com.kong.inheritance;

public class CheckAccount extends Account {
    private double overdraft;
    public CheckAccount
            (int id, double balance, double annualInterestRate,double overdraft ){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }
    @Override
    public void withdraw(double amount){
        if(amount<=this.balance){
            super.withdraw(amount);
        }
        else{
            double touzhi = amount - this.balance;
            if(this.overdraft>=touzhi){
                balance=0;
                overdraft = overdraft - touzhi;
            }else{
                System.out.println("超过透支额度");
            }
        }
    }

    public double getOverdraft() {
        return overdraft;
    }
}
