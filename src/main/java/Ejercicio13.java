//Buscar un elemento dentro de un array (secuencial).

public class Ejercicio13 {

    public static void main(String[] args) {
        int elemento = 10;
        boolean elementoEncontrado = false;
        int[] elementos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < elementos.length; i++) {

            if (elemento == elementos[i]) {

                elementoEncontrado = true;

            }

        }

        if (elementoEncontrado == true) {

            System.out.println("El elemento fue encontrado");
        } else {

            System.out.println("El elemento no fue encontrado");
        }

    }
}
