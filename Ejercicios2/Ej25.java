package Ejercicios2;

import java.util.Scanner;

public class Ej25 {

    public static void main(String[] args) {
        //Escribir un algoritmo que calcule la suma de los n primeros números naturales, siendo n un número mayor que uno.
        Scanner scanner = new Scanner(System.in);
        int n, suma=0;

        System.out.println("Introduce numero objetivo");
        n = scanner.nextInt();

        for(int i = 1; i<n; i++){
            suma += n;
        }
        System.out.println("La suma de los primeros " + n + " numeros naturales es: " + suma);
    }

}
