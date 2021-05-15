
package principal;

import java.util.Scanner;
import Entidades.Hospital;
import Entidades.Ciudad;
import Entidades.Enfermero;
import Entidades.Medico;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nombre de la ciudad: ");
        String nombreCiudad = leer.nextLine();
        System.out.println("Nombre de la provincia: ");
        String nombreProvincia = leer.nextLine();
        Ciudad ciudad = new Ciudad(nombreCiudad, nombreProvincia);
        System.out.println("Nombre del hospital: ");
        String nombreHospital = leer.nextLine();
        System.out.println("Ingrese la dirección: ");
        String direccion = leer.nextLine();
        System.out.println("Cuantas Especialidades Tiene: ");
        int cantidadEspecialidades = Integer.parseInt(leer.nextLine());
        Hospital hospital = new Hospital(nombreHospital, direccion, cantidadEspecialidades, ciudad);
        System.out.println("Medicos ingresados: ");
        int cantidadMedicos = Integer.parseInt(leer.nextLine());
        System.out.println("Enfermeros ingresados: ");
        int cantidadEnfermeros = Integer.parseInt(leer.nextLine());
        Medicos(hospital, cantidadMedicos);
        leer.nextLine();
        Enfermeros(hospital, cantidadEnfermeros);
        hospital.calcularSueldosCancelar();
        System.out.println(hospital);
    }
    public static void Medicos(Hospital hospital, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Datos del medico: " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = leer.nextLine();
            System.out.print("Especialidad: ");
            String especialidad = leer.nextLine();
            System.out.print("Sueldo: ");
            double sueldo = leer.nextDouble();

            Medico medico = new Medico(nombre, especialidad, sueldo);
            hospital.addMedico(medico);
        }
    }

    public static void Enfermeros(Hospital hospital, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Datos de Enfermeros " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = leer.nextLine();
            
            System.out.print("Tipo nombramiento: ");
            String contrato = leer.nextLine();
            System.out.print("Sueldo: ");
            double sueldo = leer.nextDouble();

            Enfermero enfermero = new Enfermero(nombre, contrato, sueldo);
            hospital.Enfermero(enfermero);
        }

    }
}
