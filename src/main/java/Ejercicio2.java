/*Área de un círculo: pide el radio y calcula el área.*/

import static java.lang.Math.PI;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio, area;

        System.out.println("Introduce radio del ciruculo");
        radio = scanner.nextDouble();

        area = PI * (radio * radio);

        System.out.println("El área del círculo es " + area);
    }
}
