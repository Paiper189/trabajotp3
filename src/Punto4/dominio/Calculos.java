/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.dominio;

/**
 *
 * @author Win8
 */
public class Calculos {
    private int numeros[]=new int[10];
    

    
    public void calcularPromedio(){
        int promedio=0;
        for (int i = 0; i <= 10; i++) {
            promedio=promedio+numeros[i];
        }
        promedio=promedio/10;
        System.out.println("El promedio es: "+promedio);
    }
    public void mostrarVector(){
        int i=0;
        while (i<=10) {            
            System.out.println(numeros[i]);
            i++;
        }
    }
    public void guardarValor(int a){
        for (int i = 0; i <= 10; i++) {
            numeros[i]=a;
        }
    }
    /**
     * @return the numeros
     */
    public int[] getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    
    
    
}
