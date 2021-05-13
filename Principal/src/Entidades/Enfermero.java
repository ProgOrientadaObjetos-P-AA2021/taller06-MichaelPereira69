/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author USUARIO
 */
public class Enfermero {

    private String nom, tipoNombramiento;
    private double sueldoMensual;

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public Enfermero(String nombre, String tipoNombramiento, double sueldoMensual) {
        this.nom = nombre;
        this.tipoNombramiento = tipoNombramiento;
        this.sueldoMensual = sueldoMensual;
    }

    public String getTipoNombramiento() {
        return tipoNombramiento;
    }

    public void setTipoNombramiento(String tipoNombramiento) {
        this.tipoNombramiento = tipoNombramiento;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
  @Override
    public String toString() {
        return nom + " >>>>Nombramiento: " + tipoNombramiento
                + " >>>>Sueldo: " + sueldoMensual + "\n";
    }

}
