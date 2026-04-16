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
}