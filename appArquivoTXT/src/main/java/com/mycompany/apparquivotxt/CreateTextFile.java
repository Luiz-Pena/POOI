/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apparquivotxt;

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
    
    public void openFile (){
        try {
            output = new Formatter("clientes.txt");
        } catch (FileNotFoundException ex) {
            System.out.println ("Erro: "+ex);
        } catch (SecurityException ex1) {
            System.out.println ("Erro: "+ex1);
        }
    }
    
    public void addRecords(){
        int cont = 0;
        AccountRecord record = new AccountRecord();
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Numero da Conta: ");
            record.setAccount(input.nextInt());
            
            System.out.println("Primeiro Nome: ");
            record.setFirstName(input.next());
            
            System.out.println("Ultimo Nome: ");
            record.setLastName(input.next());
            
            System.out.println("Balanca: ");
            record.setBalance(input.nextInt());
            
            if (record.getAccount() < 0){
                System.out.println("Numero da Conta não pode ser zero!");
                System.out.println("Informe novamente");
            }
            
        } while (record.getAccount() < 0);
        
        try {
            output.format ("%d %s %s %d\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());
            cont++;
        } catch (FormatterClosedException ex1) {
            System.out.println ("Informacoes Incorretas");
        }
    }
    
    public void closeFile (){
        if (output != null) {
            output.close();
        }
        
        
    }
}
