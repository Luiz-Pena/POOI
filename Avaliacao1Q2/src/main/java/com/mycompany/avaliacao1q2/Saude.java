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
public class Saude extends Pagamento{
    private String estabelecimento;
    private Scanner input;
    
    public Saude (){
        estabelecimento = "";
    }
    
    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public void inserirDadosSaude(){
        input = new Scanner (System.in);
        super.inserirDados();
        
        System.out.println("Estabelecimento: ");
        estabelecimento = input.next();
    }
    
    @Override
    public double faturar() {
        return valor*=1.12;
    }
}
