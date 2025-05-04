/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author luizh
 */
public class Divisao implements Calculador {
    private double x;
    private double y;
    
    public Divisao (){
        x = 0.0;
        y = 0.0;
    }
    
    public Divisao (double x, double y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double calcular() {
        return x/y;
    }
}
