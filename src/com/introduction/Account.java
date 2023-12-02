package com.introduction;

public class Account {
    private float balance;

    //bundling of data hiding of the data that can be accessed and modified from outside
    public void deposit(float amount){
        if(amount>0){
            balance+=amount;
        }
    }

    public void withDraw(float amount){
        if(amount>0){
            balance-=amount;
        }
    }

    public float getBalance(){
        return balance;
    }
}
