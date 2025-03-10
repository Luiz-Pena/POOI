/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appherancaaula5;

/**
 *
 * @author luizh
 */
public class Professor extends Pessoa {
    private String disciplina;
    private Double salario;

    public Professor (){
        nome = "";
        cpf = "";
        dataNasc = "";
        disciplina = "";
        salario = 0.0;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Professor (String nome, String cpf, String dataNasc, String disciplina, Double salario) {
        super (nome, cpf, dataNasc);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    public void ImprimeProfessor (){
        imprimirPessoa ();
        
        System.out.println ("Disciplina :"+disciplina);
        System.out.println ("Salario :"+salario);
    }
}
