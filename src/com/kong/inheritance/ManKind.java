package com.kong.inheritance;

public class ManKind {
    int sex=1;
    int salary=0;
    public void manOrWoman(){
        if(this.sex==1){
            System.out.println("man");
        }
        else{
            System.out.println("woman");
        }
    }
    public void employeed(){
        if(this.salary==0){
            System.out.println("no job");
        }
        else{
            System.out.println("job");
        }
    }

}
