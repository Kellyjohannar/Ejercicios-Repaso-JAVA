//Números primos hasta N.

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número");
        numero = scanner.nextInt();

        if (numero > 1) {

            int divisible = 0;
            
            for (int i = 1; i <= numero; i++) {

                if (numero % i == 0) {

                    divisible++;
                }
            }
            if (divisible == 2) {

                System.out.println("El número " + numero + " es un numero primo");
            } else {

                System.out.println("El número " + numero + " no es primo");
            }
        } else {
            System.out.println("El número ingresado no es primo");
        }
    }
}
