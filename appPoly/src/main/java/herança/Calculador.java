/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author luizh
 */
public class Calculador {
    protected Double a;
    protected Double b;
    protected String x;
    
    public Calculador (Double a, Double b){
        this.a = a;
        this.b = b;
    }
    
    public Double Calcular (){
        return a*b - b;
    }
}
