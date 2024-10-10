 /**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EmpleadoPorHoraTest {
 /*
  * Prueba con assertEquals para calcularSalario
  */
    @Test
    void testCalcularSalario() {
        EmpleadoPorHora empleado = new EmpleadoPorHora("Juan", 101, 40, 15);
        int salarioEsperado = 40 * 15;
        assertEquals(salarioEsperado, empleado.calcularSalario(), 
                     "El salario calculado no es correcto");
    }

    /*
     * Prueba con assertIterableEquals usando ArrayList
     */
    @Test
    void testIterableEquals() {
        EmpleadoPorHora empleado1 = new EmpleadoPorHora("Juan", 101, 40, 15);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("María", 102, 35, 20);
        EmpleadoPorHora empleado3 = new EmpleadoPorHora("Pedro", 103, 25, 30);
        
        ArrayList<Integer> horasEsperadas = new ArrayList<>();
        horasEsperadas.add(40); 
        horasEsperadas.add(35); 
        horasEsperadas.add(25); 

        ArrayList<Integer> horasObtenidas = new ArrayList<>();
        horasObtenidas.add(empleado1.getHorasTrabajadas());
        horasObtenidas.add(empleado2.getHorasTrabajadas());
        horasObtenidas.add(empleado3.getHorasTrabajadas());

        assertIterableEquals(horasEsperadas, horasObtenidas, "Las horas trabajadas no coinciden");
    }

    /*
     * Prueba con assertTrue para valores negativos en el salario
     */
    @Test
    void testSalarioNegativo() {
        EmpleadoPorHora empleado = new EmpleadoPorHora("Carlos", 104, 10, 15);
        assertTrue(empleado.calcularSalario() > 0, 
                   "El salario debería ser positivo si el salario por hora es positivo");
    }

    /*
     *Prueba con assertThrows para validar que los ID negativos no son permitidos 
     */
    @Test
    void testThrowsExceptionForInvalidId() {
        /*
         * Comprobamos que al crear un empleado con ID negativo, se lanza IllegalArgumentException
         */
        assertThrows(IllegalArgumentException.class, () -> {
            new EmpleadoPorHora("Ana", -1, 40, 15);
        }, "Se esperaba una IllegalArgumentException por un ID negativo.");
    }
}