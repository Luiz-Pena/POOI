/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luizh_av2_q5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author luizh
 */
public class CreateRandomFile {
    private static final int NUMBER_RECORDS = 100;
    
    public void CreateFile (){
        RandomAccessFile file = null;
        
        try {
            file = new RandomAccessFile("clients.dat", "rw");
            StudensHandle blankRecord = new StudensHandle();
            
            for (int count = 0; count<NUMBER_RECORDS; count++){
                blankRecord.write(file);
            }
            System.out.println("Arquivos clients.dat criado com sucesso!");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao gravar arquivo");
        } catch (IOException ex) {
            System.out.println("Erro ao processar arquivo");
            System.exit(1);
        } finally {
            if (file != null){
                try {
                    file.close();
                } catch (IOException ex) {
                    System.out.println("Erro ao fechar o arquivo!");
                    System.exit(1);
                }
            }
        }
    }
}
