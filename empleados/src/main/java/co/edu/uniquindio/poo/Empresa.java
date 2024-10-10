package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una empresa.
 */
public class Empresa {
    // Nombre de la empresa
    private String nombre;
    // Lista de empleados de la empresa
    private List<Empleado> empleados;

    /**
     * Constructor de la clase Empresa.
     * 
     * @param nombre Nombre de la empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre; // Establece el nombre de la empresa
        this.empleados = new ArrayList<>(); // Inicializa la lista de empleados
    }

    /**
     * Obtiene el nombre de la empresa.
     * 
     * @return El nombre de la empresa
     */
    public String getNombre() {
        return nombre; // Retorna el nombre de la empresa
    }

    /**
     * Establece el nombre de la empresa.
     * 
     * @param nombre Nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nuevo nombre de la empresa
    }

    /**
     * Obtiene la lista de empleados de la empresa.
     * 
     * @return La lista de empleados
     */
    public List<Empleado> getEmpleados() {
        return empleados; // Retorna la lista de empleados
    }

    /**
     * Establece la lista de empleados de la empresa.
     * 
     * @param empleados Lista de empleados a establecer
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados; // Establece la nueva lista de empleados
    }
}
