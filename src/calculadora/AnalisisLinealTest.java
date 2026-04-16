package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AnalisisLinealTest {

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

    @Test
    void testEcuacionRectaExitosa() {
        AnalisisLineal al = new AnalisisLineal();
        // Puntos (0,0) y (2,4) -> La pendiente debería ser 2 y el intercepto 0 (y = 2x)
        double[] resultado = al.obtenerEcuacionRecta(0, 0, 2, 4);

        assertArrayEquals(new double[]{2.0, 0.0}, resultado, 0.001);
    }

    @Test
    void testEcuacionRectaVertical() {
        AnalisisLineal al = new AnalisisLineal();
        // Puntos (2,5) y (2,10) -> x1 y x2 son iguales, debe fallar
        assertThrows(ArithmeticException.class, () -> {
            al.obtenerEcuacionRecta(2, 5, 2, 10);
        });
    }
}