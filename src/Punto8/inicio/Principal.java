/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8.inicio;

import Punto8.dominio.GestorLibros;
import Punto8.dominio.Libro;

/**
 *
 * @author Win8
 */
public class Principal {
    public static void main (String [] args){
      
    
    Libro libro1= new Libro(001,"Platero y yo", "Pablo Neruda", 350);
    Libro libro2= new Libro(212,"Algoritmo desde cero", "Luis Joyanes", 578);
    Libro libro3= new Libro(285,"Algebra l", "Carlos Murillo", 836);
    Libro libro4= new Libro(123,"Montecristo", "Alejandro Dumas", 946);
    Libro libro5= new Libro(372,"Harry Potter", "J.K. Rowling", 250);
    
    GestorLibros gestor = new GestorLibros();
   
    
    for (Libro lib : gestor.getListaLibros()) {
       
           
        }

           
    }
    
}
