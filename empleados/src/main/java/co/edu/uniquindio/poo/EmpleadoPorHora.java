package co.edu.uniquindio.poo;

/**
 * Clase que representa a un empleado que trabaja por horas.
 */
public class EmpleadoPorHora extends Empleado {
    // Horas trabajadas por el empleado
    public int horasTrabajadas;
    // Salario por hora del empleado
    public int salarioPorHora;
    // Pago total calculado para el empleado
    public int pagoTotal;

    /**
     * Constructor de la clase EmpleadoPorHora.
     * 
     * @param nombre Nombre del empleado
     * @param Id ID del empleado
     * @param horasTrabajadas Horas trabajadas por el empleado
     * @param salarioPorHora Salario por hora del empleado
     */
    public EmpleadoPorHora(String nombre, int Id, int horasTrabajadas, int salarioPorHora) {
        super(nombre, Id);
        this.horasTrabajadas = horasTrabajadas; // Establece las horas trabajadas
        this.salarioPorHora = salarioPorHora;   // Establece el salario por hora
        this.pagoTotal = calcularSalario();     // Calcula el pago total inicial
    }

    /**
     * Método que calcula el salario total del empleado basado en horas trabajadas y salario por hora.
     * 
     * @return El pago total calculado
     */
    @Override
    public int calcularSalario() {
        int pagoTotal = 0; // Inicializa el pago total
        pagoTotal = horasTrabajadas * salarioPorHora; // Calcula el pago total
        return pagoTotal; // Retorna el pago total
    }

    /**
     * Obtiene las horas trabajadas por el empleado.
     * 
     * @return Las horas trabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas; // Retorna las horas trabajadas
    }

    /**
     * Establece las horas trabajadas por el empleado.
     * 
     * @param horasTrabajadas Horas trabajadas a establecer
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas; // Establece las horas trabajadas
    }

    /**
     * Obtiene el salario por hora del empleado.
     * 
     * @return El salario por hora
     */
    public int getSalarioPorHora() {
        return salarioPorHora; // Retorna el salario por hora
    }

    /**
     * Establece el salario por hora del empleado.
     * 
     * @param salarioPorHora Salario por hora a establecer
     */
    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora; // Establece el nuevo salario por hora
    }

    /**
     * Método que devuelve una representación en cadena del empleado por hora.
     * 
     * @return La representación en cadena del empleado
     */
    @Override
    public String toString() {
        return "EmpleadoPorHora [horasTrabajadas=" + horasTrabajadas + ", salarioPorHora=" + salarioPorHora
                + ", pagoTotal=" + pagoTotal + "]"; // Incluye horas trabajadas, salario por hora y pago total
    }
}
