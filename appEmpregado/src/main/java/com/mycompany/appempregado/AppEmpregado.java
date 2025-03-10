/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appempregado;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class AppEmpregado {

    Empregado empregados[] = new Empregado[10];
    Scanner input = new Scanner(System.in);
    Integer index = 0;
    
    
    public static void main(String[] args) {
        
        
        Scanner menuOps = new Scanner(System.in);
        AppEmpregado operacoes = new AppEmpregado();
        Integer opcoes = 0;
        
        do {
            System.out.println ("Bem vindo ao Menu de Contabilidade e Recursos Humanos");
            System.out.println ("1: Cadastrar Empregado CLT");
            System.out.println ("2: Cadastrar Empregado Horista");
            System.out.println ("3: Imprimir a Lista de Empregados");
            System.out.println ("4: Sair");
            System.out.println ("Digite a opcao desejada:");
            
            opcoes = menuOps.nextInt();
            
            switch (opcoes) {
                case 1:
                    System.out.println ("Metodo para Cadastro Empregado CLT");
                    operacoes.inserirCLT();
                    break;
                    
                case 2:
                    System.out.println ("Metodo para Cadastro Empregado Horista");
                    operacoes.inserirHorista();
                    break;
                
                case 3:
                    System.out.println ("Metodo para Imprimir Lista de Empregados");
                    operacoes.imprimirLista();
                    break;
                    
                case 4:
                    System.out.println ("Saindo...");
                    break;
                        
                default:
                    System.out.println ("Opcao invalida");
                    break;    
            }
            
        } while (opcoes != 4);
        
    }
    
    public void inserirCLT (){
        EmpregadoCLT temp = new EmpregadoCLT();
        
        temp.inserirDadosCLT();
        empregados[index++] = temp;
    }
    
    public void inserirHorista(){
        EmpregadoHorista temp = new EmpregadoHorista();
        
        temp.inserirDadosHorista();
        empregados[index++] = temp;
    }
    
    public void imprimirLista (){
        
        for (int count = 0; count < index; count++){
            System.out.println ("Nome: "+empregados[count].getNome());
            System.out.println ("CPF: "+empregados[count].getCpf());
            System.out.println ("Endereco: "+empregados[count].getEndereco());
            
            if (empregados[count] instanceof EmpregadoCLT) {
                EmpregadoCLT temp = (EmpregadoCLT)empregados[count];
                
                System.out.println ("Salario Bruto: "+temp.getsBrutoCLT());
                System.out.println ("Salario Liquido"+temp.sLCLT());
            }
            
            else {
                EmpregadoHorista temp = (EmpregadoHorista)empregados[count];
                
                System.out.println("Numero de Horas: "+temp.getnHoras());
                System.out.println("Valor das Horas: "+temp.getPrecoH());
                System.out.println("Salario Liquido: "+temp.sLH());
            }
        }
        
    }
    
}
