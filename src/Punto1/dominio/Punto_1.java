/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.dominio;

/**
 *
 * @author kuru
 */
public class Punto {
    private double x; //Declaracion de las variables x e y de tipo double. Private Modifica el acceso, para que solo dentro de esta clase se tenga acceso a la variable.
    private double y;

    public Punto(){ //Creación del constructor sin parametros para que no haya errores.
    }
    
    public Punto(double x, double y) { //Creación del constructor con parametros.
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() { //Implementación del método toString para que se devuelvan todos los datos
        return "x= "+ getX()+ ", y= "+ getY(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double CalcularDistancia(Punto coordenadas){
        double cateto1 = x - coordenadas.getX();
        double cateto2 = y - coordenadas.getY();
        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2); //Math.sqrt es el método que obtiene la raiz cuadrada de un numero.
        return hipotenusa;
    }
    
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
}