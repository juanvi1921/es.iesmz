import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    @Test
    void testCalculaSalarioBruto() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 2000.0f, 8.0f);
        float resultadoEsperado = 1360.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000);
        float resultadoEsperado = 1640;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500);
        float resultadoEsperado = 1230;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1250);
        float resultadoEsperado = 1050;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    
}