/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;

/**
 *
 * @author luizh
 */
public class AppFuncionario {
    public static void main (String[] args) {
        
        Gerente pascoal = new Gerente ("Joel", 2000.00, "Margot");
        System.out.println ("Nome Secretaria: "+pascoal.getSecretaria());
        System.out.println ("Bonificação: "+pascoal.bonificacao());
    }
}
