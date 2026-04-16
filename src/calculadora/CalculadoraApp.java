package calculadora;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnalisisLineal al = new AnalisisLineal();
        int opcion;

        do {
            System.out.println("\n--- Módulo de Análisis Lineal ---");
            System.out.println("1. Resolver Sistema de Ecuaciones 2x2");
            System.out.println("2. Obtener Ecuación de la Recta (y = mx + b)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            try {
                if (opcion == 1) {
                    System.out.println("Ingrese coeficientes (a, b, c, d, e, f):");
                    double[] res = al.resolverSistema2x2(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                            sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    System.out.println("Resultado: x = " + res[0] + ", y = " + res[1]);
                }
                else if (opcion == 2) {
                    System.out.println("Ingrese puntos (x1, y1, x2, y2):");
                    double[] res = al.obtenerEcuacionRecta(sc.nextDouble(), sc.nextDouble(),
                            sc.nextDouble(), sc.nextDouble());
                    String signo = (res[1] >= 0) ? " + " : " - ";
                    System.out.println("Ecuación: y = " + res[0] + "x" + signo + Math.abs(res[1]));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }
}