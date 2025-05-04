/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appmdi;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class EmpregadoCLT extends Empregado{
    private Double sBrutoCLT;

    public EmpregadoCLT () {
        sBrutoCLT = 0.0;
    }
    
    public EmpregadoCLT (String nome, String endereco, String cpf, Double sBrutoCLT){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.sBrutoCLT =  sBrutoCLT;
    }
    
    public Double getsBrutoCLT() {
        return sBrutoCLT;
    }

    public void setsBrutoCLT(Double sBrutoCLT) {
        this.sBrutoCLT = sBrutoCLT;
    }
    
    public void inserirDadosCLT(){
        
        input = new Scanner (System.in);
        super.inserirDadosEmpregados();
        
        System.out.println ("Salario Bruto: ");
        sBrutoCLT = input.nextDouble();
    }
    
    public double sLCLT () {
        if (sBrutoCLT <= 5000)
             return sBrutoCLT *= 0.85;
        return sBrutoCLT *= 0.725;
    }
}
