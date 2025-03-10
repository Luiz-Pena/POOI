/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author luizh
 */
public class Testes {
    public static void main(String[] args) {
        Conta teste01 = new Conta();
        System.out.println("Valores iniciais: "+teste01.getNome()+" "+teste01.getSaldo());

        teste01.setNome("Maria");
        teste01.setSaldo (120.10);
        System.out.println("Valores inseridos: "+teste01.getNome()+" "+teste01.getSaldo());

        teste01.deposita(300.00);
        System.out.println("Valores após deposito: "+teste01.getNome()+" "+teste01.getSaldo());

        teste01.redimento(1000.00);
        System.out.println("Valores após rendimento: "+teste01.getNome()+" "+teste01.getSaldo());

        teste01.saque(500.00);
        System.out.println("1º Saque: "+teste01.getNome()+" "+teste01.getSaldo());

        teste01.saque(50.00);
        System.out.println("2º Saque: "+teste01.getNome()+" "+teste01.getSaldo());

    }
}
