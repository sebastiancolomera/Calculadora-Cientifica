package calculadora;

public class Geometria {

    public static double perimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
