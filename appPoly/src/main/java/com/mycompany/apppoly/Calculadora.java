/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppoly;

/**
 *
 * @author luizh
 */
public class Calculadora {
    public Double a;
    public Double b;
    public String x;
    
    public Calculadora (Double a, Double b, String x){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    
    public Double calcular (){
        Double resposta = 0.0;
        
        if (x.equals("+"))
            resposta = a+b;
        else if (x.equals("-"))
            resposta = a-b;
        else if (x.equals("*"))
            resposta = a*b;
        else if (x.equals("/"))
            resposta = a/b;
        
        return resposta;
    }
}
