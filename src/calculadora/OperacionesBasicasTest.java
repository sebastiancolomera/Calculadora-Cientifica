package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperacionesBasicasTest {

    private OperacionesBasicas calc = new OperacionesBasicas();

    @Test
    void testSumarNumerosPositivos() {
        assertEquals(8, calc.sumar(5, 3));
    }

    @Test
    void testSumarNumerosNegativos() {
        assertEquals(-8, calc.sumar(-5, -3));
    }

    @Test
    void testRestarNumerosPositivos() {
        assertEquals(2, calc.restar(5, 3));
    }

    @Test
    void testRestarConResultadoNegativo() {
        assertEquals(-2, calc.restar(3, 5));
    }

    @Test
    void testMultiplicarNumerosPositivos() {
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    void testMultiplicarPorCero() {
        assertEquals(0, calc.multiplicar(5, 0));
    }

    @Test
    void testDividirNumerosPositivos() {
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    void testDividirPorZeroLanzaExcepcion() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    @Test
    void testPotenciaBasePositiva() {
        assertEquals(8, calc.potencia(2, 3));
    }

    @Test
    void testPotenciaExponenteCero() {
        assertEquals(1, calc.potencia(5, 0));
    }

    @Test
    void testEcuacionCuadraticaDosRaices() {
        double[] raices = calc.resolverEcuacionCuadratica(1, -5, 6);
        assertArrayEquals(new double[]{3.0, 2.0}, raices);
    }

    @Test
    void testEcuacionCuadraticaSinRaicesReales() {
        double[] raices = calc.resolverEcuacionCuadratica(1, 0, 1);
        assertEquals(0, raices.length);
    }
}