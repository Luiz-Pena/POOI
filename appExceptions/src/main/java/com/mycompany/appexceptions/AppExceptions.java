/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appexceptions;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author luizh
 */
public class AppExceptions {

    public static void main(String[] args) {
        Exceptions teste01 = new Exceptions();
        
        //teste01.exemploExcessao();
        
        System.out.println("Inicio Main");
       
        try {
            teste01.trows01();
        }
        catch (Exception ex) {
            Logger.getLogger(Exceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Fim Main");
    }
}
