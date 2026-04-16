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

    public static double areaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    public static double volumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public static double areaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static double areaCono(double radio, double altura) {
        double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        return Math.PI * radio * (radio + generatriz);
    }

    public static double volumenCono(double radio, double altura) {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3.0;
    }
}
//