/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1;

/**
 *
 * @author luizh
 */
public class Vetor2D {
    private Double x;
    private Double y;

    public Vetor2D (){
        x = 0.0;
        y = 0.0;
    }
    
    public Vetor2D (Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    
    public double produtoEscalarXY (){
        int inteiroX = (int)Math.round(x) ;
        int inteiroY = (int)Math.round(y);  
        
        double resultado = (inteiroX*inteiroY + (x - inteiroX)*(y - inteiroY));
        return resultado;
    }
    
    public double modulo () {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public double angulo (){
        int inteiroX = (int)Math.round(x) ;
        int inteiroY = (int)Math.round(y); 
        
        double normaX = Math.sqrt(Math.pow(x, 2) + Math.pow(inteiroX, 2));
        double normaY = Math.sqrt(Math.pow(y, 2) + Math.pow(inteiroY, 2));
        double produtoNormaXY = normaX * normaY;
        
        return produtoEscalarXY() / produtoNormaXY;
    }
    
    public double projecao(){
        int inteiroY = (int)Math.round(y);
        double produtoEscalarY = inteiroY * (y - inteiroY);
        
        return (produtoEscalarXY() / produtoEscalarY) * y;
    }
}
