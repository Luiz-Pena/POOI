/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appherancaaula5;

/**
 *
 * @author luizh
 */
public class Aluno extends Pessoa {

    private Integer matricula;
    
    public Aluno (){
        nome = "";
        cpf = "";
        dataNasc = "";
        matricula = 0;
    }
    
    public Aluno (String nome, String cpf, String dataNasc, Integer matricula){
        super (nome, cpf, dataNasc);
        this.matricula = matricula;
    }
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    
    public void imprimirAluno (){
        imprimirPessoa ();
        System.out.println("Matricula: "+matricula);
        
    }
}
