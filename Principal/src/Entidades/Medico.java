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
public class Medico {
    
    private String nom, especialidad;
    private double sueldoMensual;

    public Medico(String nombre, String especialidad, double sueldMen) {
        this.nom = nombre;
        this.especialidad = especialidad;
        this.sueldoMensual = sueldMen;
    }

    public String Nombre() {
        return nom;
    }

    public void Nombre(String nombre) {
        this.nom = nombre;
    }

    public String Especialidad() {
        return especialidad;
    }

    public void Especialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double SueldoMensual() {
        return sueldoMensual;
    }

    public void SueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public String toString() {
        return ">>>>" + nom + " >>>>Especialidad: " + especialidad
                + " >>>>Sueldo: " +  sueldoMensual + "\n";
    }

}