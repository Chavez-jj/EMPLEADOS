package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoFreelanceTest {

    /*
     * Prueba con assertEquals para calcularSalario
     */
    @Test
    void testCalcularSalario() {
        EmpleadpFreelance empleado = new EmpleadpFreelance("Juan", 101, 5, 200);
        int salarioEsperado = 5 * 200;
        assertEquals(salarioEsperado, empleado.calcularSalario(), 
                     "El salario calculado no es correcto");
    }

    /*
     * Prueba con assertEquals para verificar los proyectos completados
     */
    @Test
    void testGetProyectosCompletados() {
        EmpleadpFreelance empleado = new EmpleadpFreelance("María", 102, 8, 150);
        assertEquals(8, empleado.getProyectosCompletados(), 
                     "El número de proyectos completados no coincide con el esperado");
    }

    /*
     * Prueba con assertEquals para el setter de proyectos completados
     */
    @Test
    void testSetProyectosCompletados() {
        EmpleadpFreelance empleado = new EmpleadpFreelance("Pedro", 103, 3, 300);
        empleado.setProyectosCompletados(10);
        assertEquals(10, empleado.getProyectosCompletados(), 
                     "El número de proyectos completados no se ha actualizado correctamente");
    }

    /*
     * Prueba con assertEquals para verificar el pago por proyecto
     */
    @Test
    void testGetPagoPorProyecto() {
        EmpleadpFreelance empleado = new EmpleadpFreelance("Ana", 104, 4, 500);
        assertEquals(500, empleado.getPagoPorProyecto(), 
                     "El pago por proyecto no coincide con el esperado");
    }

    /*
     * Prueba con assertEquals para el setter de pago por proyecto
     */
    @Test
    void testSetPagoPorProyecto() {
        EmpleadpFreelance empleado = new EmpleadpFreelance("Luis", 105, 2, 250);
        empleado.setPagoPorProyecto(400);
        assertEquals(400, empleado.getPagoPorProyecto(), 
                     "El pago por proyecto no se ha actualizado correctamente");
    }

    /*
     * Prueba con assertThrows para validar que los ID negativos no son permitidos 
     */
    @Test
    void idNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmpleadpFreelance("Laura", -1, 5, 300);
        }, "Se esperaba una IllegalArgumentException por un ID negativo.");
    }

    /*
     * Prueba con assertEquals para el método toString
     */
    @Test
    void testToString() {
        EmpleadpFreelance empleado = new EmpleadpFreelance("Carlos", 106, 3, 600);
        empleado.calcularSalario(); // Calcula el salario para el toString
        String expected = "EmpleadpFreelance [proyectosCompletados=3, pagoPorProyecto=600, pagoTotal=1800]";
        assertEquals(expected, empleado.toString(), "La representación en cadena del empleado no es correcta");
    }
}
