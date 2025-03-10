/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio2;

/**
 *
 * @author luizh
 */
public class Laboratorio2 {

    public static void main(String[] args) {
        Tempo primeiroHorario = new Tempo();
        Tempo segundoHorario = new Tempo();
        Tempo resultado = primeiroHorario;
        
        primeiroHorario.pedirHoras();
        segundoHorario.pedirHoras();
        
        resultado.diminuiTempo(segundoHorario);
        System.out.println("Diferença de horário: ");
        resultado.mostrarHoras();
        
        primeiroHorario.adicionaTempo(segundoHorario);
        System.out.println("Horário total: ");
        primeiroHorario.mostrarHoras();
    }
}
