/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7.dominio;

/**
 *
 * @author Win8 Este es arreglo encargado de almacenar los auto.
 */
public class GestorAutos  {
    private Auto[] arregloAutos= new Auto[3];
    

    public GestorAutos() {
          

    }
    
    
    /*
    *
    * Este es el método encargado de guardar los valores en el arreglo
    */
   public void guardarAuto(Auto auto){
        for (int i = 0; i < arregloAutos.length ; i++) {
            
            this.arregloAutos[i]=auto;
            System.out.println("COLOR GUARDADO ES "+arregloAutos[i].getColor() );
        }
    }
    
    public void editarAuto(int b, Auto a){
            this.arregloAutos[b].setColor(a.getColor());
        
        
           
        
}
    /**
     * @return the arregloAutos
     */
    public Auto[] getArregloAutos() {
        return arregloAutos;
    }

    /**
     * @param arregloAutos the arregloAutos to set
     */
    public void setArregloAutos(Auto[] arregloAutos) {
        this.arregloAutos = arregloAutos;
    }
    
}
