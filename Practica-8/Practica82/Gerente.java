package mx.unam.fi.poo.g1.p8;

/**
 * Subclase Gerente de la clase Empleado
 * @author Haziel Alvarez
 * @version Octubre 2024
 */
public class Gerente extends Empleado{
    
    /**
     * Método constrcutor
     * Inicializa un objeto Gerente con los siguientes atributos:
     * @param nombre -> Nombre del Gerente
     * @param rol -> Rol del Gerente
     */
    public Gerente(String nombre, String rol){
        super(nombre, rol);
    }

    /**
     * Sobrescribe el método calcularSalario
     * @param horas -> Horas trabajadas
     * @return salario -> Número de horas * 300 (x hora)
     */
    @Override
    public int calcularSalario(int horas){
        return horas * 300;
    }
}
