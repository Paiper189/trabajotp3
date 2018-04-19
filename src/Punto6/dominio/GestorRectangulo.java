/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6.dominio;

import java.util.ArrayList;

/**
 *
 * @author Win8
 */
public class GestorRectangulo {
    private ArrayList<Rectangulo> listaRectangulos= new ArrayList();

    /**
     * 
     * @param a Este metodo es el encargado de guardar los rectangulos en la lista
     */
    public void guardarRectangulos(Rectangulo a){
        this.listaRectangulos.add(a);
               
   }
    
    /**
     * @return the listaRectangulos
     */
    public ArrayList<Rectangulo> getListaRectangulos() {
        return listaRectangulos;
    }

    /**
     * @param listaRectangulos the listaRectangulos to set
     */
    public void setListaRectangulos(ArrayList<Rectangulo> listaRectangulos) {
        this.listaRectangulos = listaRectangulos;
    }
    
    
}
