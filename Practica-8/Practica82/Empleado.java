package mx.unam.fi.poo.g1.p8;

/**
 * Clase Empleado
 * @author Haziel Alvarez
 * @version Octubre 2024
 */
public class Empleado {
    private String nombre, rol;

    /**
     * Constructor
     * Inicializa un objeto Empleado con los siguientes atributos:
     * @param nombre -> Nombre del empleado
     * @param rol -> Rol del empleado
     */
    public Empleado(String nombre, String rol){
        setNombre(nombre);
        setRol(rol);
    }

    /**
     * Método Get
     * @return nombre -> Atributo del nombre del empleado
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Método Get
     * @return rol -> Atributo del rol del empleado
     */
    public String getRol(){
        return this.rol;
    }

    /**
     * Método Set
     * @param nombre -> Establece el nombre del empleado
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método Set
     * @param rol -> Establece el rol del empleado
     */
    public void setRol(String rol){
        this.rol = rol;
    }

    /**
     * Método calcularSalario
     * @param horas -> Horas trabajadas
     * @return salario -> Regresa el salario calculado
     */
    public int calcularSalario(int horas){
        return horas * 500;
    }
}
