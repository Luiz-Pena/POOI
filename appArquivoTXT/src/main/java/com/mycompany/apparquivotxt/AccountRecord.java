/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apparquivotxt;

/**
 *
 * @author luizh
 */
public class AccountRecord {
    private int account;
    private String firstName;
    private String lastName;
    //private double balance;
    private int balance;
    
    public AccountRecord (){
        account = 0;
        firstName = "";
        lastName = "";
        balance = 0;
    }
    
    public AccountRecord (int account, String firstName, String lastName, int balance){
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
