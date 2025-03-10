/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaab;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class SomaAB {

    // Atributos
    private Double A;
    private Double B;

    /* Constrututor => define valor inicial dos atributor ao instanciar /
    criar condições inciais do objeto que será utilizado */
    public SomaAB (){
        A = 0.0;
        B = 0.0;
    }

    public SomaAB (Double x, Double y){
        this.A = x;
        this.B = y;
    }
    
    //getter => recupera o valor/informação de um atributo
    public Double getA() {
        return A;
    }

    public Double getB() {
        return B;
    }
    
    //setter => define o valor de um atributo
    public void setA (Double A){
        this.A = A;
    }

    public void setB (Double B){
        this.B = B;
    }

    // Metodos -ações-
    public Double somaAB () {
        return A + B;
    }

    public void lerDados (){
        //Buffer 
        Scanner input;
        
        //Instanciando
        input = new Scanner(System.in);

        //Comunicação para inserir A e B
        System.out.println("Digite o valor de A: ");
        A = input.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = input.nextDouble();
    }
}
