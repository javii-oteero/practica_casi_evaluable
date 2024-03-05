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

    // HASTA AQUI PRIMEROS 5 TESTS

    @Test
    void calcularSalarioNeto999Con99(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(999.99, empleado.calcularSalarioNeto(999.99f), 0.0001);
    }

    @Test
    void calcularSalarioNeto500(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(500, empleado.calcularSalarioNeto(500));
    }

    @Test
    void calcularSalarioNeto0(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(0, empleado.calcularSalarioNeto(0));
    }

    @Test
    void calcularSalarioNetoNegativo(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(-1, empleado.calcularSalarioNeto(-1));
    }

    @Test
    void calculaSalarioBrutoVendedor20008h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 2000, 8);
        assertEquals(1360, empleado.calcularSalarioBruto());
    }

// HASTA AQUI SEGUNDOS 5 TESTS
}