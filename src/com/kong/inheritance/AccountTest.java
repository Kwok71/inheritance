package com.kong.inheritance;


public class AccountTest {
    public static void main(String[] args) {
        CheckAccount cus1 = new CheckAccount(1122,20000,0.045,5000);
        cus1.withdraw(5000);
        System.out.println(cus1.getBalance());
        System.out.println(cus1.getOverdraft());
        cus1.withdraw(18000);
        System.out.println(cus1.getBalance());
        System.out.println(cus1.getOverdraft());
        cus1.withdraw(3000);
        System.out.println(cus1.getBalance());
        System.out.println(cus1.getOverdraft());
    }
}
