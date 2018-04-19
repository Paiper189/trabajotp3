/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7.inicio;

import Punto7.dominio.Auto;
import Punto7.dominio.GestorAutos;

/**
 *
 * @author Win8
 */
public class Principal {
    public static void main(String[] args) {
        
        Auto auto1=new Auto("483-FEK","RENAUL", 2010,"Azul","GASOIL");
        Auto auto2=new Auto("836-GUT","FORD", 2012,"Rojo","GAS");
        Auto auto3=new Auto("028-RBW","FIAD", 2015,"Blanco","NAFTA");
        
        GestorAutos gestor = new GestorAutos();
        gestor.guardarAuto(auto1);
        gestor.guardarAuto(auto2);
        gestor.guardarAuto(auto3);
        
        for (int i = 0; i < gestor.getArregloAutos().length; i++) {
            System.out.println(gestor.getArregloAutos()[i].getColor());
        }
        
        Auto autoNuevo=new Auto("376-DES","FORD", 2000,"Negro","GAS"); 
        gestor.editarAuto(2, autoNuevo);
        
        for (int i = 0; i < gestor.getArregloAutos().length; i++) {
            System.out.println(gestor.getArregloAutos()[i].getColor());
        }
    }
}
