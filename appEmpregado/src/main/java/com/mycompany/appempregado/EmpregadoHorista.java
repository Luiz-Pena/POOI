/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appempregado;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class EmpregadoHorista extends Empregado {
    private int nHoras;
    private Double precoH;

    public EmpregadoHorista () {
        nHoras = 0;
        precoH = 0.0;
    }
    
    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public Double getPrecoH() {
        return precoH;
    }

    public void setPrecoH(Double precoH) {
        this.precoH = precoH;
    }
    
    public void inserirDadosHorista(){
        input = new Scanner (System.in);
        super.inserirDadosEmpregados();
        
        System.out.println ("Horas trabalhadas: ");
        nHoras = input.nextInt();
        
        System.out.println ("Preco das horas trabalhadas: ");
        precoH = input.nextDouble();
    }
    
    public double sLH (){
        return nHoras * precoH * 0.85;
    }
}
