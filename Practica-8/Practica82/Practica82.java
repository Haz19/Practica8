package mx.unam.fi.poo.g1.p8;

/**
 * Clase principal de la Practica82
 * @author Haziel Alvarez
 * @version Octubre 2024
 */
public class Practica82 {

    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        System.out.println("-- Bienvenid@ --");

        System.out.println("Datos de nuestro equipo: ");
        System.out.println();

        Gerente gerente = new Gerente("Haziel Alvarez", "Gerente");
        System.err.println("Datos del Gerente: ");
        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("Rol: " + gerente.getRol());

        System.out.println();

        Programador programador = new Programador("Elena Alvarez", "Programador");
        System.err.println("Datos del Programador: ");
        System.out.println("Nombre: " + programador.getNombre());
        System.out.println("Rol: " + programador.getRol());

        System.out.println();

        System.out.println("Su salario es: ");
        System.out.println("Gerente: " + "$" + gerente.calcularSalario(40));
        System.out.println("Programador: " + "$" + programador.calcularSalario(50));
    }
}
