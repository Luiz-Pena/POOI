/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appfileserializado;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luizh
 */
public class CreateRandomFile {
    private static final int NUMBER_RECORDS = 100;
    
    public int CreateFile (){
        RandomAccessFile file = null;
        
        try {
            file = new RandomAccessFile("clients.dat", "rw");
            RandomAcessAccountRecord blankRecord = new RandomAcessAccountRecord();
            
            for (int count = 0; count<NUMBER_RECORDS; count++){
                blankRecord.write(file);
            }
            //System.out.println("Arquivos clients.dat criado com sucesso!");
            
            return 0;
        } catch (FileNotFoundException ex) {
            //System.out.println("Erro ao gravar arquivo");
            
            return 1;
        } catch (IOException ex) {
            //System.out.println("Erro ao processar arquivo");
            //System.exit(1);
            
            return 2;
        } finally {
            if (file != null){
                try {
                    file.close();
                } catch (IOException ex) {
                    //System.out.println("Erro ao fechar o arquivo!");
                    //System.exit(1);
                    
                    return 3;
                }
            }
        }
    }
}
