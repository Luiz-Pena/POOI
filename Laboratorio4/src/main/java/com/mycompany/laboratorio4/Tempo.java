/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio4;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tempo (){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public void pedirHoras (){
        Scanner scanner = new Scanner(System.in);
            
        System.out.println ("Hora :");
        hora = scanner.nextInt();
            
        System.out.println ("Minuto :");
        minuto = scanner.nextInt();
            
        System.out.println ("Segundo :");
        segundo = scanner.nextInt();
        
        scanner.close();
    }
    
    public void mostrarHoras (){
        System.out.println (hora+":"+minuto+":"+segundo);
    }
    
    public void adicionaTempo (Tempo segundo){
        int total = (this.segundo + this.minuto*60 + this.hora*3600);
        total += (segundo.segundo + segundo.minuto*60 + segundo.hora*3600);
        segundo.hora = total/3600;
        total %= 3600;
        segundo.minuto = total/60;
        segundo.segundo = total%60;
    }
    
    public void diminuiTempo (Tempo segundo){
        int total = (this.segundo + this.minuto*60 + this.hora*3600);
        total -= (segundo.segundo + segundo.minuto*60 + segundo.hora*3600);
        segundo.hora = total/3600;
        total %= 3600;
        segundo.minuto = total/60;
        segundo.segundo = total%60;
    }
}

