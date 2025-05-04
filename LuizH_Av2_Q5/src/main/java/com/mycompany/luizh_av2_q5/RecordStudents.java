/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luizh_av2_q5;

/**
 *
 * @author luizh
 */
public class RecordStudents {
    private String curso;
    private int matricula;
    private String nome;
    
    public RecordStudents (){
        curso = "";
        matricula = 0;
        nome = "";
    }
    
    public RecordStudents (String curso, int matricula, String nome){
        this.curso = curso;
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
