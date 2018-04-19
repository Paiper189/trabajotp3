/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6.inicio;

import Punto6.dominio.GestorRectangulo;
import Punto6.dominio.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Win8
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indice;

        Rectangulo unRectangulo = new Rectangulo(2, 3, 2, 5);
        Rectangulo segRectangulo = new Rectangulo(3, 6, 12, 5);
        Rectangulo terRectangulo = new Rectangulo(2, 10, 11, 5);
        Rectangulo cuaRectangulo = new Rectangulo(5, 3, 8, 10);
        Rectangulo cinRectangulo = new Rectangulo(3, 7, 10, 20);

        GestorRectangulo gestor = new GestorRectangulo();

        gestor.guardarRectangulos(unRectangulo);
        gestor.guardarRectangulos(segRectangulo);
        gestor.guardarRectangulos(terRectangulo);
        gestor.guardarRectangulos(cuaRectangulo);
        gestor.guardarRectangulos(cinRectangulo);

        for (Rectangulo rec : gestor.getListaRectangulos()) {

            System.out.println("/////////////////////////////////////////////////////////////");
            System.out.println("// punto /  base  /  altura  /  superficie  /  perímetro  // ");
            System.out.println("//" + rec.getX()+"," + rec.getY()+"   /   " + rec.getBase() + "   /    " + rec.getAltura() + "   /   " + rec.getSuperficie() + "   /   " + rec.getPerimetro());
            System.out.println("//////////////////////////////////////////////////////////////");
        }

        System.out.println("Ingrese indice para eliminar rectangulo (0,1,2,3,4 O 5): ");
        indice = sc.nextInt();
        gestor.getListaRectangulos().remove(indice);
        System.out.println("SE A ELIMINADO");

        for (Rectangulo rec: gestor.getListaRectangulos()) {
            System.out.println("//////////////////////////////////////////////////////////////");
            System.out.println("// punto  /  base  /  altura  /  superficie  /  perímetro  // ");
            System.out.println("//" + rec.getX() + "," + rec.getY()+"   /   " + rec.getBase() + "  /    " + rec.getAltura() + "   /   " + rec.getSuperficie() + "   /   " + rec.getPerimetro());
            System.out.println("///////////////////////////////////////////////////////////////");
        }

    }

}
