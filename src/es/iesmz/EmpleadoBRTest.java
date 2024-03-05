package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    @Test
    void calculaSalarioNeto2000() {
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1640, empleado.calcularSalarioNeto(2000));
    }

    @Test
    void calcularSalarioNeto1500() {
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1230, empleado.calcularSalarioNeto(1500));
    }

    @Test
    void calcularSalarioNeto1499Con99(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1259.9916, empleado.calcularSalarioNeto(1499.99f), 0.0001);
    }

    @Test
    void calcularSalarioNeto1250(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1050, empleado.calcularSalarioNeto(1250));
    }

    @Test
    void calcularSalarioNeto1000(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(840, empleado.calcularSalarioNeto(1000));
    }
}