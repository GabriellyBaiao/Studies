package br.com.vivo.entities;

public class Account {

    private int number;
    private String holder;
    protected double balance;

    public Account(){

    }

    public Account(int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public String getHolder(){
        return holder;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

