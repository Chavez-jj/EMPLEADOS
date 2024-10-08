package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado {
    private int salarioMensual;
    
    public EmpleadoTiempoCompleto(String nombre,int Id, int salarioMensual){
        super(nombre,Id);
        this.salarioMensual=salarioMensual;
    }

@Override
 public int calcularSalario(){

    return salarioMensual;
}

public int getSalarioMensual() {
    return salarioMensual;
}

public void setSalarioMensual(int salarioMensual) {
    this.salarioMensual = salarioMensual;
}

@Override
public String toString(){
    return super.toString()+ ", salario mensual=" + salarioMensual;
}


}
