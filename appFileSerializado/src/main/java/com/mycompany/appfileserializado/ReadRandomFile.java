/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appfileserializado;

import com.mycompany.appfileserializado.InterfacesAlt.Ler;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luizh
 */
public class ReadRandomFile {
    private RandomAccessFile input;
    
    public boolean openFile(){
        try {
            input = new RandomAccessFile("clients.dat", "r");
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    
    public DefaultTableModel readRecords(){
        RandomAcessAccountRecord registros = new RandomAcessAccountRecord();
        DefaultTableModel model = new DefaultTableModel(
        new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Nome", "Sobrenome", "Saldo"
            }
        );
        
        model.setNumRows(0);
        
        try {
            while (true){
                do {
                    registros.read(input);
                
                } while (registros.getAccount() == 0);
                
                model.addRow(new Object[]{
                    registros.getAccount(),
                    registros.getFirstName(), 
                    registros.getLastName(), 
                    registros.getBalance()
                    });
                //System.out.printf("%-10s%-15s%-15s%10s\n", registros.getAccount(), registros.getFirstName(), registros.getLastName(), registros.getBalance());
            }
        } catch (EOFException exA) {
            return model;
        } catch (IOException exB) {
            System.exit(1);
            return model;
        }
    }
    
    public boolean closeFile (){
        try {
            if (input!=null) {
                input.close();
                return true;
            }
            return true;
        } catch (IOException ex) {
                return false;
        }
    }
}
