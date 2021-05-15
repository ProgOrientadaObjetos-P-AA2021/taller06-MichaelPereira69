/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author bitxanax
 */
public class Hospital {

    private String nombre,
            direccion;
    private int especialidades;
    private Ciudad ciudad;
    private double sueldosCancelar;

    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<>();


    public Hospital(String nombre, String direccion, int especialidades, Ciudad ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidades = especialidades;
        this.ciudad = ciudad;

    }

    public int Especialidades() {
        return especialidades;
    }

    public void Especialidades(int especialidades) {
        this.especialidades = especialidades;
    }

    public String Nombre() {
        return nombre;
    }

    public ArrayList<Medico> Medicos() {
        return medicos;
    }

    public String MedicosInfo() {
        String info = "";
        for (Medico i : medicos) {
            info += i.toString();
        }
        return info;
    }

    public String EnfermerosInfo() {
        String info = "";
        for (Enfermero i : enfermeros) {
            info += i.toString();
        }
        return info;
    }

    public void Medicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Enfermero> Enfermeros() {
        return enfermeros;
    }

    public void Enfermeros(ArrayList<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Direccion() {
        return direccion;
    }

    public void Direccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad Ciudad() {
        return ciudad;
    }

    public void Ciudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public double sueldosCancelar() {
        return sueldosCancelar;
    }

    public void calcularSueldosCancelar() {
        for (Medico i : medicos) {
            this.sueldosCancelar += i.SueldoMensual();
        }
        for (Enfermero i : enfermeros) {
            this.sueldosCancelar += i.getSueldoMensual();
        }
    }

    public void addMedico(Medico medico) {
        medicos.add(medico);
    }

    public void Enfermero(Enfermero enfermero) {
        enfermeros.add(enfermero);
    }

    @Override
    public String toString() {
        return String.format(
                ">>>>>>>>>>>>>>>>HOSPITAL  %s<<<<<<<<<<<<<<<<<\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de especialidades: %s\n"
                + "Lista de médicos ingresados: \n%s\n"
                + "Lista de enferemeros o enfermeras ingesados: \n%s\n"
                + "Su sueldo a pagar por cada mes es de: %s\n",
                nombre, direccion, ciudad.getNombre(), ciudad.getProvinciaNombre(),
                especialidades, MedicosInfo(), EnfermerosInfo(), sueldosCancelar);
    }

}