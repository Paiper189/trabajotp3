/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.dominio;

/**
 *
 * @author Win8
 */
public class Punto {

   

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
    public void setY( double y) {
        this.y = y;
    }

    private double x;
    private double y;
            
   public Punto ( double x,double y){
       this.x=x;
       this.y=y;
   }
public void calcularDistancia (Punto a, Punto b){
    
    calcularDistancia = Math.sqrt( Math.pow(a.get x()-b.get x (),2) + Math.pow (a.get y () - b.get y (),2));
    
    
}

       
}
