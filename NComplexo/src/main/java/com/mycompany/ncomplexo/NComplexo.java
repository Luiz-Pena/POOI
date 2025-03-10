/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ncomplexo;

/**
 *
 * @author luizh
 */
public class NComplexo {

    private Double Real;
    private Double Imaginario;
    
    public NComplexo (){
        Real = 0.0;
        Imaginario = 0.0;
    }
    
    public NComplexo (Double real, Double imaginario){
        this.Real = real;
        this.Imaginario = imaginario;
    }

    public Double getReal() {
        return Real;
    }
    
    public void setReal(Double real) {
        Real = real;
    }
    
    public Double getImaginario() {
        return Imaginario;
    }
    
    public void setImaginario(Double imaginario) {
        Imaginario = imaginario;
    }

    public double Modulo () {
        return Math.sqrt(Math.pow(Real, 2) + Math.pow(Imaginario, 2));
    }

    public double Argumento () {
        return Math.toDegrees(Math.atan(Imaginario/Real));
    }

    public NComplexo Soma (NComplexo b) {
        NComplexo a = new NComplexo();

        a.Real = b.Real + Real;
        a.Imaginario = b.Imaginario + Imaginario;

        return a;
    }

    public NComplexo Subtracao (NComplexo b) {
        NComplexo a = new NComplexo();

        a.Real = Real - b.Real;
        a.Imaginario = Imaginario - b.Imaginario;

        return a;
    }

    public void printComplexo () {
        System.out.println("Real: "+Real);
        System.out.println("Imaginario: "+Imaginario);
    }
}
