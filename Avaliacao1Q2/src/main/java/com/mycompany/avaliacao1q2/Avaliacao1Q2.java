/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avaliacao1q2;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Avaliacao1Q2 {

    Pagamento pagamento[] = new Pagamento[10];
    Integer contador = 0;
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Avaliacao1Q2 opcoes = new Avaliacao1Q2();
        Integer menu = -1;
        
        do {
            System.out.println("Menu de Opcoes");
            System.out.println("1 - Faturar Pagamento Area da Saude");
            System.out.println("2 - Faturar Pagamento Area Alimenticia");
            System.out.println("3 - Mostrar Faturas");
            System.out.println("4 - Sair");
        
            menu = input.nextInt();
            
            switch (menu) {
                case 1:
                    opcoes.Opcao1();
                    break;
                    
                case 2:
                    opcoes.Opcao2();
                    break;
                    
                case 3:
                    opcoes.Opcao3();
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    break;    
                    
                default:
                    System.out.println("Valor invalido!");
                    break;
            }
        
        } while (menu!=4);
    }
    
    
    public void Opcao1 (){
        Alimentacao temp = new Alimentacao();
        temp.inserirDadosAlimentacao();
        temp.faturar();
        
        pagamento[contador++] = temp;
    }
    
    public void Opcao2 (){
        Saude temp = new Saude();
        temp.inserirDadosSaude();
        temp.faturar();
        
        pagamento[contador++] = temp;
    }
    
    public void Opcao3 (){
        for (int i=0; i<contador; i++){
            System.out.println("CPF: "+pagamento[i].getCpf());
            System.out.println("Valor: "+pagamento[i].getValor());
            System.out.println("Codigo: "+pagamento[i].getCodigo());
            
            if (pagamento[i] instanceof Alimentacao){
                Alimentacao temp = (Alimentacao)pagamento[i];
                System.out.println("Descricao: "+temp.getDescricao());
            }
            
            else {
                Saude temp = (Saude)pagamento[i];
                System.out.println("Estabelecimento: "+temp.getEstabelecimento());
            }
                
            
        }
    }
}
