// Contador de números: cuenta cuántos números positivos, negativos y ceros recibe el usuario (hasta introducir -999).

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, contadorPositivo = 0, contadorNegativo = 0, contadorCero = 0;

        do {

            System.out.println("Introduce un número");
            numero = scanner.nextInt();

            if (numero < 0) {

                contadorNegativo++;

            } else if (numero > 0) {

                contadorPositivo++;

            } else {

                contadorCero++;
            }

        } while (numero != -999);

        System.out.println("Hay " + contadorNegativo + " numeros negativos.");
        System.out.println("Hay " + contadorPositivo + " numeros positivos.");
        System.out.println("Hay " + contadorCero + " Ceros.");
    }
}
