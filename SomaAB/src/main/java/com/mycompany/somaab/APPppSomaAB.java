/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.somaab;

/**
 *
 * @author luizh
 */
public class APPppSomaAB {
    public static void main (String[] args) {
        //SomaAB teste01 = new SomaAB(5.5, 1.5);
        SomaAB teste02 = new SomaAB();
        
        //teste02.setA(9.9);
        //teste02.setB(1.1);
        teste02.lerDados();
        System.out.println ( "Valor de A :"+teste02.getA());
        System.err.println ("Valor de B: "+teste02.getB());
        System.out.println ("Soma: "+teste02.somaAB());
    }
}
