/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio4;

/**
 *
 * @author luizh
 */
public class Laboratorio4 {
    
    public static void main(String[] args) {
        
        Estacionamento registro[] = new Estacionamento [5];
        
        for (int i=0; i<5; i++){
            registro[i].solicitarDados();
        }
        
        
        System.out.println ("Relatorio de todos os carros: ");
        System.out.println ("========================");
        for (int i=0; i<5; i++){
            System.out.println ("Carro "+(i+1));
            registro[i].imprimirDadosCarro();
            registro[i].horasCobradas();
            System.out.println ("========================");
        }
    }
}
