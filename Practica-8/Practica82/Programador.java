package mx.unam.fi.poo.g1.p8;

/**
 * Subclase Programador de la clase Empleado
 * @author Haziel Alvarez
 * @version Octubre 2024
 */
public class Programador extends Empleado{

    /**
     * Método constrcutor
     * Inicializa un objeto Programador con los siguientes atributos:
     * @param nombre -> Nombre del programador
     * @param rol -> Rol del programador
     */
    public Programador(String nombre, String rol){
        super(nombre, rol);
    }

    /**
     * Sobrescribe el método calcularSalario
     * @param horas -> Horas trabajadas
     * @return salario -> Número de horas * 600 (x hora)
     */
    @Override
    public int calcularSalario(int horas){
        return horas * 600;
    }
}
