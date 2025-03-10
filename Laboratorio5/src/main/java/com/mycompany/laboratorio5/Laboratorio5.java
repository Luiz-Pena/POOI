/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio5;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Laboratorio5 {

    Funcionario funcionarios[] = new Funcionario[10];
    Integer contador = 0;
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        Laboratorio5 opcoes = new Laboratorio5();
        Integer menu = 99;
        
        do {
          
            System.out.println ("Menu de Opcoes");
            System.out.println ("1 - Cadastrar Funcionario Sem Ensino");
            System.out.println ("2 - Cadastrar Funcionario Com Ensino Basico");
            System.out.println ("3 - Cadastrar Funcionario Com Ensino Medio");
            System.out.println ("4 - Cadastrar Funcionario Com Ensino Superior");
            System.out.println ("5 - Listar Funcionarios");
            System.out.println ("6 - Apresentar Custos");
            System.out.println ("7 - Apresentar Custo Totais Por Nivel de Escolaridade");
            System.out.println ("8 - Sair");
            
            menu = input.nextInt();
            
            switch (menu) {
                case 1:
                    opcoes.Cadastro1();
                    break;
                    
                case 2:
                    opcoes.Cadastro2();
                    break;
                    
                case 3:
                    opcoes.Cadastro3();
                    break;   
                
                case 4:
                    opcoes.Cadastro4();
                    break;
                    
                case 5:
                    opcoes.mostrarFunc();
                    break;
                    
                case 6:
                    opcoes.custos();
                    break;
                    
                case 7:
                    opcoes.custosNivEsc ();
                    break;
                    
                case 8:
                    System.out.println ("Saindo...");
                    break;
                    
                default:
                    System.out.println("Numero invalido!");
                    break;
            }
            
            
        } while (menu != 8);
        
        
    }
    
    public void Cadastro1 (){
        FuncionarioSemEns temp = new FuncionarioSemEns();
        
        temp.lerDados();
        funcionarios[contador++] = temp;
    }
    
    public void Cadastro2 (){
        FuncionarioEnsBasico temp = new FuncionarioEnsBasico();
        
        temp.lerDados();
        funcionarios[contador++] = temp;
    }
    
    public void Cadastro3 (){
        FuncionarioEnsMedio temp = new FuncionarioEnsMedio();
        
        temp.lerDados();
        funcionarios[contador++] = temp;
    }
    
    public void Cadastro4 (){
        FuncionarioGradu temp = new FuncionarioGradu();
        
        temp.lerDados();
        funcionarios[contador++] = temp;
    }
    
    public void mostrarFunc (){
        for (int i=0; i<contador; i++){
            System.out.println ("Nome: " + funcionarios[i].getNome());
            System.out.println ("Codigo Funcional: " + funcionarios[i].getCodFuncional());
            System.out.println ("Renda Basica: " + funcionarios[i].getRendaBasica());
            System.out.println ("Renda Total: " + funcionarios[i].rendaTotal());
            
            if (funcionarios[i] instanceof FuncionarioEnsBasico) {
                FuncionarioEnsBasico temp = (FuncionarioEnsBasico)funcionarios[i];
                
                System.out.println ("Escola: " + temp.getEscola());
            }
            
            else if (funcionarios[i] instanceof FuncionarioEnsMedio) {
                FuncionarioEnsMedio temp = (FuncionarioEnsMedio)funcionarios[i];
                
                System.out.println ("Escola: " + temp.getEscola());
            }
            
            else if (funcionarios[i] instanceof FuncionarioGradu) {
                FuncionarioGradu temp = (FuncionarioGradu)funcionarios[i];
                
                System.out.println ("Universidade: " + temp.getUniversidade());
                System.out.println ("Curso: " + temp.getCurso());
            }
        }
    }
    
    public void custos (){
        int total = 0;
        
        for (int i=0; i<contador; i++){
            total += funcionarios[i].rendaTotal();
        }
        
        System.out.println ("Custo da empresa com salários: "+total);
    }
    
    public void custosNivEsc (){
        int total = 0;
        
        for (int i=0; i<contador; i++){
            total += funcionarios[i].rendaTotal() - funcionarios[i].getRendaBasica();
        }
        
        System.out.println ("Custo da empresa por nivel de escolaridade: "+total);
    }
    
    
}
