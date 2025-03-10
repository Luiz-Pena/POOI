/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracao;

/**
 *
 * @author luizh
 */
public abstract class Calculador {
    protected double a;
    protected double b;
    
    public Calculador (double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public abstract double calcular ();
    
}
