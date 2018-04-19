/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8.dominio;

import java.util.ArrayList;

/**
 *
 * @author Win8
 */
public class GestorLibros {
    private ArrayList<Libro> listaLibros=new ArrayList();

    
    public void guardarLibro(Libro libro){
        listaLibros.add(libro);
    }
    /**
     * @return the listaLibros
     */
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    /**
     * @param listaLibros the listaLibros to set
     */
    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    
    
}
