//Factorial de un número usando un bucle for.

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número");
        numero = scanner.nextInt();

        if (numero > 0) {

            int factorizacion = 1;

            for (int i = 1; i < numero; i++) {

                factorizacion = factorizacion * (i + 1);

            }

            System.out.println("el número factorizado es " + factorizacion);
        } else {

            System.out.println("No se pueden factorizar numeros negativos");

        }

    }

}
