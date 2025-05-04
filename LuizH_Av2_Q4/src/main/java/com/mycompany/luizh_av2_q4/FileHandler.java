/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luizh_av2_q4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author luizh
 */
public class FileHandler {
    private Formatter output;
    
    public void abrirArquivo (){
        try {
            output = new Formatter("arquivo.txt");
        } catch (IOException ex) {
            System.out.println("Erro ao abrir o arquivo");
        }
    }
    
    public void fecharArquivo (){
        if (output != null) {
            output.close();
        }

    }
    
    public void adicionarTexto (String texto){
        output.format ("%s", texto);
    }
    
    public String lerArquivoTexto() {
        return output.toString();
    }
}
