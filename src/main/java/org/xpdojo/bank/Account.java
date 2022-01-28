package org.xpdojo.bank;

public class Account {

    int bal;

    public static Account emptyAccount(){
        return new Account();
    }

    private Account(){
        bal=0;
    }

    public int balance() {
        return bal;
    }

    public void deposit(int i) {
        bal = bal + i;
    }

    public void withdraw(int i) {
        bal = bal - i;
    }
}
