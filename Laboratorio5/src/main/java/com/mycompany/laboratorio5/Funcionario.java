/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio5;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public abstract class Funcionario {
    protected String nome;
    protected String codFuncional;
    protected Double rendaBasica;
    protected Scanner input;

    public Funcionario (){
        nome = "";
        codFuncional = "";
        rendaBasica = 1000.00;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodFuncional() {
        return codFuncional;
    }

    public void setCodFuncional(String codFuncional) {
        this.codFuncional = codFuncional;
    }

    public Double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(Double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }
       
    public void lerDados () {
        input = new Scanner(System.in);
        
        System.out.println("Codigo funcional: ");
        codFuncional = input.next();
        
        System.out.println("Nome: ");
        nome = input.next();
    }
    
    public abstract double rendaTotal();
    
}

