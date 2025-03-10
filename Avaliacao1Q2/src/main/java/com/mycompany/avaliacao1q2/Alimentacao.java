/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao1q2;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Alimentacao extends Pagamento {
    private String descricao;
    private Scanner input;
    
    public Alimentacao (){
        descricao = "";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void inserirDadosAlimentacao (){
        input = new Scanner (System.in);
        super.inserirDados();
        
        System.out.println("Descricao: ");
        descricao = input.next();
    }
    
    @Override
    public double faturar(){
        return valor*=1.05;
    }
    
}
