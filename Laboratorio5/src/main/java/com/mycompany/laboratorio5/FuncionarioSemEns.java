/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio5;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class FuncionarioSemEns extends Funcionario {
    
    @Override
    public double rendaTotal() {
        return rendaBasica;
    }
    
    @Override
    public void lerDados(){
        super.lerDados();
    }
    
    
}
