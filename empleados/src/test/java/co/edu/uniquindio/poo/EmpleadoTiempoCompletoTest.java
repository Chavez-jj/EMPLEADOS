package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoTiempoCompletoTest {

    /*
     * Prueba con assertEquals para calcularSalario
     */
    @Test
    void testCalcularSalario() {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Juan", 101, 3000);
        int salarioEsperado = 3000;
        assertEquals(salarioEsperado, empleado.calcularSalario(), 
                     "El salario calculado no es correcto");
    }

    /*
     * Prueba con assertEquals para verificar el salario mensual
     */
    @Test
    void testGetSalarioMensual() {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("María", 102, 2500);
        assertEquals(2500, empleado.getSalarioMensual(), 
                     "El salario mensual no coincide con el esperado");
    }

    /*
     * Prueba con assertEquals para el setter de salario mensual
     */
    @Test
    void testSetSalarioMensual() {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Pedro", 103, 2000);
        empleado.setSalarioMensual(2800);
        assertEquals(2800, empleado.getSalarioMensual(), 
                     "El salario mensual no se ha actualizado correctamente");
    }

    /*
     * Prueba con assertTrue para verificar que el salario no sea negativo
     */
    @Test
    void testSalarioNegativo() {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Ana", 104, 1500);
        assertTrue(empleado.getSalarioMensual() > 0, 
                   "El salario mensual debería ser positivo");
    }

    /*
     * Prueba con assertThrows para validar que los ID negativos no son permitidos 
     */
    @Test
    void testThrowsExceptionForInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmpleadoTiempoCompleto("Luis", -1, 3000);
        }, "Se esperaba una IllegalArgumentException por un ID negativo.");
    }

    /*
     * Prueba con assertEquals para el método toString
     */
    @Test
    void testToString() {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Laura", 105, 3500);
        String esperado = "Empleado [nombre=Laura, Id=105], salario mensual=3500";
        assertEquals(esperado, empleado.toString(), "La representación en cadena del empleado no es correcta");
    }
}
