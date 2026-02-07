package Ejercicios;

//Array de 10 enteros: pedirlos y mostrar el mayor y el menor.

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int cantidadNumeros = 10;
        int[] numeros = new int[cantidadNumeros];
        

        for (int i = 0; i < cantidadNumeros; i++) {

            System.out.println("Ingresa un número");
            numeros[i] = scanner.nextInt();
        }

        int numeroMayor = 0, numeroMenor = numeros[0];

        for (int i = 0; i < cantidadNumeros; i++) {

            if (numeros[i] > numeroMayor) {

                numeroMayor = numeros[i];

            }

            if (numeros[i] < numeroMenor) {

                numeroMenor = numeros[i];
            }

        }

        System.out.println("El numero mayor es " + numeroMayor);
        System.out.println("El numero menor es " + numeroMenor);
    }

}
