/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3.principal;

import Punto3.dominio.Triangulo;
import java.util.Scanner;

    public class TestTriangulo{
        
        public static void main(String[] args){
            
            Scanner in = new Scanner(System.in);
            double LadoA,LadoB,LadoC;
            
            System.out.println("Ingrese los lados:");
            System.out.print("Lado A: ");
            LadoA = in.nextDouble();
            System.out.print("Lado B: ");
            LadoB = in.nextDouble();
            System.out.print("Lado C: ");
            LadoC = in.nextDouble();
            Triangulo VerificarTriangulo;
            VerificarTriangulo = new Triangulo(LadoA, LadoB, LadoC);
            boolean Respuesta = VerificarTriangulo.VerificarTriangulo();
            double Perimetro = VerificarTriangulo.CalcularPerimetro();
            if(Respuesta == true){
                System.out.println("Los lados ingresados forman un triangulo y su perimetro es: "+Perimetro);
            } else {
                System.out.println("Los lados ingresados no forman un triangulo.");
            }
        }
}
