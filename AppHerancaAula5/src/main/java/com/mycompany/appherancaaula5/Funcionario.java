/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appherancaaula5;

/**
 *
 * @author luizh
 */
public class Funcionario extends Pessoa {

    private Double salario;
    private String dataAdmissao;
    private String cargo;
    
    public Funcionario (){
        nome = "";
        cpf = "";
        dataNasc = "";
        salario = 0.0;
        dataAdmissao = "";
        cargo = "";
    }
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void imprimirFuncionario () {
        imprimirPessoa ();
        
        System.out.println ("Salario: "+salario);
        System.out.println ("Data de admissao: "+dataAdmissao);
        System.out.println ("Cargo: "+cargo);
    }
    
}
