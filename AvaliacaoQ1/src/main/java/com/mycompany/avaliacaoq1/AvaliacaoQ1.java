/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avaliacaoq1;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class AvaliacaoQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Resistor primeiro = new Resistor();
        Resistor segundo = new Resistor();
        
        System.out.println ("Digite a Resistencia do primeiro resistor: ");
        primeiro.setResistencia(input.nextDouble());
        System.out.println ("Digite a Potencia do primeiro resistor: ");
        primeiro.setPotencia(input.nextDouble());
        
        System.out.println ("Digite a Resistencia do segundo resistor: ");
        segundo.setResistencia(input.nextDouble());
        System.out.println ("Digite a Potencia do segundo resistor: ");
        segundo.setPotencia(input.nextDouble());
        
        Resistor resultado = primeiro.serie(segundo);
        System.out.println ("Caso associados em série: ");
        resultado.Imprime();
        
        resultado = primeiro.paralelo(segundo);
        System.out.println ("Caso associados em paralelo: ");
        resultado.Imprime();
    }
}
