/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.inicio;

import Punto4.dominio.Calculos;
import java.util.Scanner;

/**
 *
 * @author Win8
 */
public class Principal {
    public static void main(String[] args) {
        
        int valor;
        Scanner sc = new Scanner(System.in);
        Calculos calculos = new Calculos();
        
        for (int i = 0; i <= calculos.getNumeros().length; i++) {
            System.out.println("Ingrese valor: ");
            valor=sc.nextInt();
            calculos.guardarValor(valor);
            
        }
       // calculos.mostrarVector();
       calculos.calcularPromedio();
        
    }
}
