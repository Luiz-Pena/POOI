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
public class Empregado {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected Scanner input;

    public Empregado (){
        nome = "";
        cpf = "";
        endereco = "";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void inserirDadosEmpregados(){
        input = new Scanner(System.in);
        
        System.out.println ("Nome: ");
        nome = input.next();
        
        System.out.println ("CPF: ");
        cpf = input.next();
        
        System.out.println ("Endereço: ");
        endereco = input.next();
        
    }
}
