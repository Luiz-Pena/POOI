/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appfileserializado;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luizh
 */
public class WriteRandomFile {
    private static final int NUMBER_RECORDS = 100;
    private RandomAccessFile output;
    
    public boolean openFile (){
        try {
            output = new RandomAccessFile ("clients.dat", "rw");
            
            return true;
        } catch (IOException ex) {
            //System.out.println("Erro ao abrir o arquivo");
            
            return false;
        }
    }
    
    public boolean closeFile (){
        try {
            if (output != null) {
                output.close();
                return true;
            }
            return true;
            
        } catch (IOException ex) {
            //System.out.println("Erro ao fechar o arquivo!");
            
            return false;
        }
    }
    
    public int writeFile (int account, String firstName, String lastName, double balance){
        if (account < 0 && account > NUMBER_RECORDS) 
            return -1;
        
        try {
            RandomAcessAccountRecord registro = new RandomAcessAccountRecord();
        
            registro.setAccount(account);
            registro.setFirstName(firstName);
            registro.setLastName(lastName);
            registro.setBalance(balance);
            
            output.seek((account-1)*RandomAcessAccountRecord.SIZE);
            
            registro.write(output);
            
            return 0;
        } catch (IOException ex) {
            //System.out.println("Erro ao gravar o registro!");
            
            return 1;
        } catch (NoSuchElementException ex) {
            //System.out.println("Entrada inválida!");
            
            return 2;
        }
        /*try {
            RandomAcessAccountRecord registro = new RandomAcessAccountRecord();
            Scanner input = new Scanner (System.in);
            
            int account;
            
            System.out.printf("%-10s%-15s%-15s%10s\n", "Account", "FistName", "LastName", "Balance");
            
            do {
                account = input.nextInt();
                
                if (account < 0 && account > NUMBER_RECORDS)
                    System.out.println("Account presa ser maior que 0 e menor que 100");
                else 
                    break;
             } while (true);
            
            registro.setAccount(account);
            registro.setFirstName(input.next());
            registro.setLastName(input.next());
            registro.setBalance(input.nextDouble());
            
            output.seek((account-1)*RandomAcessAccountRecord.SIZE);
            
            registro.write(output);
        } catch (IOException ex) {
            System.out.println("Erro ao gravar o registro!");
            return;
        } catch (NoSuchElementException ex) {
            System.out.println("Entrada inválida!");
        }
    \*/}
}
