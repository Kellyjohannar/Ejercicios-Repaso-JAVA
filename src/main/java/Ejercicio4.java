/*Número par o impar.*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingresa un número");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {

            System.out.println("El número es " + numero + " Par");

        } else {

            System.out.println("El número es " + numero + " Impar");

        }

    }

}
