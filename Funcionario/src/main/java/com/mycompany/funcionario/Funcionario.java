/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionario;

/**
 *
 * @author luizh
 */
public class Funcionario {

    protected String nome;
    protected Double salario;
    protected String secao;
    
    public Funcionario (){
        nome = "";
        salario = 0.0;
        secao = "";
    }
        
    public Funcionario (String nome, Double salario, String secao) {
        this.nome = nome;
         this.salario = salario;
         this.secao = secao;
     }
        
     public Funcionario (String nome, Double salario) {
         this.nome = nome;
         this.salario = salario;
     }
        
    public Funcionario (String nome) {
         this.nome = nome;
    }
    
    public double bonificacao () {
         salario *= 1.10;
         return salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
        
    public Double getSalario() {
        return salario;
    }
    
    public void setSalario(Double salario) {
        this.salario = salario;
    }
        
    public String getSecao() {
        return secao;
    }
    
    public void setSecao(String secao) {
         this.secao = secao;
    }
    
}
