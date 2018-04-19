/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5.dominio;

/**
 *
 * @author kuru
 */
public class Circulo {
    private double radio, circunferencia,diametro;

    public Circulo(double radio, double circunferencia, double diametro) {
        this.radio = radio;
        this.circunferencia = circunferencia;
        this.diametro = diametro;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the circunferencia
     */
    public double getCircunferencia() {
        return circunferencia;
    }

    /**
     * @param circunferencia the circunferencia to set
     */
    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    /**
     * @return the diametro
     */
    public double getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
