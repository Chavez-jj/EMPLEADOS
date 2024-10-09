package co.edu.uniquindio.poo;

public class EmpleadpFreelance extends Empleado {
    public int proyectosCompletados, pagoPorProyecto,pagoTotal;

    public EmpleadpFreelance(String Nombre, int Id, int proyectosCompletados, int pagoPorProyecto){
        super(Nombre, Id);
        this.proyectosCompletados=proyectosCompletados;
        this.pagoPorProyecto=pagoPorProyecto;


    }
    public int calcularSalario(){
        int pagoTotal = 0;
        pagoTotal= proyectosCompletados * pagoPorProyecto;


        return pagoTotal;
    } 

    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public int getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(int pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }
    
}
