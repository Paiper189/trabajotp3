/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.dominio;

/**
 *
 * @author kuru
 */
public class Rectangulo {
    private double x;
    private double y;
    private double base;
    private double altura;

    public Rectangulo(){
    }
    
    public Rectangulo(double x, double y, double base, double altura) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
    }
     
    public double CalcularArea(){
        double area = (base*altura);
        return area;
    }   
    
    public double CalcularPerimetro(){
        double perimetro = ((base+altura)*2);
        return perimetro;
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

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void Mensaje(){
        System.out.println("El rectangulo esta en ( "+x+","+y+"). Tiene una base de: "+base+" cm. y una altura de: "+altura+" cm.");
    }
}
