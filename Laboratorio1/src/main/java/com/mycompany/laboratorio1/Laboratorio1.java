/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio1;

/**
 *
 * @author luizh
 */
public class Laboratorio1 {

    public static void main(String[] args) {

        Vetor2D VetorAB = new Vetor2D(2.0, 1.10);
        
        System.out.println("Produto escalar: "+VetorAB.produtoEscalarXY ());
        System.out.println("Modulo: "+VetorAB.modulo ());
        System.out.println("Ângulo: "+VetorAB.angulo ());
        System.out.println("Projeção: "+VetorAB.projecao ());
    }
}
