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
public class FuncionarioGradu extends Funcionario{
    private String Universidade;
    private String Curso;

    public FuncionarioGradu (){
        Universidade = "";
        Curso = "";
    }
    
    public String getUniversidade() {
        return Universidade;
    }

    public void setUniversidade(String Universidade) {
        this.Universidade = Universidade;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    @Override
    public void lerDados (){
        input = new Scanner(System.in);
        super.lerDados();
       
        System.out.println("Universidade: ");
        Universidade = input.next();
        
        System.out.println("Curso: ");
        Curso = input.next();
    }
    
    @Override
    public double rendaTotal() {
        return rendaBasica*2.0;
    }
}
