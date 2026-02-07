//Invertir una cadena introducida por teclado.

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra, nuevaPalabra = "";

        System.out.println("Ingresa una palabra");
        palabra = scanner.next();

        for (int i = palabra.length() - 1; i >= 0; i--) {

            nuevaPalabra = nuevaPalabra + palabra.charAt(i);

        }

        System.out.println("Cadena invertida " + nuevaPalabra);

    }

}
