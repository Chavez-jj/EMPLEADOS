package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
private String nombre;
private List<Empleado> empleados;



public Empresa (String nombre){
    this.nombre=nombre;
    this.empleados =new ArrayList<>();

}



public String getNombre() {
    return nombre;
}



public void setNombre(String nombre) {
    this.nombre = nombre;
}

 

public List<Empleado> getEmpleados() {
    return empleados;
}



public void setEmpleados(List<Empleado> empleados) {
    this.empleados = empleados;
}

    
}
