/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cachorro;

/**
 *
 * @author luizh
 */
public class Cachorro {

    private Integer idade;
    private Integer peso;
    private String nome;
    
    public Cachorro(){
        
    }
    
    public Cachorro (String nome) {
        this.nome = nome;
    }
    
    public Cachorro (String nome, Integer peso) {
        this.nome = nome;
        this.peso = peso;
    }
    
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void latir() {
        System.out.println ("Nome:"+nome);
        System.out.println ("Au au au");
    }
    
    public void comer() {
        System.out.println ("Nome: "+nome);
        System.out.println ("Peso: "+peso);
    }
    
    public void dormir() {
        
    }
}
