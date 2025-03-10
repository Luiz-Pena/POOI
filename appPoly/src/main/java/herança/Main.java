/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herança;

/**
 *
 * @author luizh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    /**    Calculador calc1 = new Calculador (1.6, 8.9);
        System.out.println ("Resultado: " +calc1.Calcular());
        
        Divisao calc2 = new Divisao (1.6, 8.9);
        System.out.println ("Resultado: " +calc2.Calcular());
        
        Multiplicacao calc3 = new Multiplicacao (1.6, 8.9);
        System.out.println ("Resultado: " +calc3.Calcular());
        
        Soma calc4 = new Soma (1.6, 8.9);
        System.out.println ("Resultado: " +calc4.Calcular());
        
        Subtracao calc5 = new Subtracao (1.6, 8.9);
        System.out.println ("Resultado: " +calc5.Calcular());
    */
        
        Calculador calc = new Divisao (1.0, 0.5);
        System.out.println ("Resultado: " +calc.Calcular());
    }
    
}
