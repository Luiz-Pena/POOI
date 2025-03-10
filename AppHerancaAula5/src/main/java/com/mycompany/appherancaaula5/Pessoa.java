/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appherancaaula5;

/**
 *
 * @author luizh
 */
public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String dataNasc;
    
    public Pessoa (){
        nome = "";
        cpf = "";
        dataNasc = "";
    }
    
    public Pessoa (String nome, String cpf, String dataNasc){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void imprimirPessoa () {
        System.out.println ("Nome: "+nome);
        System.out.println ("CPF: "+cpf);
        System.out.println ("Data de Nascimento: "+dataNasc);
    }
    
}
