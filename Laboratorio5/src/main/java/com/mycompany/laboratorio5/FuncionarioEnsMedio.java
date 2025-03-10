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
public class FuncionarioEnsMedio extends Funcionario {
    private String escola;

    public FuncionarioEnsMedio (){
        escola = "";
    }
    
    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    
    @Override
    public void lerDados (){
        input = new Scanner(System.in);
        super.lerDados();
       
        System.out.println("Escola: ");
        escola = input.next();
    }
    
    @Override
    public double rendaTotal() {
        return rendaBasica*1.50;
    }
}
