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
public class Estacionamento {
    private String numChapa;
    private String marca;
    private Tempo HEntrada;
    private Tempo HSaida;
    private Scanner input;
    
    public Estacionamento (){
        numChapa = "";
        marca = "";
    }
    
    public String getNumChapa() {
        return numChapa;
    }

    public void setNumChapa(String numChapa) {
        this.numChapa = numChapa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void solicitarDados (){
        input = new Scanner(System.in);
        
        System.out.println ("Numero da Chapa: ");
        numChapa = input.next();
       
        System.out.println ("Marca do Carro: ");
        marca = input.next();
        
        System.out.println ("Hora Entrada: ");
        HEntrada.setHora(input.nextInt());
        System.out.println ("Minuto Entrado: ");
        HEntrada.setMinuto(input.nextInt());
        System.out.println ("Segundo Entrado: ");
        HEntrada.setSegundo(input.nextInt());
        
        System.out.println ("Hora Saida: ");
        HSaida.setHora(input.nextInt());
        System.out.println ("Minuto Saido: ");
        HSaida.setMinuto(input.nextInt());
        System.out.println ("Segundo Saido: ");
        HSaida.setSegundo(input.nextInt());
        
    }
    
    public void imprimirDadosCarro (){
        System.out.println ("Numero da Chapa: "+numChapa);
        System.out.println ("Marca do Carro: "+marca);
    }
    
    public void horasCobradas (){
        Tempo resultado = HEntrada;
        resultado.diminuiTempo(HSaida);
        
        System.out.println ("Total cobrado: " + (resultado.getHora()*3));
    }
    
    
}
