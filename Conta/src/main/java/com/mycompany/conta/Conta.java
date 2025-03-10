/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;

/**
 *
 * @author luizh
 */
public class Conta {

    private String nome;
    private Double saldo;

    public Conta (){
        nome = "";
        saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposita (Double valor) {
        saldo += valor;
    }

    public void redimento (Double valor) {
        saldo += valor*0.05;
    }

    public void saque (Double valor) {
        if (saldo < valor) {
            System.out.println("Saldo Indisponível!");
        }
        else saldo -= valor;
    }
}
