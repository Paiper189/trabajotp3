/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.inicio;

import Punto1.dominio.Punto;



/**
 *
 * @author Win8
 */
public class Principal {
     public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto (2,3);
        Punto punto2 = new Punto (2,3);
        
        System.out.println("Distancia entre los objetos:"+punto1.calcularDistancia(punto1,punto2));
        
    }

    
}
