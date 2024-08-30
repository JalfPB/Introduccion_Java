package Ejercicios3;

import java.util.Scanner;

public class Ej6 {
    // Implementa un método para mostrar un menú de opciones, cuyas opciones serán
    // los ejercicios anteriores;
    // la última opción será para salir, debe pedir opciones hasta que se ponga
    // salir.
    static void saludo(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    static void calcularCubo(int n) {
        int cubo = (int) Math.pow(n, 3);
        System.out.println("El cubo de " + n + " es " + cubo);
    }

    static int multiplicar(int n1, int n2) {
        int total = n1 * n2;
        // System.out.println(" La multiplicacion de " + n1 + " * " + " n2 es: " +
        // total);
        return total;
    }

    static void tablaMultiplicar(int n) {
        int resul;
        for (int i = 1; i <= 10; i++) {
            resul = multiplicar(n, i);
            System.out.println(n + " * " + i + " = " + resul);
        }
    }

    static void esPar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " Es par");
        } else {
            System.out.println(n + " No es par");
        }
    }

    static void borrar(){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                /*No hacer nada*/
            }
        }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Elige opcion: ");
            System.out.println("1 - Saludo ");
            System.out.println("2 - Calcular cubo");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Tabla de multiplicar");
            System.out.println("5 - Comprobar par");
            System.out.println("6 - Salir");

            opcion = scanner.nextInt();

            borrar();
            System.out.println();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Introduce nombre ");
                    String nombre = scanner.nextLine();
                    saludo(nombre);
                    break;
                case 2:
                    System.out.println("Introduce numero a calcular cubo");
                    int n = scanner.nextInt();
                    calcularCubo(n);
                    break;
                case 3:
                    System.out.println("Introduce numeros a multiplicar");
                    int n1 = scanner.nextInt();
                    int n2 = scanner.nextInt();
                    System.out.println("Resultado: " + multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println("Introduce numero para calcular tabla de multiplicar");
                    int num = scanner.nextInt();
                    tablaMultiplicar(num);
                    break;
                case 5:
                    System.out.println("Introduce numero para comporbar par");
                    int comprobarPar = scanner.nextInt();
                    esPar(comprobarPar);
                default:
                    break;
            }
        } while (opcion != 6);

    }

    public static void main(String[] args) {
        menu();
    }

}
