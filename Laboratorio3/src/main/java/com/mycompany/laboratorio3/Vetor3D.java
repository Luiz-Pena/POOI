/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio3;

/**
 *
 * @author luizh
 */
public class Vetor3D extends Vetor2D{
    private double z;

    public Vetor3D (){
        z = 0.0;
    }
    
    public Vetor3D (double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
            
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public Vetor3D produtoVetorial (Vetor3D segundoVetor) {
        Vetor3D resultado = new Vetor3D();
        
        resultado.setX(y*segundoVetor.getZ() - z*segundoVetor.getY());
        resultado.setY(z*segundoVetor.getX() - x*segundoVetor.getZ());
        resultado.setZ(x*segundoVetor.getY() - y*segundoVetor.getX());

        return resultado;
    }
    
    public double modulo (){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    
}
