package org.xpdojo.bank;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private int bal;

    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private List<Transaction> transactionList = new ArrayList<>();

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
        transactionList.add(new Transaction(formatter.format(new Date()),"Cr",i,bal));
    }

    public void withdraw(int i) {
        if(bal>=i)
            bal = bal - i;
        transactionList.add(new Transaction(formatter.format(new Date()),"Dr",i,bal));
    }

    public List<Transaction> transactions(){
        transactionList.forEach(transaction -> {
            System.out.println(transaction.date+" "+transaction.operationType+" "+transaction.amount+" "+transaction.balance);
        });
        return this.transactionList;
    }

    private class Transaction{
        String date;
        String operationType;
        int amount;
        int balance;

        Transaction(String date, String operationType, int amount,int balance){
            this.date = date;
            this.operationType = operationType;
            this.amount = amount;
            this.balance = balance;
        }
    }
}
