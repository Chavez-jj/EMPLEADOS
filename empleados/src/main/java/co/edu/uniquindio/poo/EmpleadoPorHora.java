package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado {
    public int horasTrabajadas, salarioPorHora, pagoTotal;



    public EmpleadoPorHora(String nombre, int Id,int horasTrabajadas, int salarioPorHora){
        super(nombre,Id);
        validarIdNegativo(Id);
        this.horasTrabajadas=horasTrabajadas;
        this.salarioPorHora=salarioPorHora;
        this.pagoTotal = calcularSalario();
    }
    /**
     * Método que valida si el ID es negativo
     * @param Id
     */
    public void validarIdNegativo(int Id) {
        if (Id < 0) {
            throw new IllegalArgumentException("El ID no puede ser negativo.");
        }
    }

    @Override
    public int calcularSalario() {
        this.pagoTotal = horasTrabajadas * salarioPorHora;
        return this.pagoTotal;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getSalarioPorHora() {
        return salarioPorHora;
    }
    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    @Override
    public String toString() {
        return "EmpleadoPorHora [horasTrabajadas=" + horasTrabajadas + ", salarioPorHora=" + salarioPorHora
                + ", pagoTotal=" + pagoTotal + "]";
    } 

    
}
