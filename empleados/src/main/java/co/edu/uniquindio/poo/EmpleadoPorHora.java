package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado {
    public int horasTrabajadas, salarioPorHora, pagoTotal;



    public EmpleadoPorHora(String nombre, int Id,int horasTrabajadas, int salarioPorHora){
        super(nombre,Id);
        this.horasTrabajadas=horasTrabajadas;
        this.salarioPorHora=salarioPorHora;
    }
    @Override
 public int calcularSalario(){
    int pagoTotal = 0;
    pagoTotal = horasTrabajadas * salarioPorHora;




    return pagoTotal;
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
