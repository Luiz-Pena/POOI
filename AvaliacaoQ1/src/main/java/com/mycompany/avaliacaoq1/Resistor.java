/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacaoq1;

/**
 *
 * @author luizh
 */
public class Resistor {
    private double resistencia;
    private double potencia;
    
    public Resistor (){
        resistencia = 0.0;
        potencia = 0.0;
    }
    
    public Resistor (double resistencia, double potencia){
        this.resistencia = resistencia;
        this.potencia = potencia;
    }
    
    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public Resistor serie (Resistor segundo) {
        Resistor resultado = new Resistor();
        resultado.resistencia = resistencia + segundo.getResistencia();
        
        return resultado;
    }
    
    public Resistor paralelo (Resistor segundo) {
         Resistor resultado = new Resistor();
         resultado.resistencia = (resistencia * segundo.getResistencia()) / (resistencia + segundo.getResistencia());
         return resultado;
    }
    
    public void Imprime (){
        System.out.println ("Resistencia: " + resistencia + " ohms");
        System.out.println ("Potencia: " + potencia + " watts");
    }
    
}
