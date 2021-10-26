package com.kong.inheritance;

public class Kids extends ManKind {
    int yearsOld;
    public void printAge(){
        System.out.println(this.yearsOld);
    }

    public void employeed(){
        super.employeed();
        System.out.println("but Kids should study and no job.");
    }
}
