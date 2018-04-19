/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.dominio;

/**
 *
 * @author Win8
 */
public class Punto {

    public Punto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void setY( double y) {
        this.y = y;
    }

    private double x;
    private double y;
            
   public Punto ( double x,double y){
       this.x=x;
       this.y=y;
   }
public double calcularDistancia (Punto a, Punto b){
    
    return Math.sqrt( Math.pow(b.getX()-a.getX(),2) + Math.pow (a.getY() - b.getY(),2));
       
}      

    public void mostrarPunto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
