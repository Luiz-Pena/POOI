/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luizh_av2_q5;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;

/**
 *
 * @author luizh
 */
public class WriteStudents {
    private static final int NUMBER_RECORDS = 1000;
    private RandomAccessFile output;
    
    public void openFile (){
        try {
            output = new RandomAccessFile ("clients.dat", "rw");
        } catch (IOException ex) {
            System.out.println("Erro ao abrir o arquivo");
        }
    }
    
    public void closeFile (){
        try {
            if (output != null) {
                output.close();
            } 
        } catch (IOException ex) {
            System.out.println("Erro ao fechar o arquivo!");
        }
    }
    
    public void addRecords (int matricula, String nome, String curso){
        try {
            StudensHandle registro = new StudensHandle();
        
            registro.setMatricula(matricula);
            registro.setNome(nome);
            registro.setCurso(curso);
            
            output.seek((matricula-1)*StudensHandle.SIZE);
            
            registro.write(output);
            
        } catch (IOException ex) {
            System.out.println("Erro ao inserir o registro!");
        } catch (NoSuchElementException ex) {
            System.out.println("Entrada inválida!");
        }
    }

}
