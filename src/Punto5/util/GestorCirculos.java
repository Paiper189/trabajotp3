/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5.util;

import Punto5.dominio.Circulo;
import java.util.ArrayList;

/**
 *
 * @author kuru
 */
public class GestorCirculos {
    private ArrayList<Circulo> Circulos = new ArrayList();

    /**
     * @return the Circulos
     */
    public ArrayList<Circulo> getCirculos() {
        return Circulos;
    }

    /**
     * @param Circulos the Circulos to set
     */
    public void setCirculos(ArrayList<Circulo> Circulos) {
        this.Circulos = Circulos;
    }
    
    public void AgregarCirculo(Circulo unCirculo){
        this.Circulos.add(unCirculo);
    }
    
}
