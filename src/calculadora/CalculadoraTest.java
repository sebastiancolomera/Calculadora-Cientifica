package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

        @Test
        public void testPerimetroCuadrado_NumeroEntero() {
            assertEquals(20.0, Geometria.perimetroCuadrado(5.0), 0.001);
        }

        @Test
        public void testPerimetroCuadrado_NumeroDecimal() {
            assertEquals(10.0, Geometria.perimetroCuadrado(2.5), 0.001);
        }

        @Test
        public void testAreaCuadrado_NumeroEntero() {
            assertEquals(25.0, Geometria.areaCuadrado(5.0), 0.001);
        }

        @Test
        public void testAreaCuadrado_NumeroDecimal() {
            assertEquals(6.25, Geometria.areaCuadrado(2.5), 0.001);
        }

        @Test
        public void testPerimetroRectangulo_NumerosEnteros() {
            assertEquals(18.0, Geometria.perimetroRectangulo(4.0, 5.0), 0.001);
        }

        @Test
        public void testPerimetroRectangulo_NumerosDecimales() {
            assertEquals(13.4, Geometria.perimetroRectangulo(2.5, 4.2), 0.001);
        }

        @Test
        public void testAreaRectangulo_NumerosEnteros() {
            assertEquals(20.0, Geometria.areaRectangulo(4.0, 5.0), 0.001);
        }

        @Test
        public void testAreaRectangulo_NumerosDecimales() {
            assertEquals(10.5, Geometria.areaRectangulo(2.5, 4.2), 0.001);
        }

        // --- CÍRCULO ---
        @Test
        public void testPerimetroCirculo_RadioEntero() {
            assertEquals(18.8495, Geometria.perimetroCirculo(3.0), 0.0001);
        }

        @Test
        public void testPerimetroCirculo_RadioDecimal() {
            assertEquals(65.9734, Geometria.perimetroCirculo(10.5), 0.0001);
        }

        @Test
        public void testAreaCirculo_RadioEntero() {
            assertEquals(28.2743, Geometria.areaCirculo(3.0), 0.0001);
        }

        @Test
        public void testAreaCirculo_RadioDecimal() {
            assertEquals(346.3605, Geometria.areaCirculo(10.5), 0.0001);
        }

        @Test
        public void testAreaCubo_NumeroEntero() {
            assertEquals(54.0, Geometria.areaCubo(3.0), 0.001);
        }

        @Test
        public void testAreaCubo_NumeroDecimal() {
            assertEquals(13.5, Geometria.areaCubo(1.5), 0.001);
        }

        @Test
        public void testVolumenCubo_NumeroEntero() {
            assertEquals(27.0, Geometria.volumenCubo(3.0), 0.001);
        }

        @Test
        public void testVolumenCubo_NumeroDecimal() {
            assertEquals(3.375, Geometria.volumenCubo(1.5), 0.001);
        }

        @Test
        public void testAreaEsfera_RadioEntero() {
            assertEquals(113.0973, Geometria.areaEsfera(3.0), 0.0001);
        }

        @Test
        public void testAreaEsfera_RadioDecimal() {
            assertEquals(78.5398, Geometria.areaEsfera(2.5), 0.0001);
        }

        @Test
        public void testVolumenEsfera_RadioEntero() {
            assertEquals(113.0973, Geometria.volumenEsfera(3.0), 0.0001);
        }

        @Test
        public void testVolumenEsfera_RadioDecimal() {
            assertEquals(65.4498, Geometria.volumenEsfera(2.5), 0.0001);
        }

        @Test
        public void testAreaCono_ValoresEnteros_TrianguloPitagorico() {
            assertEquals(75.3982, Geometria.areaCono(3.0, 4.0), 0.0001);
        }

        @Test
        public void testAreaCono_ValoresDecimales() {
            assertEquals(18.8495, Geometria.areaCono(1.5, 2.0), 0.0001);
        }

        @Test
        public void testVolumenCono_ValoresEnteros() {
            assertEquals(37.6991, Geometria.volumenCono(3.0, 4.0), 0.0001);
        }

        @Test
        public void testVolumenCono_ValoresDecimales() {
            assertEquals(4.7123, Geometria.volumenCono(1.5, 2.0), 0.0001);
        }
    }
