package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    @BeforeEach
    void setUp() {
        System.out.println("EXECUTE PROVA");
    }

    @Test
    void testcalculaSalarioNeto2000() {
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1640, empleado.calcularSalarioNeto(2000));
    }

    @Test
    void testcalcularSalarioNeto1500() {
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1230, empleado.calcularSalarioNeto(1500));
    }

    @Test
    void testcalcularSalarioNeto1499Con99(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1259.9916, empleado.calcularSalarioNeto(1499.99f), 0.0001);
    }

    @Test
    void testcalcularSalarioNeto1250(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(1050, empleado.calcularSalarioNeto(1250));
    }

    @Test
    void testcalcularSalarioNeto1000(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(840, empleado.calcularSalarioNeto(1000));
    }

    // HASTA AQUI PRIMEROS 5 TESTS

    @Test
    void testcalcularSalarioNeto999Con99(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(999.99, empleado.calcularSalarioNeto(999.99f), 0.0001);
    }

    @Test
    void testcalcularSalarioNeto500(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(500, empleado.calcularSalarioNeto(500));
    }

    @Test
    void testcalcularSalarioNeto0(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(0, empleado.calcularSalarioNeto(0));
    }

    @Test
    void testcalcularSalarioNetoNegativo(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 0, 0);
        assertEquals(-1, empleado.calcularSalarioNeto(-1));
    }

    @Test
    void testcalculaSalarioBrutoVendedor20008h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 2000, 8);
        assertEquals(1360, empleado.calcularSalarioBruto());
    }

// HASTA AQUI SEGUNDOS 5 TESTS

    @Test
    void testcalculaSalarioBrutoVendedor15003h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 1500, 3);
        assertEquals(1260, empleado.calcularSalarioBruto());
    }

    @Test
    void testcalculaSalarioBrutoVendedor1499Con99Y0h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 1499.99f, 0);
        assertEquals(1100, empleado.calcularSalarioBruto(), 0.0001);
    }

    @Test
    void testcalculaSalarioBrutoEncargado12508h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.encargado, 1250, 8);
        assertEquals(1760, empleado.calcularSalarioBruto());
    }

    @Test
    void testcalculaSalarioBrutoEncargado1000Y0h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.encargado, 1000, 0);
        assertEquals(1600, empleado.calcularSalarioBruto());
    }

    @Test
    void testcalculaSalarioBrutoEncargado999Con99Y3h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.encargado, 999.99f, 3);
        assertEquals(1560, empleado.calcularSalarioBruto(), 0.0001);
    }

    //HASTA AQUI 15 TESTS PASADOS

    @Test
    void testcalculaSalarioBrutoEncargado500Y0h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.encargado, 500, 0);
        assertEquals(1500, empleado.calcularSalarioBruto());
    }

    @Test
    void testCalculaSalarioBrutoEncargado0y8h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.encargado, 0, 8);
        assertEquals(1660, empleado.calcularSalarioBruto());
    }

    @Test
    void testCalculaSalarioBrutoVendedorMenos1y8h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, -1, 8);
        assertEquals(-1, empleado.calcularSalarioBruto());
    }

    @Test
    void testCalculaSalarioBrutoVendedor1500yMenos1h(){
        EmpleadoBR empleado = new EmpleadoBR(TipoEmpleado.vendedor, 1500, -1);
        assertEquals(-1, empleado.calcularSalarioBruto());
    }

    @Test
    void testCalculaSalarioBrutoNull1500y8h(){
        EmpleadoBR empleado = new EmpleadoBR(null, 1500, 8);
        assertEquals(-1, empleado.calcularSalarioBruto());
    }
}