package Ejercicios;

// Tabla de multiplicar de un número introducido.

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Introduce el número del que quieres la tabla de multiplicar");
        numero = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {

            int multiplicacion = numero * i;

            System.out.println(numero + " X " + i + " = " + multiplicacion);
        }

    }
}
