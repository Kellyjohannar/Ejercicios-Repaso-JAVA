package Ejercicios;

//Media de un array de números reales.

public class Ejercicio12 {

    public static void main(String[] args) {

        int cantidadNumeros = 0;
        double[] numerosReales = {1.5, 2, 3.8, 5, 4.2, 7, 8.9};
        double sumaNumeros = 0;
        double media;

        for (int i = 0; i < numerosReales.length; i++) {

            cantidadNumeros++;

            sumaNumeros = sumaNumeros + numerosReales[i];

        }

        media = sumaNumeros / cantidadNumeros;

        System.out.println("La media de los números reales es " + media);
    }
}
