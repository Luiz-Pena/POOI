/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apppoly;

/**
 *
 * @author luizh
 */
public class AppPoly {

    public static void main(String[] args) {
        Calculadora calculos1 = new Calculadora (10.5, 4.5, "+");
        System.out.println (calculos1.a + "+" + calculos1.b + "=" + calculos1.calcular());
        
        
    }
}
