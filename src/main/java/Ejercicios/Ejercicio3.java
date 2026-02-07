package Ejercicios;

/*Mayor de dos números: muestra cuál es mayor o si son iguales.*/

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingresa el primer número");
        numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número");
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {

            System.out.println("El número mayor es " + numero1);

        } else if (numero2 > numero1) {

            System.out.println("El número mayor es " + numero2);
        } else {

            System.out.println("Son Iguales");

        }

    }

}
