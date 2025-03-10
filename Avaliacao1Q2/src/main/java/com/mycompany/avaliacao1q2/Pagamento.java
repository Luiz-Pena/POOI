/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao1q2;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public abstract class Pagamento {
    protected int cpf;
    protected double valor;
    protected int codigo;
    protected Scanner input;

    public Pagamento(){
        cpf = 0;
        valor = 0.0;
        codigo = 0;
    }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public abstract double faturar();
    
    public void inserirDados(){
        input = new Scanner (System.in);
        
        System.out.println ("CPF: ");
        cpf = input.nextInt();
        
        System.out.println ("Valor: ");
        valor = input.nextDouble();
        
        System.out.println ("Codigo: ");
        codigo = input.nextInt();
        
    }
}
