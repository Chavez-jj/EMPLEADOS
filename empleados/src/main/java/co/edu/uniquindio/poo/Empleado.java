package co.edu.uniquindio.poo;

/**
 * Clase abstracta que representa un empleado.
 */
public abstract class Empleado {
    // Nombre del empleado
    private String nombre; 
    // ID del empleado
    private int Id; 

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre Nombre del empleado
     * @param Id ID del empleado
     */
    public Empleado(String nombre, int Id) {
        this.nombre = nombre; // Establece el nombre del empleado
        this.Id = Id;         // Establece el ID del empleado
    }

    /**
     * Método abstracto para calcular el salario del empleado.
     * 
     * @return El salario calculado
     */
    public abstract int calcularSalario();

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre del empleado
     */
    public String getNombre() {
        return nombre; // Retorna el nombre del empleado
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre Nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nuevo nombre
    }

    /**
     * Obtiene el ID del empleado.
     * 
     * @return El ID del empleado
     */
    public int getId() {
        return Id; // Retorna el ID del empleado
    }

    /**
     * Establece el ID del empleado.
     * 
     * @param id ID a establecer
     */
    public void setId(int id) {
        this.Id = id; // Establece el nuevo ID
    }

    /**
     * Método que devuelve una representación en cadena del empleado.
     * 
     * @return La representación en cadena del empleado
     */
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", Id=" + Id + "]"; // Incluye nombre e ID
    }
}
