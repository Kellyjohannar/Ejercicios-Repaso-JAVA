package Ejercicios;

/*Suma de dos números: pide dos números por teclado y muestra su suma.*/

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, resultado;

        System.out.println("Introduce el primer número");
        numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número");
        numero2 = scanner.nextInt();

        resultado = numero1 + numero2;

        System.out.println("Es resultado de la suma de los dos números es " + resultado);
    }
}
