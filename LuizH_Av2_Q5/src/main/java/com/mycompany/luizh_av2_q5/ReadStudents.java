/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luizh_av2_q5;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luizh
 */
public class ReadStudents {
    private RandomAccessFile input;
    
    public void openFile(){
        try {
            input = new RandomAccessFile("clients.dat", "r");
        } catch (IOException ex) {
            System.out.println("Erro ao abrir arquivo");
        }
    }
    
    public void readRecords(javax.swing.JTextPane qisso, javax.swing.JTextField afff){
        StudensHandle registros = new StudensHandle();
        
        
        try {
            while (true){
                do {
                    registros.read(input);
                
                } while (registros.getMatricula() == 0);
                
                if (registros.equals(afff.getText())){
                    qisso.add(new Object[]{});
                }
                
            }
        } catch (EOFException exA) {
            return;
        } catch (IOException exB) {
            System.exit(1);
        }
    }

}
