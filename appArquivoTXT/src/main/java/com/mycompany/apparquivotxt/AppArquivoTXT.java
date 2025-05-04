/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apparquivotxt;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class AppArquivoTXT {

    public static void main(String[] args) {
        
        CreateTextFile arquivo = new CreateTextFile();
        Scanner input = new Scanner(System.in);
        int ops = -1;
        
        do {
            System.out.println("1- Abrir o Arquivo");
            System.out.println("2- Inserir Registros");
            System.out.println("3- Fechar Arquivo");
            System.out.println("4- Sair");
               
            ops = input.nextInt();
            
            switch (ops) {
                case 1:
                    arquivo.openFile();
                    break;
                
                case 2:
                    arquivo.addRecords();
                    break;
                
                case 3:
                    arquivo.closeFile();
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    break;
                
                default:
                    System.out.println("Codigo incorreto"); 
                    break;
            }
        
        
        } while(ops!=4);
    }
}
