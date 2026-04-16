package calculadora;

public class AnalisisLineal {

    /**
     * Resuelve un sistema de 2x2.
     * @return arreglo con [x, y] o lanza excepción si no hay solución.
     */
    public double[] resolverSistema2x2(double a, double b, double c, double d, double e, double f) throws ArithmeticException {
        // Determinante del sistema
        double det = (a * e) - (b * d);

        // Manejo de excepciones (División por cero)
        if (det == 0) {
            throw new ArithmeticException("El sistema no tiene solución única (determinante es cero)");
        }

        double x = ((c * e) - (b * f)) / det;
        double y = ((a * f) - (c * d)) / det;

        return new double[]{x, y};
    }

    /**
     * Calcula la ecuación de la recta (y = mx + b) dados dos puntos.
     * @return Un arreglo donde [0] es la pendiente (m) y [1] es el intercepto (b).
     */
    public double[] obtenerEcuacionRecta(double x1, double y1, double x2, double y2) {
        // Validación: Evitar división por cero (recta vertical)
        if (x1 == x2) {
            throw new ArithmeticException("No se puede calcular la pendiente: x1 y x2 son iguales (recta vertical).");
        }

        // Calcular pendiente (m = (y2 - y1) / (x2 - x1))
        double m = (y2 - y1) / (x2 - x1);

        // Calcular intercepto (b = y1 - m * x1)
        double b = y1 - (m * x1);

        return new double[]{m, b};
    }
}