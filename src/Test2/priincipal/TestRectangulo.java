/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2.priincipal;

import Punto2.dominio.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author kuru
 */
public class TestRectangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, base, altura;
        
        System.out.println("Ingrese las coordenadas de punto: ");
        System.out.print("x= ");
        x = in.nextDouble();
        System.out.print("y= ");
        y = in.nextDouble();
        System.out.print("Ingrese la base del rectangulo: ");
        base = in.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = in.nextDouble();
        
        Rectangulo unRectangulo;
        unRectangulo = new Rectangulo(x,y,base,altura);
        
        double elArea = unRectangulo.CalcularArea();
        double elPerimetro = unRectangulo.CalcularPerimetro();
        
        System.out.println("El área del rectangulo es: "+elArea+" cm. y el perimetro es de: "+elPerimetro+" cm.");
    }
}
