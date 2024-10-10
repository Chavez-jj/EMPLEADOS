package co.edu.uniquindio.poo;

/**
 * Clase que representa a un empleado freelance, que se paga por proyectos completados.
 */
public class EmpleadpFreelance extends Empleado {
    // Número de proyectos completados por el empleado
    public int proyectosCompletados;
    
    // Pago por cada proyecto completado
    public int pagoPorProyecto;
    
    // Pago total calculado a partir de proyectos completados y pago por proyecto
    public int pagoTotal;

    /**
     * Constructor de la clase EmpleadpFreelance.
     * 
     * @param Nombre Nombre del empleado
     * @param Id ID del empleado
     * @param proyectosCompletados Número de proyectos completados
     * @param pagoPorProyecto Pago por cada proyecto
     */
    public EmpleadpFreelance(String Nombre, int Id, int proyectosCompletados, int pagoPorProyecto) {
        super(Nombre, Id);
        validarIdNegativo(Id);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyecto;
        this.pagoTotal = calcularSalario(); // Calcula el salario total al momento de la creación
    }

    /**
     * Método que calcula el salario total del empleado freelance.
     * 
     * @return El salario total calculado
     */
    public int calcularSalario() {
        int pagoTotal = 0;
        pagoTotal = proyectosCompletados * pagoPorProyecto; // Calcula el total
        return pagoTotal;
    }

    /**
     * Método para validar que el ID no sea negativo.
     * 
     * @param Id ID a validar
     * @throws IllegalArgumentException Si el ID es negativo
     */
    public void validarIdNegativo(int Id) {
        if (Id < 0) {
            throw new IllegalArgumentException("El ID no puede ser negativo.");
        }
    }

    /**
     * Obtiene el número de proyectos completados por el empleado.
     * 
     * @return El número de proyectos completados
     */
    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    /**
     * Establece el número de proyectos completados por el empleado.
     * 
     * @param proyectosCompletados Número de proyectos completados a establecer
     */
    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    /**
     * Obtiene el pago por cada proyecto completado.
     * 
     * @return El pago por proyecto
     */
    public int getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    /**
     * Establece el pago por cada proyecto completado.
     * 
     * @param pagoPorProyecto Pago por proyecto a establecer
     */
    public void setPagoPorProyecto(int pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    /**
     * Método que devuelve una representación en cadena del empleado freelance.
     * 
     * @return La representación en cadena del empleado
     */
    @Override
    public String toString() {
        return "EmpleadpFreelance [proyectosCompletados=" + proyectosCompletados + ", pagoPorProyecto="
                + pagoPorProyecto + ", pagoTotal=" + pagoTotal + "]";
    }
}
