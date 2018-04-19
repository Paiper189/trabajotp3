/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test5.principal;

import Punto5.dominio.Circulo;
import Punto5.util.GestorCirculos;

/**
 *
 * @author kuru
 */
public class TestCirculo {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(1.5, 15.0, 7.0);
        Circulo c2 = new Circulo(3.0, 7.0, 4.5);
        Circulo c3 = new Circulo(2.4, 10.2, 6.3);
        Circulo c4 = new Circulo(5.9, 18.0, 11.0);
        
        GestorCirculos gestor = new GestorCirculos();
        gestor.AgregarCirculo(c1);
        gestor.AgregarCirculo(c2);
        gestor.AgregarCirculo(c3);
        gestor.AgregarCirculo(c4);
        
        for(Circulo circulo: gestor.getCirculos()){
            System.out.println("Radio:          "+circulo.getRadio());
            System.out.println("Circunferencia: "+circulo.getCircunferencia());
            System.out.println("Diámetro:       "+circulo.getDiametro());
            System.out.println("=============================");
        }
    }
}
