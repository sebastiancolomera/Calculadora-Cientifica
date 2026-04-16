package calculadora;

public class OperacionesBasicas {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double[] resolverEcuacionCuadratica(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("El coeficiente 'a' no puede ser 0");
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            // Sin raíces reales
            return new double[0];
        }
        else if (discriminante == 0) {
            // Una raíz real (doble)
            double raiz = -b / (2 * a);
            return new double[]{raiz};
        }
        else {
            // Dos raíces reales distintas
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new double[]{raiz1, raiz2};
        }
    }
}