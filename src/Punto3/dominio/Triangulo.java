/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.dominio;

/**
 *
 * @author kuru
 */
public class Triangulo {
    private double A,B,C;

    public Triangulo(){
    }
    
    public Triangulo(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    
    public boolean VerificarTriangulo(){
        boolean respuesta;
            respuesta = false;
            if(((A + B)> C)&((A + C)> B)&((B + C)> A)){
                respuesta = true;
        }
     return respuesta;   
    }
    
    public double CalcularPerimetro(){
        double Perimetro,ResultadoPerimetro;
        ResultadoPerimetro = (A+B+C);
        return ResultadoPerimetro;
    }
    
    /**
     * @return the A
     */
    public double getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(double A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public double getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(double B) {
        this.B = B;
    }

    /**
     * @return the C
     */
    public double getC() {
        return C;
    }

    /**
     * @param C the C to set
     */
    public void setC(double C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Lado A = "+getA()+", Lado B = "+getB()+" Lado C = "+getC(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
