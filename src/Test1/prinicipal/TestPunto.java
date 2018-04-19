package Test1.prinicipal;


import Punto1.dominio.Punto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class TestPunto {
 
    public static void main(String[] args) {
        Punto P1; //declaro los objetos
        Punto P2;
        
        P1 = new Punto(1.5, 2.5); //creacion de objetos con asignacion de valores
        P2 = new Punto(3.5, 5.0);
        
        //calculo de la distancia entre dos puntos
        double distancia = P1.CalcularDistancia(P2);
        System.out.println("La distancia entre el Punto P1 y el Punto P2 es: "+distancia);
        System.out.println("");
        System.out.println("");
        System.out.println("Integrantes:");
        System.out.println("Gutierrez Karen y Cortez Liliana");
    }
}