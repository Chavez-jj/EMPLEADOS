package co.edu.uniquindio.poo;

/**
 * Clase que representa a un empleado de tiempo completo.
 */
public class EmpleadoTiempoCompleto extends Empleado {
    // Salario mensual del empleado
    private int salarioMensual;
    
    /**
     * Constructor de la clase EmpleadoTiempoCompleto.
     * 
     * @param nombre Nombre del empleado
     * @param Id ID del empleado
     * @param salarioMensual Salario mensual del empleado
     */
    public EmpleadoTiempoCompleto(String nombre, int Id, int salarioMensual) {
        super(nombre, Id);
        validarIdNegativo(Id); // Valida que el ID no sea negativo
        this.salarioMensual = salarioMensual; // Establece el salario mensual
    }

    /**
     * Método que calcula el salario mensual del empleado.
     * 
     * @return El salario mensual
     */
    @Override
    public int calcularSalario() {
        return salarioMensual; // Retorna el salario mensual
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
     * Obtiene el salario mensual del empleado.
     * 
     * @return El salario mensual
     */
    public int getSalarioMensual() {
        return salarioMensual; // Retorna el salario mensual
    }

    /**
     * Establece el salario mensual del empleado.
     * 
     * @param salarioMensual Salario mensual a establecer
     */
    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual; // Establece el nuevo salario mensual
    }

    /**
     * Método que devuelve una representación en cadena del empleado de tiempo completo.
     * 
     * @return La representación en cadena del empleado
     */
    @Override
    public String toString() {
        return super.toString() + ", salario mensual=" + salarioMensual; // Incluye el salario mensual en la representación
    }
}
