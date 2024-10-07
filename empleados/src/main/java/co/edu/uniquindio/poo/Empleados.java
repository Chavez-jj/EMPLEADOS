package co.edu.uniquindio.poo;

public abstract class Empleados {
    private String nombre; 
    private int Id; 
    private int salario;


/**
 * metodo contructor de la clase empleado
 * @param nombre
 * @param Id
 * @param salario
 */
    public Empleados(String nombre,int Id,int salario){
        this.nombre=nombre;
        this.Id=Id;
        this.salario=salario;
    }
/**
 * 
 * Metodo abtracto para calcular el salario
 */
    public abstract int calcularSalario();

/**
 * 
 * Metodos getters y setters 
 */
public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public int getId() {
    return Id;
}


public void setId(int id) {
   this.Id = id;
}

public int getsalario(){
    return salario;
}

public void setsalario(int salario){
    this.salario=salario;
}
}
 