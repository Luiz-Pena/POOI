/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author luizh
 */
public class Soma extends Calculador{
    
    public Soma(Double a, Double b) {
        super(a, b);
    }
    
    @Override
    public Double Calcular (){
        return a+b;
    }
    
}
