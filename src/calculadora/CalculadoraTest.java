package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculadoraTest {

    @Test
    void testResolverSistema2x2() {
        AnalisisLineal analisis = new AnalisisLineal();

        // Caso 1: Sistema con solución única (x=1, y=1)
        // Cambiamos el 6 por 5 para que la matemática calce perfecta
        double[] resultado1 = analisis.resolverSistema2x2(2, 3, 5, 1, 4, 5);

        // Agregamos 0.001 como margen de error para los decimales
        assertArrayEquals(new double[]{1.0, 1.0}, resultado1, 0.001, "El sistema debería resolver a x=1 y y=1");

        // Caso 2: Sistema sin solución única (determinante cero)
        assertThrows(ArithmeticException.class, () -> {
            analisis.resolverSistema2x2(1, 2, 3, 2, 4, 6);
        }, "El sistema no debería tener solución única (determinante es cero)");
    }
}