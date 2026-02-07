package Ejercicios;

//Contar vocales en una frase.

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra;
        int cantidadVocales = 0;

        System.out.println("Ingresa una palabra");
        palabra = scanner.next();

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

                cantidadVocales++;
            }

        }
        System.out.println("La palabra tiene " + cantidadVocales + " vocales");
    }
}
