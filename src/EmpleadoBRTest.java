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

    @Test
    void testCalculaSalarioNeto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1000);
        float resultadoEsperado = 840;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(500);
        float resultadoEsperado = 500;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(0);
        float resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioNeto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(-1);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioBruto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 2000, 8);
        float resultadoEsperado = 1360;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioBruto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1500, 3);
        float resultadoEsperado = 1260;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioBruto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1499.99f, 0);
        float resultadoEsperado = 1100;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioBruto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1250, 8);
        float resultadoEsperado = 1760;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    void testCalculaSalarioBruto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1000, 0);
        float resultadoEsperado = 1600;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}