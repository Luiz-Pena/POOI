/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appguitxt;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luizh
 */
public class CreateTextFile {
    private Formatter output;
    
    public boolean openFile (){
        try {
            output = new Formatter("clientes.txt");
        } catch (FileNotFoundException ex) {
            return false;
        } catch (SecurityException ex1) {
            return false;
        }
        return true;
    }
    
    public int addRecords(int Account, String FirstName, String LastName, int Balance){
        
        AccountRecord record = new AccountRecord();
            
        record.setAccount(Account);
            
        if (record.getAccount() < 0){
            return -1;
        }   
        
        record.setFirstName(FirstName);
            
        record.setLastName(LastName);
            
        record.setBalance(Balance);
             
        try {
            output.format ("%d %s %s %d\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance()); 
        } catch (FormatterClosedException ex1) {
            return -2;
        }
        
        return 1;
    }
    
    public int closeFile (){
        if (output != null) {
            output.close();
            return 1;
        }
        else return 0;
        
    }
}
